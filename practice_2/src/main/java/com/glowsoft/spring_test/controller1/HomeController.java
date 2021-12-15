package com.glowsoft.spring_test.controller1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("data", "Hello, Spring from IntelliJ! :)");
        return "index";
    }
}
