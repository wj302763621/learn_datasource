package com.example.demo.db2.repository;

import com.example.demo.db2.mod.Demo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by wangjian on 2017/10/30.
 */
public interface DemoRepository extends JpaRepository<Demo,Long>{
}
