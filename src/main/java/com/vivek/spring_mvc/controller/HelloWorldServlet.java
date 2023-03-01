package com.vivek.spring_mvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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


    @RequestMapping("/register")
    public String getContact(){
        return "register";
    }

    @RequestMapping(value = "/processRegister",method = RequestMethod.POST)
    public String processRegisterForm(
            @RequestParam("username") String userName,
            @RequestParam("pwd") String password,
            @RequestParam("email") String email,
            @RequestParam("location") String location,Model model)
    {

        System.out.println(userName);
        System.out.println(password);
        System.out.println(email);
        System.out.println(location);
        model.addAttribute("user",userName);
       return "register_success";

    }

}

