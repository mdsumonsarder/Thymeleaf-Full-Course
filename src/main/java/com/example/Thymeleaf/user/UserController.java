package com.example.Thymeleaf.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/users")
public class UserController {

    @GetMapping
    public String getUsers(Model model){
        User user = new User("Sumon", "sumonsarder.cse@gmail.com", "ADMIN");
        model.addAttribute("user",user);
        return "user";

    }


}
