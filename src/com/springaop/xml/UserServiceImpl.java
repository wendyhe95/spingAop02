package com.springaop.xml;

/**
 * Created by wendyhe on 2018/10/9.
 */
public class UserServiceImpl implements UserService {
    @Override
    public void addUser() {

        System.out.println("aspectj_xml addUser");
    }

    @Override
    public String updateUser() {

        System.out.println("aspectj_xml updateUser");
        // int i =1/0;
        return "hello";

    }

    @Override
    public void deleteUser() {

        System.out.println("aspectj_xml deleteUser");

    }
}
