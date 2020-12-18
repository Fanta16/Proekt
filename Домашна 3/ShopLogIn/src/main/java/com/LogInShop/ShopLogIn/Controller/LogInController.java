package com.LogInShop.ShopLogIn.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LogInController {

    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @PostMapping("/login")
    public String Login2(){
        return "redirect:/register";
    }
    @GetMapping("/register")
    public String Register(){
        return "register";
    }
    @PostMapping("/register")
    public String Register2(){
        return "redirect:/login";
    }
}
