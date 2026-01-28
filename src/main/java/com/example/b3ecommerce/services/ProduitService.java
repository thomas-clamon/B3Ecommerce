package com.example.b3ecommerce.services;

import com.example.b3ecommerce.dto.imput.IPProduitDto;
import com.example.b3ecommerce.entities.ProduitEntity;
import com.example.b3ecommerce.enumeration.TypeProduit;
import com.example.b3ecommerce.repositories.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class ProduitService implements IProduitService{

    @Autowired
    private ProduitRepository repository;

    @Override
    public Boolean ajouterProduit(IPProduitDto dto) {
        try {
            repository.saveAndFlush(toEntity(dto));
            return true;
        } catch (IllegalArgumentException exception){
            throw new IllegalArgumentException("Type invalide");
        }
    }

    @Override
    public ProduitEntity toEntity(IPProduitDto dto) throws IllegalArgumentException {

        ProduitEntity entity = new ProduitEntity();

        entity.setNom(dto.getNom());
        entity.setPrix(dto.getPrix());

        // on convertie le string en type produit;
        entity.setType(TypeProduit.valueOf(dto.getType_produit()));
        return entity;
    }
}