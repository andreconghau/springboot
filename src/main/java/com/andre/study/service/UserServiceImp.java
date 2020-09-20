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
        userList.add(new User(1,"andre", "andre@abc.net", "123456"));
        userList.add(new User(2,"nelson", "nelson@abc.net", "xyzzyx"));
        userList.add(new User(3,"jason", "jason@abc.net", "123123"));
        userList.add(new User(4,"thomas", "thomas@abc.net", "thomasABC"));
        userList.add(new User(5,"mathew", "mathew@abc.net", "mathewYYY"));
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


}
