package com.example.b3ecommerce.controller;

import com.example.b3ecommerce.dto.imput.IPProduitDto;
import com.example.b3ecommerce.services.IProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Produits")
public class ProduitController {

    @Autowired
    private IProduitService service;

    @PostMapping("create")
    public ResponseEntity create (@RequestBody IPProduitDto dto) {
        try {
            if (service.ajouterProduit(dto))
                return new ResponseEntity("Produit ajouté", HttpStatusCode.valueOf(200));
            else
                return new ResponseEntity("Produit non ajouté", HttpStatusCode.valueOf(400));
        }catch (IllegalArgumentException illegalArgumentException){
            return new ResponseEntity("Argument invalide", HttpStatusCode.valueOf(400));
        }


    }
}