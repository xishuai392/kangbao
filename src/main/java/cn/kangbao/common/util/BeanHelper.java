package cn.kangbao.common.util;

import java.beans.PropertyDescriptor;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.PropertyUtils;

public class BeanHelper {

    /**
     * 支持对象间值拷贝（不同类型则以属性名相同时映射）
     *
     * @param orig
     * @param clazzT
     * @return
     */
    public static <T> T copy(Object orig, Class clazzT) {
        try {
            Object dest = clazzT.newInstance();

            if (orig == null) {
                return null;
            }

            PropertyDescriptor[] origDescriptors = PropertyUtils.getPropertyDescriptors(orig);
            for (int i = 0; i < origDescriptors.length; i++) {
                String name = origDescriptors[i].getName();
                if ("class".equals(name)) {
                    continue;
                }
                Object value = null;
                if (PropertyUtils.isReadable(orig, name) && PropertyUtils.isWriteable(dest, name)) {
                    value = PropertyUtils.getSimpleProperty(orig, name);
                    PropertyUtils.setSimpleProperty(dest, name, value);
                }
            }
            return (T) dest;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * List值拷贝
     *
     * @param origList
     * @param clazzT
     * @return
     */
    public static <T> List<T> copy(List origList, Class clazzT) {
        try {
            List destList = new ArrayList<T>();
            if (origList == null || origList.size() <= 0) {
                return null;
            }

            for (int i = 0; i < origList.size(); i++) {
                destList.add(copy(origList.get(i), clazzT));
            }
            return destList;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
