package com.springaop.aop03.factorybean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wendyhe on 2018/10/5.
 */
public class TestFactoryBean {

    @Test
    public void demo(){

        String xmlPath = "com/springaop/aop03/factorybean/beans.xml";

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);


        UserService userService = (UserService) applicationContext.getBean("proxyServiceId");
        userService.addUser();
        //userService.updateUser();
        //userService.deleteUser();
    }
}
