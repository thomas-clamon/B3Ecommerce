package com.example.b3ecommerce.services;

import com.example.b3ecommerce.dto.imput.IPProduitDto;
import com.example.b3ecommerce.entities.ProduitEntity;

public interface IProduitService {

    /**
     * Insere un produit en base
     * @param dto
     * @return
     */
    Boolean ajouterProduit(IPProduitDto dto);

    /**
     * Convertie mon DTO en entité
     * @param dto
     * @return
     */
    ProduitEntity toEntity(IPProduitDto dto);
}
