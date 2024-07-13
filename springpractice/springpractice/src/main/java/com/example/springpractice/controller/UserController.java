package com.example.springpractice.controller;

import com.example.springpractice.dto.UserDTO;
import com.example.springpractice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="api/v1/user")
@CrossOrigin

public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUser")
    public String getUser(){
        return "Kaveesha Hettige";
    }
    @PostMapping("/saveUser")
    public UserDTO saveUser(@RequestBody UserDTO userDTO){
        return userService.saveUser(userDTO);
    }

    @DeleteMapping("/removeUser")
    public String removeUser(){
        return "user removed!";
    }

    @PutMapping("/updateUser")
    public String updateUser(){
        return "user updated!";
    }

}
