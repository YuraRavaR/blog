package com.serv.blog.conrollers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//@Tag(name = "main_methods")
@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Main Page");
        return "home";
    }
    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "About us");
        return "about";
    }

}