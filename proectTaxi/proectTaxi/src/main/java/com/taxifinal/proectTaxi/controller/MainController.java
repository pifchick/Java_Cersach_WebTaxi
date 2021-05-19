package com.taxifinal.proectTaxi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home( Model model) {
        model.addAttribute("title", "Закажи такси");
        return "home";
    }
    @GetMapping("/kontakt")
    public String kontakt( Model model) {
        model.addAttribute("title", "Наши контакты");
        return "kontakt";
    }

    @GetMapping("/maping")
    public String maping( Model model) {
        model.addAttribute("title", "Заказать такси");
        return "maping";
    }

}
