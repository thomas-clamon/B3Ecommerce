package com.example.b3ecommerce.services;

import com.example.b3ecommerce.dto.outpout.OPMargeDto;
import com.example.b3ecommerce.entities.CommandeEntity;
import com.example.b3ecommerce.repositories.CommandeRepository;
import com.example.b3ecommerce.repositories.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MangementService implements IMangementService{

    @Autowired
    private CommandeRepository commandeRepository;

    @Autowired
    ProduitRepository produitRepository;

    @Override
    public OPMargeDto toDto(CommandeEntity entity) {

        OPMargeDto dto = new OPMargeDto();
        Float tva = entity.getPrix_total() - entity.getPrix_vente();
        dto.setTva(tva);

        // on calule la marge
        Float marge = (float) (entity.getProduit().getPrix() - entity.getPrix_total());
        dto.setMarge(marge);

        Float margeBrut = (float) (entity.getProduit().getPrix() - entity.getPrix_total() - entity.getPrix_vente());
        dto.setMargeBrut(margeBrut);

        return dto;

    }

    @Override
    public Double marge(List<CommandeEntity> entityList) {
        return entityList.stream().map(command -> toDto(command)).collect(Collectors.toList()).stream().mapToDouble(dto -> dto.getMarge()).sum();
    }

    @Override
    public Double marge() {
        return marge(commandeRepository.findAll());
    }
}
