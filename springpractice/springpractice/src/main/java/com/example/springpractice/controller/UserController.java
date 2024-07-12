package com.example.springpractice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="api/v1/user")
@CrossOrigin

public class UserController {

    @GetMapping("/getUser")
    public String getUser(){
        return "Kaveesha Hettige";
    }
    @PostMapping("/saveUser")
    public String saveUser(){
        return "user saved!";
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
