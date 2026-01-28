package com.example.b3ecommerce.services;

import com.example.b3ecommerce.dto.imput.IPCommandeDto;
import com.example.b3ecommerce.dto.outpout.OPCommandeDto;
import com.example.b3ecommerce.entities.ClientEntity;
import com.example.b3ecommerce.entities.CommandeEntity;
import com.example.b3ecommerce.entities.ProduitEntity;
import com.example.b3ecommerce.repositories.ClientRepository;
import com.example.b3ecommerce.repositories.CommandeRepository;
import com.example.b3ecommerce.repositories.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class CommandeService implements ICommandeService{

    @Autowired
    private CommandeRepository repository;

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private ProduitRepository produitRepository;

    @Override
    public Boolean Ajouter(IPCommandeDto dto) {
        repository.saveAndFlush(toEntity(dto));
        return true;

    }

    @Override
    public CommandeEntity toEntity(IPCommandeDto dto) {
        CommandeEntity entity = new CommandeEntity();

        // on lui donne les element de base
        entity.setPrix_vente(dto.getPrix_vente());

        // si la date n'est renseigné on met la date du jour. Sinon on met la date
        if(null == dto.getDate_commande())
            entity.setDate_commande(LocalDateTime.now());
        else
            entity.setDate_commande(dto.getDate_commande());

        // on cherche le client
        ClientEntity client = clientRepository.findById(dto.getEmail()).get();
        entity.setClient(client);

        // on cherche le produit
        ProduitEntity produit = produitRepository.findById(dto.getId_produit()).get();
        entity.setProduit(produit);

        // Prix total = prix de vente + Tva
        entity.setPrix_total((float) (dto.getPrix_vente() + dto.getPrix_vente() * 0.196));

        return entity;


    }

    @Override
    public OPCommandeDto get(Integer id) {
        return toDto(repository.findById(id).get());
    }

    @Override
    public OPCommandeDto toDto(CommandeEntity e) {
        OPCommandeDto dto = new OPCommandeDto();

        // Le prix correspond au prix total en base
        dto.setPrix(Double.valueOf(e.getPrix_total()));

        // on recupere les information Client
        String client = e.getClient().getPrenom() + " " + e.getClient().getNom();
        dto.setClient(client.toUpperCase());

        // on recupere les information du produit
        String produit = e.getProduit().getNom() + " Types : " + e.getProduit().getType().toString();
        dto.setProduit(produit);

        dto.setDate_commande(e.getDate_commande());

        return dto;

    }
}
