package com.vivek.spring_mvc.exceptions;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class MyGlobalExceptionHandler {

    //will be called exception happens anywhere in all controllers..
    @ExceptionHandler(NullPointerException.class)
    public String handleException(Model model){
        model.addAttribute("msg","from the global exception handler...null pointer exception");
        return "exception_page";
    }


}
