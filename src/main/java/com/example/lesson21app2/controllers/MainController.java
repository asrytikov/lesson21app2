package com.example.lesson21app2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
/* GET c 2 параметрами
    @RequestMapping("/home")
    public String home(@RequestParam(required = false) String color,
                       @RequestParam(required = false) String name,
                       Model page){
        page.addAttribute("username", name);
        page.addAttribute("color", color);
        return "home.html";
    }
    */
@RequestMapping("/home/{color}")
public String home(@PathVariable String color,
                   Model page){
    page.addAttribute("username", "Ivan");
    page.addAttribute("color", color);
    return "home.html";
}
}
