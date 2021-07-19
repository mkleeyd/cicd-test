package test.cicdtest.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestConnectionController {

    @GetMapping("/")
    public String TestConnection(Model model){
        model.addAttribute("data", "spring!!!!!!!!!!!!!!!!!");
        return "test";
    }///

}///
