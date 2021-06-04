package com.dovezishka.taxi.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Главная страница");
        return "home";
    }
    @GetMapping("/kontact")
    public String kontact(Model model) {
        model.addAttribute("title", "Контакты");
        return "kontact";
    }
    @GetMapping("/maping")
    public String maping(Model model) {
        model.addAttribute("title", "Заказать такси");
        return "maping";
    }
}
