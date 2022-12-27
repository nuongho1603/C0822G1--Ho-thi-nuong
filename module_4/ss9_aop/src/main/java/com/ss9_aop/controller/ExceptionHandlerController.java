package com.ss9_aop.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerController {
    @ExceptionHandler(NullPointerException.class)
    public String errorPage2(){
        return "errorPage2";
    }
    @ExceptionHandler(Exception.class)
    public String errorPage(){
        return "errorPage";
    }

}
