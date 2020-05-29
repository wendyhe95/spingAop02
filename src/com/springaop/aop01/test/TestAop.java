package com.springaop.aop01.test;


import com.springaop.aop01.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wendyhe on 2018/10/8.
 */
public class TestAop {

    @Test
    public void demo(){


        String xmlPath ="com/springaop/beans.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

        //获得目标类
        UserService userService = (UserService) applicationContext.getBean("userServiceId");

        userService.addUser();
        userService.updateUser();
        userService.deleteUser();

    }
}

