package cn.kangbao.common.util;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import cn.kangbao.common.log.LoggerManager;

import net.sf.cglib.beans.BeanCopier;
import net.sf.cglib.core.Converter;

/**
 * bean操作辅助类，如对象拷贝等
 */
public class BeanUtils {

    public static final LoggerManager logger = LoggerManager.getLogger(BeanUtils.class.getName());

    // 拷贝实例map
    private static Map<String, BeanCopier> beanCopierMap = new ConcurrentHashMap<String, BeanCopier>();

    /**
     * 对象拷贝
     * 
     * @param source
     * @param target
     * @param overFlag ,true，覆盖原有值，false不覆盖，
     */
    public static void copyProperties(Object source, Object target, boolean overFlag) {
        // 组合主键
        String compKey = source.getClass().getName() + target.getClass().getName();
        BeanCopier copier = beanCopierMap.get(compKey);
        if (copier == null) {
            copier = BeanCopier.create(source.getClass(), target.getClass(), !overFlag);
            synchronized (beanCopierMap) {
                beanCopierMap.put(compKey, copier);
            }
        }
        Converter converter = null;
        // 不覆盖拷贝
        if (!overFlag) {
            converter = new CustomConverter(target);
        }
        copier.copy(source, target, converter);
    }

    /**
     * 默认全量拷贝
     * 
     * @param source
     * @param target
     */
    public static void copyProperties(Object source, Object target) {
        copyProperties(source, target, true);
    }

}
