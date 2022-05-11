//package com.example.dailyplanner.controller;
//
//import com.example.dailyplanner.security.NoSuchUserException;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//
//@ControllerAdvice
//public class ExceptionController {
//
//    @ExceptionHandler(NoSuchUserException.class)
//    public String noUserException(NoSuchUserException e, Model model){
//        model.addAttribute("errorMessage",e.getMessage());
//        return "errorPage";
//    }
//}
