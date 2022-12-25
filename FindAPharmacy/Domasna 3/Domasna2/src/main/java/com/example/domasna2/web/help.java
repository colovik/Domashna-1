package com.example.domasna2.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/help")
public class help {
    @GetMapping
    public String help(){
        return "help";
    }
}
