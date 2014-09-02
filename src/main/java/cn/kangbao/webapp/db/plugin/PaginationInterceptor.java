package cn.kangbao.webapp.db.plugin;

import java.sql.Connection;
import java.util.Properties;

import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.RowBounds;

@Intercepts({
    @Signature(type = StatementHandler.class, method = "prepare", args = {
        Connection.class
    })
})
public class PaginationInterceptor implements Interceptor {

    // 日志对象
    // protected static Logger log =
    // LoggerFactory.getLogger(PaginationInterceptor.class);
    /*
     * (non-Javadoc)
     * @see org.apache.ibatis.plugin.Interceptor#intercept(org.apache.ibatis.plugin .Invocation)
     */
    // @Override
    // [start]
    public Object intercept(Invocation invocation) throws Throwable {

        StatementHandler statementHandler = (StatementHandler) invocation
                .getTarget();
        MetaObject metaStatementHandler = MetaObject.forObject(
                statementHandler, MetaObject.DEFAULT_OBJECT_FACTORY,
                MetaObject.DEFAULT_OBJECT_WRAPPER_FACTORY);
        RowBounds rowBounds = (RowBounds) metaStatementHandler
                .getValue("delegate.rowBounds");
        if (rowBounds == null || rowBounds == RowBounds.DEFAULT) {
            return invocation.proceed();

        }

        String originalSql = (String) metaStatementHandler
                .getValue("delegate.boundSql.sql");

        Configuration configuration = (Configuration) metaStatementHandler
                .getValue("delegate.configuration");

        Dialect.Type databaseType = null;
        try {
            databaseType = Dialect.Type.valueOf(configuration.getVariables()
                    .getProperty("dialect").toUpperCase());
        }
        catch (Exception e) {
            // ignore
        }
        if (databaseType == null) {
            throw new RuntimeException(
                    "the value of the dialect property in configuration.xml is not defined : "
                            + configuration.getVariables().getProperty(
                                    "dialect"));
        }
        Dialect dialect = null;
        switch (databaseType) {
            case ORACLE:
                dialect = new OracleDialect();
                break;
            case MYSQL:// 需要实现MySQL的分页逻辑
                dialect = new MySqlDialect();
                break;
            case SQLSERVER:
                dialect = new SqlServerDialect();
                break;
            default:
                dialect = new OracleDialect();
                break;
        }

        metaStatementHandler.setValue("delegate.boundSql.sql", dialect
                .getLimitString(originalSql, rowBounds.getOffset(),
                        rowBounds.getLimit()));
        metaStatementHandler.setValue("delegate.rowBounds.offset",
                RowBounds.NO_ROW_OFFSET);
        metaStatementHandler.setValue("delegate.rowBounds.limit",
                RowBounds.NO_ROW_LIMIT);
        return invocation.proceed();
    }

    /*
     * (non-Javadoc)
     * @see org.apache.ibatis.plugin.Interceptor#plugin(java.lang.Object)
     */
    // @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

    /*
     * (non-Javadoc)
     * @see org.apache.ibatis.plugin.Interceptor#setProperties(java.util.Properties)
     */
    // @Override
    public void setProperties(Properties arg0) {
        // TODO Auto-generated method stub

    }
    // [end]
}
