package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController{

    @GetMapping("/")
    public String index(Model model) {

        model.addAttribute("message", "Hello Spring MVC 5!");
        model.addAttribute("target", "well done");
        return "index";
    }
}