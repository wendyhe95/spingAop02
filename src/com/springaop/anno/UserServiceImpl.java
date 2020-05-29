package com.springaop.anno;

import com.springaop.xml.UserService;
import org.springframework.stereotype.Service;

/**
 * Created by wendyhe on 2018/10/9.
 */

@Service("userServiceId")
public class UserServiceImpl implements UserService {
    @Override
    public void addUser() {

        System.out.println("aspectj_anno addUser");
    }

    @Override
    public String updateUser() {

        System.out.println("aspectj_anno updateUser");
       // int i =1/0;
        return "hello";

    }

    @Override
    public void deleteUser() {

        System.out.println("aspectj_anno deleteUser");

    }
}
