package com.example.dailyplanner.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserResultController {

    @GetMapping("/calculator")
    public String calculateCalories() {

        return "calculator";
    }

    @GetMapping("/day_result")
    public String getUserCalories() {

        return "day_result";
    }
}
