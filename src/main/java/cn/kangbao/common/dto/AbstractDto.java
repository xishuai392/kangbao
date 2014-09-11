package cn.kangbao.common.dto;

import java.lang.reflect.Field;

import cn.kangbao.common.util.EqualsUtil;
import cn.kangbao.common.util.HashCodeUtil;
import cn.kangbao.common.util.StringUtil;

/**
 * DTO 基础类
 * 
 * @author chen.weizheng
 * 
 */
public abstract class AbstractDto implements java.io.Serializable, java.lang.Cloneable {

    public AbstractDto() {
    }

    public AbstractDto copy() {
        try {
            return (AbstractDto) this.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    /**
     * 提供默认的HashCode算法 当前对象上自己定义的Field才会参与Hash值计算，不包含父类的Field
     * 
     * @author qiao.zhu<br>
     * @return int 返回哈希值<br>
     */
    @Override
    public int hashCode() {
        int result = 17;

        Field[] fieldList = this.getClass().getDeclaredFields();
        if (fieldList != null) {
            for (Field field : fieldList) {
                if (!field.isAccessible()) {
                    field.setAccessible(true);
                }
                try {
                    Object thisValue = field.get(this);
                    result = 37 * result + HashCodeUtil.hashCode(thisValue);
                } catch (IllegalArgumentException e) {
                    return super.hashCode();
                } catch (IllegalAccessException e) {
                    return super.hashCode();
                }
            }
        }

        return result;

    }

    /**
     * 判断两个对象是否相等 当前对象上自己定义的Field才会参与比较，不包含父类的Field
     * 
     * @author qiao.zhu<br>
     * @param obj
     *            要比较的对象
     * @return boolean 两个对象相等才会返回true，否则返回false
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (null == obj) {
            return false;
        }
        Field[] fieldList = this.getClass().getDeclaredFields();
        if (fieldList != null) {
            for (Field field : fieldList) {
                if (!field.isAccessible()) {
                    field.setAccessible(true);
                }
                try {
                    Object thisValue = field.get(this);
                    Object thatValue = field.get(obj);
                    if (!EqualsUtil.equals(thisValue, thatValue)) {
                        return false;
                    }
                } catch (IllegalArgumentException e) {
                    super.equals(obj);
                } catch (IllegalAccessException e) {
                    super.equals(obj);
                }
            }
        }

        return true;
    }

    /**
     * 重载toString()函数 当前对象上自己定义的Field才会被输出，不包含父类的Field
     * 
     * @author Zhang.Jinhua<br>
     * @return String 返回字符串
     */
    @Override
    public String toString() {
        StringBuffer returnStr = new StringBuffer();
        Field[] fieldList = this.getClass().getDeclaredFields();
        if (fieldList != null) {
            returnStr.append("Ojbect Value List :").append(System.getProperty("line.separator"));
            for (Field field : fieldList) {
                if (!field.isAccessible()) {
                    field.setAccessible(true);
                }
                returnStr.append(field.getName()).append(":[");
                String value;
                try {
                    value = StringUtil.toString(field.get(this));
                } catch (IllegalArgumentException e) {
                    value = "";
                } catch (IllegalAccessException e) {
                    value = "";
                }
                returnStr.append(value).append("]").append(System.getProperty("line.separator"));
            }
        }
        return returnStr.toString();
    }
}
