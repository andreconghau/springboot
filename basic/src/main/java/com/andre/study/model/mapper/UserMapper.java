package com.andre.study.model.mapper;

import com.andre.study.enitty.User;
import com.andre.study.model.dto.UserDto;

public class UserMapper {
    public static UserDto convertUserDto(User user) {
        UserDto tmpUser = new UserDto();
        tmpUser.setId(user.getId());
        tmpUser.setName(user.getName());
        tmpUser.setEmail(user.getEmail());
        tmpUser.setRole(user.getRole());
        System.out.println(tmpUser);
        return tmpUser;
    }
}
