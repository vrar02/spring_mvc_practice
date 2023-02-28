package com.vivek.spring_mvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldServlet{

    @RequestMapping("/")
    public String getIndexPage(){
        return "index";
    }

}

