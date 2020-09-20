package com.andre.study.service;

import com.andre.study.enitty.User;
import com.andre.study.model.dto.UserDto;
import com.andre.study.model.mapper.UserMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserServiceImp implements UserService {
    // Khoi tao mot mang dong danh sach User
    private static ArrayList<User> userList = new ArrayList<User>();

    static {
        userList.add(new User(1,"andre", "andre@abc.net", "admin","123456"));
        userList.add(new User(2,"nelson", "nelson@abc.net", "admin", "xyzzyx"));
        userList.add(new User(3,"jason", "jason@abc.net", "user", "123123"));
        userList.add(new User(4,"thomas", "thomas@abc.net", "user", "thomasABC"));
        userList.add(new User(5,"mathew", "mathew@abc.net", "user", "mathewYYY"));
    };

    @Override
    public List<User> getListUser() {
        return userList;
    }

    // TODO Thong qua Mapper va Dto de wrapper data tra ve.
    @Override
    public List<UserDto> getListUserDto() {
        List<UserDto> listUserDto = new ArrayList<UserDto>();
        for (User user :  userList) {
            listUserDto.add(UserMapper.convertUserDto(user));
        }
        return listUserDto;
    }

    @Override
    public List<UserDto> getListUserDtoById(int id) {
        System.out.println(id);
        List<UserDto> listUserDto = new ArrayList<UserDto>();
        for (User user :  userList) {
            if (user.getId() == id) {
                listUserDto.add(UserMapper.convertUserDto(user));
            }
        }
        return listUserDto;
    }

    @Override
    public List<UserDto> getFilterUser(String role) {
        System.out.println("Filter params: " + role);
        List<UserDto> listUserDto = new ArrayList<UserDto>();
        for (User user :  userList) {
            System.out.println(user.getName() + " " +user.getRole());
            if (role.equals(user.getRole())) {
                System.out.println(user.getName() + " " +user.getRole());
                listUserDto.add(UserMapper.convertUserDto(user));
            }
        }
        return listUserDto;
    }


}
