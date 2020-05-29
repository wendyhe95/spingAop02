package com.springaop.anno;

import com.springaop.xml.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wendyhe on 2018/10/9.
 */
public class TestAspecAnno {

    @Test
    public void demo(){

        String xmlPath = "com/springaop/anno/beans.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

        UserService userService = (UserService) applicationContext.getBean("userServiceId");
        userService.addUser();
        userService.updateUser();
        userService.deleteUser();
    }
}
