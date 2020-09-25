package com.andre.lifecycle.service;

import com.andre.lifecycle.mapper.UserMapper;
import com.andre.lifecycle.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;

@Service
public class UserMybatis {
    @Autowired
    private UserMapper userMapper;

    public List<User> findAllUsers()  {
        List<User> users = userMapper.findAllUsers();
        System.out.println(users);
        return users;
    }
}
