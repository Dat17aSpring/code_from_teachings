package com.example.demo;


import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PersonController {


    @GetMapping("/")
    public String index(@ModelAttribute String navn, Model model){

        System.out.println(navn);

        model.addAttribute("fornavn", navn);
        return "index";
    }

}
