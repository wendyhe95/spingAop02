package com.springaop.aop03.factorybean;


import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by wendyhe on 2018/10/5.
 * 切面类中确定通知 需要实现不同的接口
 * 接口就是规范 从而确定方法名称
 *
 *
 *  采用环绕通知MethodInterceptor
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
