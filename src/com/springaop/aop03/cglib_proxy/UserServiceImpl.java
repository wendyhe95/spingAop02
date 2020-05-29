package com.springaop.aop03.cglib_proxy;


/**
 * Created by wendyhe on 2018/10/5.
 */
public class UserServiceImpl implements UserService {


    @Override
    public void addUser() {

        System.out.println("cglib_proxy addUser");

    }

    @Override
    public void updateUser() {

        System.out.println("cglib_proxy updateUser");

    }

    @Override
    public void deleteUser() {

        System.out.println("cglib_proxy deleteUser");

    }
}
