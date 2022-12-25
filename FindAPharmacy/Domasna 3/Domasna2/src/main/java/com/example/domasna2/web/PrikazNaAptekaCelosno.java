package com.example.domasna2.web;
import com.example.domasna2.model.Apteka;
import com.example.domasna2.service.AptekaService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/show")
public class PrikazNaAptekaCelosno {
    private final AptekaService aptekaService;

    public PrikazNaAptekaCelosno(AptekaService aptekaService){
        this.aptekaService=aptekaService;
    }

    @GetMapping("/prikaz/{id}")
    public String show (Model model, HttpServletRequest request, @PathVariable Long id){
        Apteka a = aptekaService.findbyId(id);
        float lon=a.getLon();
        float lat = a.getLat();
        model.addAttribute("so4",lat);
        model.addAttribute("so2",lon);

        request.getSession().setAttribute("apteka",a);
        return "showApteka";
    }
}
