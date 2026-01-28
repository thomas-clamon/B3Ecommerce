package com.example.b3ecommerce.controller;

import com.example.b3ecommerce.dto.imput.IPCommandeDto;
import com.example.b3ecommerce.services.CommandeService;
import com.example.b3ecommerce.services.ICommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Commande")
public class CommandeController {

    @Autowired
    private ICommandeService service;

    @PostMapping("create")
    public ResponseEntity create (@RequestBody IPCommandeDto dto)
    {

       if (service.Ajouter(dto))
           return new ResponseEntity("Commande ajouté", HttpStatusCode.valueOf(200));
       else
           return new ResponseEntity("Commande non ajouté", HttpStatusCode.valueOf(400));
    }

    @GetMapping("get/{ID}")
    public ResponseEntity get (@PathVariable String ID){

        Integer id = null;
        // on convertie notre chaine carractere en integer
        try {
            id = Integer.valueOf(ID);
        }catch (Exception e)
        {
        return new ResponseEntity("ID invalide", HttpStatusCode.valueOf(403));
        }
        return new ResponseEntity(service.get(id), HttpStatusCode.valueOf(200)) ;

    }
}
