package com.glowsoft.spring_test.controller2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/controller2")
public class HomeController2 {

    @GetMapping("/index")
    public String index() {
        return "controller2/index";
    }

    @GetMapping("/student")
    public String student(HttpServletRequest request, Model model) {

        String id = request.getParameter("id");
        model.addAttribute("studentId", id);

        return "controller2/student";
    }

    @PostMapping("/student")
    public String studentP(HttpServletRequest request, Model model) {

        String id = request.getParameter("id");
        model.addAttribute("studentId", id);

        return "controller2/student";
    }

    @GetMapping("/studentForm")
    public String studentForm() {
        return "controller2/studentForm";
    }

    @PostMapping("/studentView")
    public String studentView(@ModelAttribute("student") StudentInformation studentInformation) {
        return "controller2/studentView";
    }
}
