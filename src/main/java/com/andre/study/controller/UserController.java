package com.andre.study.controller;

import com.andre.study.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;

@RestController
public class UserController {
    // @RequestMapping("/users/list")
    // @RequestMapping(value = {"/users/list", "/users-list"})
    @RequestMapping(value = {"/users/list", "/users-list"}, method = RequestMethod.GET)
    public User getUserList() {
        // return "Users List"; // Function Return should be String

        User user = new User(1, "Andre");
        return user;
    }

    @RequestMapping(value = {"/user/1"}, method = RequestMethod.GET)
    public User getUserById() {
        User user = new User(1, "Andre");
        return user;
    }

    @RequestMapping(value = {"/user/detail/1"}, method = RequestMethod.GET)
    public ResponseEntity<?> getUserDetailById() {
        User user = new User(1, "Andre");
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }

}
