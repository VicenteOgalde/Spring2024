package com.vicoga.spring2024.springboot2024.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vicoga.spring2024.springboot2024.models.User;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details2")
    public Map<String,Object> details(){

        User user = new User("vicente", "ogalde");
        Map<String,Object> model= new HashMap<>();
        model.put("title", "Hello spring 2024");
        model.put("user", user);
        return model;
    }

}
