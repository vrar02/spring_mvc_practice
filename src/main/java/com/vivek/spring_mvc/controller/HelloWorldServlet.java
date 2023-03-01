package com.vivek.spring_mvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
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

    @RequestMapping("/second")
    public ModelAndView getSecond(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("name","vivek");
        modelAndView.addObject("time",new Date());
        modelAndView.setViewName("display_second");
        return  modelAndView;
    }

}

