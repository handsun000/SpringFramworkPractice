package com.glowsoft.spring_test.controller3;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/controller3")
public class StudentController {

    @GetMapping("/studentForm")
    public String studentForm() {
        return "controller3/createPage";
    }

    @PostMapping("/student/create")
    public String studentCreate(@ModelAttribute("student") @Validated Student student, BindingResult result) {
        /*
            StudentValidator validator = new StudentValidator();
            validator.validate(student, result);
        */
        if (result.hasErrors()) {
            return "controller3/createPage";
        }

        return "controller3/createDonePage";
    }

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.setValidator(new StudentValidator());
    }
}
