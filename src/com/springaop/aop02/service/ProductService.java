package com.springaop.aop02.service;

import org.springframework.stereotype.Component;

/**
 * Created by wendyhe on 2018/9/26.
 */



@Component("s")
public class ProductService {

    public void doService() {
        System.out.println("product service");
    }
}
