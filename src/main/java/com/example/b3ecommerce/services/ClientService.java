package com.example.b3ecommerce.services;

import com.example.b3ecommerce.dto.imput.IPClientDto;
import com.example.b3ecommerce.dto.outpout.OPClientDto;
import com.example.b3ecommerce.entities.ClientEntity;
import com.example.b3ecommerce.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Period;

@Service
public class ClientService implements IClientService{

    @Autowired
    public ClientRepository repository;

    @Override
    public Boolean ajouterClient(IPClientDto dto) {
        try {
            repository.saveAndFlush(toEntity(dto));
            return true;
        } catch (Exception sqlException){
            System.out.println(sqlException.getMessage());
            return false;
        }
    }

    @Override
    public ClientEntity toEntity(IPClientDto dto) {
        ClientEntity entity = new ClientEntity();
        entity.setEmail(dto.getEmail());
        entity.setNom(dto.getNom());
        entity.setAddresse(dto.getAddresse());
        entity.setPrenom(dto.getPrenom());
        entity.setDate_naissance(dto.getDate_naissance());
        return  entity;
    }

    @Override
    public OPClientDto getClient(String email) {
        return entytoDto(repository.findById(email).get());
    }

    @Override
    public OPClientDto entytoDto(ClientEntity entity) {
        // on calcule un Dto vide
        OPClientDto resultat = new OPClientDto();

        // on calcule le nom complet du client
        String complete_name = (entity.getPrenom() + " " + entity.getNom()).toUpperCase();
        resultat.setClient(complete_name);

        // on calcule l'age
        Integer age = Period.between(entity.date_naissance, LocalDate.now()).getYears();
        resultat.setAge(age);
        return resultat;
    }
}
