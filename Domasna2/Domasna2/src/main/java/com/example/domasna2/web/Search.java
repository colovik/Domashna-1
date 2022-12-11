package com.example.domasna2.web;

import com.example.domasna2.service.PharmacyService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/search")
public class Search {
    private final PharmacyService pharmacyService;

    public Search(PharmacyService pharmacyService) {
        this.pharmacyService = pharmacyService;
    }

    @GetMapping
    public String category(Model model, HttpServletRequest request){
        model.addAttribute("apteki",pharmacyService.findbyID(request.getParameter("searched")));
        return "SiteApteki";
    }
}
