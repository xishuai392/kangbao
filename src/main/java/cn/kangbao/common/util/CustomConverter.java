package cn.kangbao.common.util;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.util.HashMap;
import java.util.Map;

import org.springframework.util.StringUtils;

import net.sf.cglib.core.Converter;
import cn.kangbao.common.log.LoggerManager;

/**
 * 转换器，对象拷贝使用
 */
public class CustomConverter implements Converter {

    public static final LoggerManager logger = LoggerManager.getLogger(CustomConverter.class);

    public Object target;

    public CustomConverter(Object target) {
        this.target = target;
    }

    @Override
    public Object convert(Object sourceValue, Class target, Object context) {

        if (context.toString().startsWith("set")) {
            String methodName = context.toString().replace(context.toString().substring(0, 3), "get");
            Map<String, PropertyDescriptor> getterMap = getPropertiesHelper(this.target.getClass());
            if (getterMap.containsKey(methodName)) {
                try {
                    Object targetValue = getterMap.get(methodName).getReadMethod().invoke(this.target, null);
                    if ((targetValue instanceof String) && (StringUtils.isEmpty((String) targetValue))) {// 是空字符串，才取源对象值覆盖
                        return sourceValue;
                    }
                    else if (StringUtils.isEmpty(targetValue)) {// 是空对象，才取源对象值覆盖
                        return sourceValue;
                    }
                    else {
                        return targetValue;
                    }
                }
                catch (Exception e) {
                    logger.error("reflect get value error:", e);
                }
            }
        }
        return sourceValue;
    }

    /**
     * 获取类的所有get方法
     * 
     * @param type
     * @return
     */
    private Map<String, PropertyDescriptor> getPropertiesHelper(Class type) {
        Map<String, PropertyDescriptor> propertyMap = new HashMap<String, PropertyDescriptor>();
        try {
            BeanInfo info = Introspector.getBeanInfo(type, Object.class);
            PropertyDescriptor[] all = info.getPropertyDescriptors();
            for (int i = 0; i < all.length; i++) {
                PropertyDescriptor pd = all[i];
                if (pd.getReadMethod() != null) {
                    propertyMap.put(pd.getReadMethod().getName(), pd);
                }
            }
        }
        catch (Exception e) {
            logger.error("reflect get value error:", e);
        }
        return propertyMap;
    }

}
