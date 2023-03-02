package com.vivek.spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecondController {

    @RequestMapping("/central_exception")
    public String helloSecond(){
        String temp=null;
        temp.length();
        return "";
    }

}
