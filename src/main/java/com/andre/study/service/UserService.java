package com.andre.study.service;

import com.andre.study.enitty.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public List<User> getListUser();
}
