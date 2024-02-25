package com.example.hyw;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/anons")
public class AnonsPageController {
    @GetMapping
    public String getPageHTMLAnons() {
        return "anons";
    }
}
