package com.glowsoft.spring_test.controller1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/controller1")
public class SampleRequestMapping {

    @GetMapping("/board/view")
    public String view() {
        return "controller1/board/view";
    }
}
