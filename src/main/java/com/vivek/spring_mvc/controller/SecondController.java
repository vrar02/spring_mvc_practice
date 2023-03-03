package com.vivek.spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SecondController {

    @RequestMapping("/central_exception")
    public String helloSecond(){
        String temp=null;
        temp.length();
        return "";
    }

    @RequestMapping("/test_interceptor")
    public String testInterceptor(@RequestParam("email")String email, Model model){
        model.addAttribute("email",email);
        return "success_interceptor";
    }
}