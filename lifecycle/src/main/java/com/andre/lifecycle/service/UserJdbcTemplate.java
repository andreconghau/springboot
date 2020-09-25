package com.andre.lifecycle.service;

import com.andre.lifecycle.model.User;
import com.andre.lifecycle.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserJdbcTemplate {
    // Demo JDBC template
    @Autowired
    private UserRepository userRepository;

    public List<User> findAllUser() {
        // Demo JDBC template
        List<User> users = userRepository.findAll();
        System.out.println(users);
        return users;
    }
}
