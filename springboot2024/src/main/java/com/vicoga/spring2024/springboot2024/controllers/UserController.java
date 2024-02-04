package com.vicoga.spring2024.springboot2024.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.vicoga.spring2024.springboot2024.models.User;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){
        User user = new User("vicente", "ogalde");

        model.addAttribute("title", "Hello spring 2024");
        model.addAttribute("user", user);
        return "details";
    }

}
