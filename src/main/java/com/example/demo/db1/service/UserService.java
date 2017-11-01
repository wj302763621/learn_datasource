package com.example.demo.db1.service;

import com.example.demo.db1.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wangjian on 2017/10/30.
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public int addUser(String name ,int age){
        return userMapper.addUser(name,age);
    }
}
