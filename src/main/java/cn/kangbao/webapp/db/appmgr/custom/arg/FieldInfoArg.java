package cn.kangbao.webapp.db.appmgr.custom.arg;

import java.io.Serializable;

import cn.kangbao.common.dto.AbstractDto;

public class FieldInfoArg extends AbstractDto implements Serializable {

    private static final long serialVersionUID = -6096992182467760057L;

    // 字段名称
    private String fieldName;

    // 字段值
    private Object fieldValue;

    // 数据类型
    private int fieldType;

    // 是否区分大小写
    private boolean caseSensitive = false;

    public FieldInfoArg() {
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String value) {
        this.fieldName = value;
    }

    public Object getFieldValue() {
        return fieldValue;
    }

    public int getFieldType() {
        return fieldType;
    }

    public void setFieldValue(Object fieldValue) {
        this.fieldValue = fieldValue;
    }

    public void setFieldType(int fieldType) {
        this.fieldType = fieldType;
    }

    public boolean isCaseSensitive() {
        return caseSensitive;
    }

    public void setCaseSensitive(boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
    }
}
