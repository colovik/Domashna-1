package com.example.domasna2.web;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class register {
    @GetMapping
    public String show(HttpServletRequest request){
        return "register";
    }
    @PostMapping
    public String register(){
        return "redirect:/home";
    }
}
