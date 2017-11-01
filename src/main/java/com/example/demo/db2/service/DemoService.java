package com.example.demo.db2.service;

import com.example.demo.db1.mapper.UserMapper;
import com.example.demo.db2.mapper.DemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wangjian on 2017/10/30.
 */
@Service
public class DemoService {

    @Autowired
    private DemoMapper demoMapper;

    public int addDemo(String name ,String address){
        return demoMapper.addUser(name,address);
    }
}
