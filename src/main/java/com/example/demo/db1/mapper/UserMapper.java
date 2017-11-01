package com.example.demo.db1.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

/**
 * Created by wangjian on 2017/10/30.
 */
@Service
public interface UserMapper {
    @Insert("insert into user value(null,#{name},#{age})")
    public int addUser(@Param("name")String name,@Param("age") int age);
}
