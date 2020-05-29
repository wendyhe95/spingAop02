package com.springaop.aop03.cglib_proxy;

/**
 * @Author: 95
 * @Date: 2020/5/29
 */
public class MyAspect {

    public void before(){
        System.out.println("前置通知");
    }

    public void after(){
        System.out.println("后置通知");
    }
}
