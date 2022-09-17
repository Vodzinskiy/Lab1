package com.example.lab1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/")
    @ResponseBody
    public String hello(){
        return "created by student of group IO-04: \n Vodzinskiy Roman \n Voznytsia Dmitro \n Neroda Arsen";
    }
}
