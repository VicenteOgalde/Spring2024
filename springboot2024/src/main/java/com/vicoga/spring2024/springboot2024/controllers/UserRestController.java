package com.vicoga.spring2024.springboot2024.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details2")
    public Map<String,Object> details(){
        Map<String,Object> model= new HashMap<>();
        model.put("title", "Hello spring 2024");
        model.put("name", "vicente");
        return model;
    }

}
