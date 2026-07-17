package com.bookmyseat.bookmyseat.controller;

import com.bookmyseat.bookmyseat.entity.User;
import com.bookmyseat.bookmyseat.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookmyseat/users")
public class UserController {
    private UserService userservice;

    public UserController(UserService userservice){
        this.userservice=userservice;
    }

    @GetMapping
    public List <User> getAllUser(){
        return userservice.getAllUser();
    }
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userservice.getUserById(id);
    }

    @PostMapping("/add")
    public User registerUser( @RequestBody User user){
        return userservice.registerUser(user);
    }

}
