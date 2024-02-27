package com.car.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller

public class HomeController {

    @GetMapping("/log")
    public String user() {
        return "log/index";
    }
    @GetMapping("/success")
    public String success() {
        return "log/success";
    }
}

