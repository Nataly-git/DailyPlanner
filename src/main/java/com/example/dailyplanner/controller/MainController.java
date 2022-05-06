package com.example.dailyplanner.controller;

import com.example.dailyplanner.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MainController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String home(Model model) {

        return "home";
    }
}
