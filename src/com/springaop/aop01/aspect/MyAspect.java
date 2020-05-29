package com.springaop.aop01.aspect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by wendyhe on 2018/10/8.
 */
public class MyAspect implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {

        System.out.println("前置");

        //执行目标方法
        Object obj = methodInvocation.proceed();

        System.out.println("后置");

        return obj;
    }
}
