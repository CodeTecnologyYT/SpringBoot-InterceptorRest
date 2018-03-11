package com.bryan.interceptorrest.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InterController {
    @RequestMapping(value="/greetings",method= RequestMethod.GET)
    public String getGreetings(){
        return "sucess";
    }
}
