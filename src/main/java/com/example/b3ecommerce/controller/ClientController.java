package com.example.b3ecommerce.controller;

import com.example.b3ecommerce.dto.imput.IPClientDto;
import com.example.b3ecommerce.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Clients")
public class ClientController {

    @Autowired
    ClientService service;

    @PostMapping("create")
    public ResponseEntity ajouter (@RequestBody IPClientDto dto){
        if (service.ajouterClient(dto))
        {
            return new ResponseEntity<>("Client ajouté", HttpStatusCode.valueOf(200));
        }
        else
            return new ResponseEntity<>("Client non ajouté", HttpStatusCode.valueOf(500));
    }

    @GetMapping("/get/{email}")
    public ResponseEntity get(@PathVariable String email){
        return new ResponseEntity(service.getClient(email), HttpStatusCode.valueOf(200));
    }
}
