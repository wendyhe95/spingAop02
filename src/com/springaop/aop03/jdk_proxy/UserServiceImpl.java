package com.springaop.aop03.jdk_proxy;

/**
 * @Author: 95
 * @Date: 2020/5/29
 */
public class UserServiceImpl implements UserService {
    @Override
    public void addUser() {

        System.out.println("jdk_proxy addUser");

    }

    @Override
    public void updateUser() {

        System.out.println("jdk_proxy updateUser");

    }

    @Override
    public void deleteUser() {

        System.out.println("jdk_proxy deleteUser");

    }
}
