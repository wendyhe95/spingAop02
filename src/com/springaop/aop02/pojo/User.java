package com.springaop.aop02.pojo;

import org.springframework.stereotype.Component;

/**
 * Created by wendyhe on 2018/9/26.
 */
@Component("c")
public class User {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
