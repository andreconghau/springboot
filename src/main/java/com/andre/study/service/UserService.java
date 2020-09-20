package com.andre.study.service;

import com.andre.study.enitty.User;
import com.andre.study.model.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public List<User> getListUser();
    public List<UserDto> getListUserDto();
    public UserDto getListUserDtoById(int id);
    public List<UserDto> getFilterUser(String role);
    public List<UserDto> createUser(int id, String name);
}
