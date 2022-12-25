package com.example.domasna2.web;

import com.example.domasna2.service.AuthService;
import com.example.domasna2.model.Userr;
import com.example.domasna2.model.exceptions.InvalidUserCredentialsException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class Login {
    private final AuthService authService;


    public Login(AuthService authService) {
        this.authService = authService;
    }

    @GetMapping
    public String prikazi() {
        return "Login";
    }

    @PostMapping("/logiranje")
    public String login(HttpServletRequest request, Model model) {
        Userr user = null;
        try {
            user = this.authService.login(request.getParameter("username"), request.getParameter("password"));
            request.getSession().setAttribute("user", user);
            return "redirect:/home";
        } catch (InvalidUserCredentialsException exception) {
            model.addAttribute("hasError", true);
            model.addAttribute("error", "Wrong password or username");
            return "login";
        }
    }
    @GetMapping("/profile")
    public String profile(Model model){
        return "profile";
    }



}
