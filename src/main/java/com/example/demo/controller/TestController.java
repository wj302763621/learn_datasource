package com.example.demo.controller;

import com.example.demo.db1.mod.User;
import com.example.demo.db1.repository.UserRepository;
import com.example.demo.db1.service.UserService;
import com.example.demo.db2.mod.Demo;
import com.example.demo.db2.repository.DemoRepository;
import com.example.demo.db2.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;

/**
 * Created by wangjian on 2017/10/30.
 */
@RestController
public class TestController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private DemoRepository demoRepository;

    @Autowired
    private UserService userService;
    @Autowired
    private DemoService demoService;

    @RequestMapping("/test")
    @Transactional
    public String test(){

        userService.addUser("wangjian1",88);

//        int i= 1/0;

        demoService.addDemo("wangjiandemo","shpuw");
        return "success";



//        User user = userRepository.findOne(1L);
//        Demo demo = demoRepository.findOne(1L);
//
//
//        System.out.println(user.getId()+"|"+user.getUserName()+"|"+user.getUserPwd());
//        System.out.println(demo.getId()+"|"+demo.getName()+"|"+demo.getAddress());
//        return "success";
    }
}
