package com.andre.study.controller;

import com.andre.study.model.dto.UserDto;
import com.andre.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.andre.study.model.request.CreateUserReg;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api") // Group router
public class ApiUserController {
    // TODO Injection
    @Autowired
    public UserService userService;


    // TODO GET:api/users
    @GetMapping(value = {"/users"})
    public ResponseEntity<?> getUsers() {
        // TODO using get all fields.
        // List<User> userList = userService.getListUser();

        // TODO using get limit fields by DTO => without password field.
        List<UserDto> userList = userService.getListUserDto();

        return ResponseEntity.status(HttpStatus.OK).body(userList);
    }

    // TODO GET: api""/user/{id}
    @GetMapping("/user/{id}")
    public ResponseEntity<?> getUserById(@PathVariable int id) {
        UserDto userDetail = userService.getListUserDtoById(id);
        return ResponseEntity.status(HttpStatus.OK).body(userDetail);
    }

    // TODO GET: api""/users/filter?role=admin || user
    @GetMapping("/user/filter")
    public ResponseEntity<?> getFilterUser(@RequestParam(name="role", required = false, defaultValue = "user") String roleString) {
        List<UserDto> userDetail = userService.getFilterUser(roleString);
        return ResponseEntity.status(HttpStatus.OK).body(userDetail);
    }


    // TODO POST: api/user/create by FORM Part params
    @PostMapping("/user/create")
    public ResponseEntity<?> postUserCreate(@RequestParam int id, @RequestParam String name) {
        List<UserDto> userDetail = userService.createUser(id, name);
        return ResponseEntity.status(HttpStatus.OK).body(userDetail);
    }

    // TODO POST: api/user/new by Json Body
    @PostMapping("/user/new")
    public ResponseEntity<?> postUserNew(@Valid @RequestBody CreateUserReg req) {
        UserDto userCreated = userService.createUserRequest(req);
        return ResponseEntity.status(HttpStatus.OK).body(userCreated);
    }


    // TODO PUT: apo/user/{id}/edit
    // TODO DELETE: api/user/{id}
}
