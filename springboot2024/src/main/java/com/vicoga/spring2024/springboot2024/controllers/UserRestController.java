package com.vicoga.spring2024.springboot2024.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vicoga.spring2024.springboot2024.models.User;
import com.vicoga.spring2024.springboot2024.models.dto.UserDto;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details2")
    public UserDto details(){
        UserDto userDto =  new UserDto();

        User user = new User("vicente", "ogalde");
       
        userDto.setUser(user);
        userDto.setTitle("Hello spring 2024");

        return userDto;
    }

}
