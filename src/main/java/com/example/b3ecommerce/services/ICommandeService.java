package com.example.b3ecommerce.services;

import com.example.b3ecommerce.dto.imput.IPCommandeDto;
import com.example.b3ecommerce.dto.outpout.OPCommandeDto;
import com.example.b3ecommerce.entities.CommandeEntity;

public interface ICommandeService {

    public Boolean Ajouter (IPCommandeDto dto);

    public CommandeEntity toEntity(IPCommandeDto dto);

    public OPCommandeDto get(Integer id);

    public OPCommandeDto toDto(CommandeEntity e);
}
