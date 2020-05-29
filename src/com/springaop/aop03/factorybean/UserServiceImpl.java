package com.springaop.aop03.factorybean;

/**
 * Created by wendyhe on 2018/10/5.
 */
public class UserServiceImpl implements UserService {


    @Override
    public void addUser() {

        System.out.println("factory bean addUser");

    }

    @Override
    public void updateUser() {

        System.out.println("factory bean updateUser");

    }

    @Override
    public void deleteUser() {

        System.out.println("factory bean deleteUser");

    }
}
