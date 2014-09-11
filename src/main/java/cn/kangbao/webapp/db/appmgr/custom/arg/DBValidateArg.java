package cn.kangbao.webapp.db.appmgr.custom.arg;

import java.io.Serializable;
import java.util.List;

public class DBValidateArg implements Serializable {

    private static final long serialVersionUID = -6385962807357600331L;

    private String tableName;

    private List<FieldInfoArg> verifyFieldList;

    private List<FieldInfoArg> keyFieldList;

    public DBValidateArg() {
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public List<FieldInfoArg> getVerifyFieldList() {
        return verifyFieldList;
    }

    public void setVerifyFieldList(List<FieldInfoArg> verifyFieldList) {
        this.verifyFieldList = verifyFieldList;
    }

    public List<FieldInfoArg> getKeyFieldList() {
        return keyFieldList;
    }

    public void setKeyFieldList(List<FieldInfoArg> keyFieldList) {
        this.keyFieldList = keyFieldList;
    }

    public String getTableName() {
        return tableName;
    }

}
