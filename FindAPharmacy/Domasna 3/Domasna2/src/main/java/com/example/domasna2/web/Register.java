package com.example.domasna2.web;

import com.example.domasna2.model.exceptions.InvalidArgumentsException;
import com.example.domasna2.model.exceptions.PasswordsDoNotMatchException;
import com.example.domasna2.service.AuthService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/register")
public class Register {
    private final AuthService authService;
    public Register(AuthService authService){
        this.authService=authService;
    }

    @GetMapping
    public String prikazi(HttpServletRequest request, @RequestParam(required = false)String error, Model model){
        if (error != null && !error.isEmpty()){
            model.addAttribute("hasError",true);
            model.addAttribute("error",error);
        }
        return "Register";
    }

    @PostMapping
    public String register(@RequestParam String username,
                           @RequestParam String password,
                           @RequestParam String repeatedPassword,
                           @RequestParam String name,
                           @RequestParam String surname,
                           @RequestParam String telefon,
                           @RequestParam String pol,
                           @RequestParam String email) {
        try {
            System.out.println(pol);
            this.authService.register(username, password, repeatedPassword, name, surname, telefon, pol, email);
            return "redirect:/login";
        } catch (InvalidArgumentsException | PasswordsDoNotMatchException exception) {
            return "redirect:/register?error=" + "Корисничкото име не постои ";
        }
    }
    }
