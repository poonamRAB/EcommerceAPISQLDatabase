package com.geekster.EcommerceAPI.controller;

import com.geekster.EcommerceAPI.model.User;
import com.geekster.EcommerceAPI.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    //create user
    @PostMapping("users")
    public String createUser(@RequestBody User user){
        return userService.createUser(user);
    }
    //get user by Id
    @GetMapping("user/{userId}")
    public User getUserByUserId(@PathVariable Long userId){
        return userService.getUserByUserId(userId);
    }
}
