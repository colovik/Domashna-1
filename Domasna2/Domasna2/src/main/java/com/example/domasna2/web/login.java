package com.example.domasna2.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class login {
    @GetMapping
    public String show(){
        return "login";
    }

    @PostMapping("/logiranje")
    public String login(){
        return "redirect:/home";
    }

}
