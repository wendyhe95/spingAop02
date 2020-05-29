package com.springaop.aop03.cglib_proxy;


import org.junit.Test;

/**
 * Created by wendyhe on 2018/10/5.
 */
public class TestCglib {

    @Test
    public void demo1(){

        UserServiceImpl userService = MyBeanFactory.createService();

        userService.addUser();
        //userService.updateUser();
        //userService.deleteUser();
    }
}
