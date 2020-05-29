package com.springaop.aop03.jdk_proxy;

import org.junit.Test;

/**
 * Created by wendyhe on 2018/10/5.
 */
public class TestJDK {

    @Test
    public void demo(){
        UserService userService = MyBeanFactory.createService();
        userService.addUser();
//        userService.updateUser();
//        userService.deleteUser();
    }
}
