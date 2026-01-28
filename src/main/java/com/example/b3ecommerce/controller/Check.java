package com.example.b3ecommerce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Check")
public class Check {

    @GetMapping("test")
    public String test(){
        return "mon serveur fonctionne";
    }
}
