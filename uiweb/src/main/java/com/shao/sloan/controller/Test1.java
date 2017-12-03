package com.shao.sloan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/test")
public class Test1 {

    @RequestMapping(value = "/login")
    public String getLogin(){
       return "login";
    }

    @RequestMapping(value = "/bootstrap")
    public String getBotstrap(){
        return "bootstrap";
    }
}
