package com.example.b3ecommerce.services;

import com.example.b3ecommerce.dto.outpout.OPMargeDto;
import com.example.b3ecommerce.entities.CommandeEntity;

import java.util.List;

public interface IMangementService {

    OPMargeDto toDto (CommandeEntity entity);

    Double marge (List<CommandeEntity> entityList);

    Double marge ();
}
