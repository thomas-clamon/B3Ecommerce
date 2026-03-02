package com.example.b3ecommerce.services;

import com.example.b3ecommerce.dto.imput.IPClientDto;
import com.example.b3ecommerce.dto.outpout.OPClientDto;
import com.example.b3ecommerce.dto.outpout.OPClientProfileDto;
import com.example.b3ecommerce.entities.ClientEntity;

public interface IClientService {

    Boolean ajouterClient(IPClientDto dto);

    ClientEntity toEntity (IPClientDto dto);

    /**
     * Renvoi le Dto de sortie a partir du mail
     * @param email
     * @return
     */
    OPClientDto getClient(String email);

    /**
     * Renvoi le DTO de sortie a partir de l'entité
     * @param entity
     * @return
     */
    OPClientDto entytoDto(ClientEntity entity);

    /**
     * Fonction qui renvoit l'age d'un utilisateur
     * @param email
     * @return
     */
    Integer Age( String email);

    Integer nbCommande (String email);

    OPClientProfileDto getDto(String email);


}
