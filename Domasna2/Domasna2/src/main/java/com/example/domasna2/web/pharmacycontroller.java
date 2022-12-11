package com.example.domasna2.web;
import com.example.domasna2.service.PharmacyService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/home")

public class pharmacycontroller {
    private final PharmacyService pharmacyService;

    public pharmacycontroller(PharmacyService pharmacyService){
        this.pharmacyService = pharmacyService;
    }

@GetMapping
    public String addBallonPage(Model model, @RequestParam(required = false) String search, HttpSession session, HttpServletRequest req){
        if (search==null){
            String myIP = req.getLocalAddr();
            System.out.println(myIP);
            session.invalidate();

            return "home";
        }
        else {
            session.setAttribute("koj",search);

            model.addAttribute("apteki",pharmacyService.findbyID(search));
            return "SiteApteki";
        }
}

@GetMapping("/apteki")
    public String SiteApteki(Model model, @RequestParam(required = false) String search, HttpSession request){
        if (search==null){
            request.invalidate();
            model.addAttribute("apteki",pharmacyService.findallpharmacies());

            return "SiteApteki";
        }
        else {
            request.setAttribute("koj",search);
            model.addAttribute("apteki",pharmacyService.findbyID(search));
            return "SiteApteki";
        }
}
}
