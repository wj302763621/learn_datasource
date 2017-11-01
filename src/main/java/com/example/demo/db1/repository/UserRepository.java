package com.example.demo.db1.repository;

import com.example.demo.db1.mod.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by wangjian on 2017/10/30.
 */
public interface UserRepository extends JpaRepository<User,Long> {
}
