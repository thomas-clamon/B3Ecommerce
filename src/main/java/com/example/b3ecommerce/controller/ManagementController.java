package com.example.b3ecommerce.controller;

import com.example.b3ecommerce.services.IMangementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("manage")
public class ManagementController {

    @Autowired
    private IMangementService service;

    @GetMapping("marge")
    public ResponseEntity marge(){
        return new ResponseEntity(service.marge(), HttpStatusCode.valueOf(200));
    }
}
