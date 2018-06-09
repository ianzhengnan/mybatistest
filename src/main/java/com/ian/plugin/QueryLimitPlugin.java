package com.ian.plugin;

import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;

import java.sql.Connection;
import java.util.Properties;

@Intercepts({@Signature(
        type = StatementHandler.class,  // 需要植入plugin的类
        method = "prepare", // 需要替代的方法
        args = { Connection.class } // 方法对应的参数
)})
public class QueryLimitPlugin implements Interceptor {

    private int limit;
    private String dbType;

    private static final String LMT_TABLE_NAME = "limit_Table_Name_Xxx";

    public Object intercept(Invocation invocation) throws Throwable {
        StatementHandler statementHandler = (StatementHandler) invocation.getTarget();
        MetaObject metaStmtHandler = SystemMetaObject.forObject(statementHandler);
        while(metaStmtHandler.hasGetter("h")){
            Object object = metaStmtHandler.getValue("h");
            metaStmtHandler = SystemMetaObject.forObject(object);
        }
        while (metaStmtHandler.hasGetter("target")){
            Object object = metaStmtHandler.getValue("target");
            metaStmtHandler = SystemMetaObject.forObject(object);
        }
        String sql = (String) metaStmtHandler.getValue("delegate.boundSql.sql");
        String limitSql;

        if ("mysql".equals(this.dbType) && sql.indexOf(LMT_TABLE_NAME) == -1){
            sql = sql.trim();
            limitSql = "select * from (" + sql + ") " + LMT_TABLE_NAME + " limit " + limit;
            metaStmtHandler.setValue("delegate.boundSql.sql", limitSql);
        }
        return invocation.proceed();
    }

    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

    public void setProperties(Properties properties) {
        String strLimit = properties.getProperty("limit", "50");
        this.limit = Integer.parseInt(strLimit);
        this.dbType = properties.getProperty("dbtype", "mysql");
    }
}
