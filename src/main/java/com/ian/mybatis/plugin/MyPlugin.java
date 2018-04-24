package com.ian.mybatis.plugin;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;

import java.util.Properties;

@Intercepts({@Signature(
        type = Executor.class,
        method = "update",
        args = {MappedStatement.class, Object.class}
)})
public class MyPlugin implements Interceptor {

    Properties props = null;

    public Object intercept(Invocation invocation) throws Throwable {
        System.err.println("before.....");
        Object obj = invocation.proceed();
        System.err.println("after.....");
        return obj;
    }

    public Object plugin(Object target) {
        System.err.println("调用生成代理对象....." + target);
        return Plugin.wrap(target, this);
    }

    public void setProperties(Properties properties) {
        System.err.println(properties.get("dbType"));
        this.props = properties;
    }
}
