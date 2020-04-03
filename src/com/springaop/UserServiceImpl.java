package com.springaop;

import com.springaop.UserService;

/**
 * Created by wendyhe on 2018/10/8.
 */
public class UserServiceImpl implements UserService {
    @Override
    public void addUser() {
        System.out.println("addUser");
    }

    @Override
    public void updateUser() {
        System.out.println("updateUser");

    }

    @Override
    public void deleteUser() {
        System.out.println("deleteUser");

    }
}
