package com.andre.lifecycle.mapper;

import com.andre.lifecycle.model.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserMapper {
    void insertUser(User user);
    User findUserById(Integer id);
    List<User> findAllUsers();
}
