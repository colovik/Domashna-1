package com.example.domasna2.web;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/logout")
public class logout {
    @GetMapping
    public String odjavi(HttpSession httpSession){
        httpSession.setAttribute("user",null);

        return "redirect:/home";
    }
}
