package com.vicoga.spring2024.springboot2024.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){
        model.addAttribute("title", "Hello spring 2024");
        model.addAttribute("name", "vicente");
        return "details";
    }

}