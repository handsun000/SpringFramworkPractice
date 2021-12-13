package springBootJsp.springBootJsp.controllerex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JspController {

    @RequestMapping("/")
    public String home() {
        return "jsp01/hello";
    }

    @RequestMapping("heading")
    public String heading() {
        return "jsp01/heading";
    }

    @RequestMapping("fontSize")
    public String fontSize() {
        return "jsp01/fontSize";
    }

    @RequestMapping("date")
    public String date() {
        return "jsp01/date";
    }

    @RequestMapping("array")
    public String array() {
        return "jsp01/array";
    }



}
