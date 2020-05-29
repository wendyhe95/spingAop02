package com.springaop.aop02.test;

import com.springaop.aop02.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wendyhe on 2018/9/26.
 */
public class Test {

    public static void main(String[] args){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        ProductService productService = (ProductService) context.getBean("s");
        productService.doService();
    }
}

