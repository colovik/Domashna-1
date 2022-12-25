package com.example.domasna2.web;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JazikController {
    @GetMapping("jazik/en")
    public String smenijazik(HttpSession httpServletRequest){
        httpServletRequest.setAttribute("en",1);

        return "home";
    }
    @GetMapping("jazik/mk")
    public String smenijaziks(HttpSession httpServletRequest){
        httpServletRequest.setAttribute("en",null);

        return "home";
    }


}
