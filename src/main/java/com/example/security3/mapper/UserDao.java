package com.example.security3.mapper;

import com.example.security3.entity.po.SysUser;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    SysUser findByUserName(String username);
}
