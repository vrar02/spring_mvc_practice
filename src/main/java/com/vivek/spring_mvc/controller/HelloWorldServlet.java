package com.vivek.spring_mvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloWorldServlet{

    @RequestMapping("/")
    public String getIndexPage(){
        return "index";
    }

    @RequestMapping("/first")
    public String getFirst(Model model){

        model.addAttribute("first_key","first_value");
        List<String> friends=new ArrayList<>(List.of("vivek","ravi","sai"));
        model.addAttribute("friendsList",friends);
        return "display_first";
    }

}

