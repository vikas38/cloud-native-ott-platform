package com.ss.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public boolean login(){
        System.out.println("Logedin SuccessFully");
        return true;
    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello World...!";
    }
}
