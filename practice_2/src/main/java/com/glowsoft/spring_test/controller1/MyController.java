package com.glowsoft.spring_test.controller1;

import com.glowsoft.spring_test.controller1.data.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/controller1")
public class MyController {

    @GetMapping("/view")
    public String view() {
        return "controller1/view";
    }

    @GetMapping("/content/contentView")
    public String contentView(Model model) {

        model.addAttribute("id", "spring");

        return "controller1/content/contentView";
    }

    @GetMapping("/model/modelEx")
    public String modelEx(Model model) {

        model.addAttribute("data", "SpringFramework");

        return "controller1/model/modelEx";
    }

    @GetMapping("/modelAndView/modelView")
    public ModelAndView modelAndView() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("id", "modelAndView");
        mv.setViewName("controller1/modelAndView/modelView");
        return mv;
    }

    @GetMapping("/member/memberView")
    public String viewMember(HttpServletRequest httpServletRequest, Model model) {

        String id = httpServletRequest.getParameter("id");
        String pw = httpServletRequest.getParameter("pw");

        model.addAttribute("id", id);
        model.addAttribute("pw", pw);

        return "controller1/member/memberView";
    }

    @GetMapping("/member/confirm")
    public String memberConfirm(@RequestParam("id") String id, @RequestParam("pw") String pw, Model model) {
        model.addAttribute("id", id);
        model.addAttribute("pw", pw);

        return "controller1/member/confirm";
    }

    @GetMapping("/join/formOk")
    public String memberJoin(Member member) {

        return "controller1/join/formOk";
    }
}
