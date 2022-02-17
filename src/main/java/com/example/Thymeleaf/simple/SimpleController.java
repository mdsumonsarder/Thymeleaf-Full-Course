package com.example.Thymeleaf.simple;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/simple")
public class SimpleController {

    @GetMapping
    public String messageShow(Model model)
    {
        model.addAttribute("message", "Simple Message Show!");
        return "index";
    }

}
