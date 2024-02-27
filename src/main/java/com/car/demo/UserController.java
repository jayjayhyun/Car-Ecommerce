package com.car.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;


@Controller
public class UserController {

    @PostMapping("/index")
    public String login(String username, String password, Model model) {
        // Check if username and password are valid
        if ("jay".equals(username) && "cat".equals(password)) {
            // Redirect to a new page if credentials are valid
            return "redirect:/success";
        } else {
            // Add an error message to display on the login page
            model.addAttribute("error", "Invalid username or password. Please try again.");
            model.addAttribute("username", "");
            model.addAttribute("password", "");
            return "user/index";  // <-- Updated path
            
        }
    }
}