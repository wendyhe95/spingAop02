package com.springaop.aop03.jdk_proxy;

/**
 * Created by wendyhe on 2018/10/5.
 * 切面类
 */
public class MyAspect {

    public void before(){
        System.out.println("前置通知");
    }

    public void after(){
        System.out.println("后置通知");
    }
}
