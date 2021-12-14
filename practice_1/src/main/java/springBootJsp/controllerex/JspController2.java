package springBootJsp.springBootJsp.controllerex;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class JspController2 {

    @GetMapping("/radioForm")
    public String radioForm() {
        return "jsp02/radioForm";
    }

    @PostMapping("/radioSave")
    public String radio(Model model, @RequestParam("name") String name, @RequestParam("gender") String gender) {
        model.addAttribute("name", name);
        model.addAttribute("gender", gender);
        return "jsp02/radio";
    }

    @GetMapping("/check")
    public String check() {
        return "jsp02/check";
    }

    @PostMapping("/checkSave")
    public String checkSave(@RequestParam(value = "fruits", defaultValue = "체크하러가") String fruits, Model model) {
        model.addAttribute("fruits", fruits);


        return "jsp02/checkSave";
    }

    @GetMapping("/button")
    public String button() {
        return "jsp02/button";
    }

    @PostMapping("/button1Save")
    public String buttonSave(@RequestParam("price") int price,
                             @RequestParam("amount") int amount,
                             Model model) {
        int money = price*amount;
        model.addAttribute("price", price);
        model.addAttribute("amount", amount);
        model.addAttribute("money", money);

        return "jsp02/buttonSave";
    }
}
