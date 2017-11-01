package com.example.demo.db2.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

/**
 * Created by wangjian on 2017/10/30.
 */
@Service
public interface DemoMapper {
    @Insert("insert into demo value(null,#{name},#{address})")
    public int addUser(@Param("name") String name, @Param("address") String address);
}
