package com.example.dailyplanner.controller;

import com.example.dailyplanner.entity.Product;
import com.example.dailyplanner.entity.User;
import com.example.dailyplanner.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserProductController {

    @Autowired
    private UserService userService;


    @GetMapping("/day_result")
    public String getUserCalories() {

        return "day_result";
    }

    @PostMapping("/{id}")
    public String addProductToUser(@PathVariable("id") int id, @ModelAttribute("user") User user, Product product, Model model) {
        userService.addProductToUser(id, product);
        model.addAttribute("product", product);
        model.addAttribute("user", userService.getUser(id));
        return "redirect:/products";
    }

    @GetMapping("/{id}/calculator")
    public String addProduct(@PathVariable("id") int id, Model model) {
        model.addAttribute("user", userService.getUser(id));
        return "calculator";
    }
}
