package cn.kangbao.webapp.db.plugin;

public abstract class Dialect {  
	  
    public static enum Type{  
        MYSQL,
        SQLSERVER,
        ORACLE  
    }  
      
    public abstract String getLimitString(String sql, int skipResults, int maxResults);  
      
}  
