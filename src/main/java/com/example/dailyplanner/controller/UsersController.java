package com.example.dailyplanner.controller;

import com.example.dailyplanner.entity.Role;
import com.example.dailyplanner.entity.User;
import com.example.dailyplanner.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.BindingResult;

import javax.validation.Valid;
import java.util.Collections;

@Controller
@RequestMapping("/users")
public class UsersController {

    private UserService userService;

    @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String index(Model model){
        model.addAttribute("users", userService.getAllUsers());
        return "index";
    }

    @GetMapping("/{id}")
    public String showUser(@PathVariable("id") int id, Model model) {
        model.addAttribute("user", userService.getUser(id));
        return "show";
    }

//    @GetMapping("/new")
//    public String newUser(@ModelAttribute("user") User user) {
//        return "new";
//    }
//
//    @PostMapping
//    public String create(@ModelAttribute("user") @Valid User user, BindingResult bindingResult) {
//        if(bindingResult.hasErrors())
//            return "new";
//        user.setRole(Role.USER);
//        userService.saveUser(user);
//        return "redirect:/login";
//    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable("id") int id, Model model) {
        model.addAttribute("user", userService.getUser(id));
        return "edit";
    }

    @PostMapping("/{id}")
    public String update(@PathVariable("id") int id, @ModelAttribute("user") @Valid User user,
                         BindingResult bindingResult) {
        if(bindingResult.hasErrors())
            return "edit";
        userService.saveUser(user);
        return "redirect:/users";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") int id) {
        userService.deleteUser(id);
        return "redirect:/users";
    }
}
