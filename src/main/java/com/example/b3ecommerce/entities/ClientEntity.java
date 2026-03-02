package com.example.b3ecommerce.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Clients" )
public class ClientEntity {

    @Id
    @Column(name = "email")
    public String email;

    @Column(name = "nom" )
    public String nom;

    @Column(name = "prenom")
    public String prenom;

    @Column(name = "date_naissance")
    public LocalDate date_naissance;

    @Column(name = "addresse")
    public String addresse;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "email_client")
    public List<CommandeEntity> commandeEntity;

    public List<CommandeEntity> getCommandeEntity() {
        return commandeEntity;
    }

    public void setCommandeEntity(List<CommandeEntity> commandeEntity) {
        this.commandeEntity = commandeEntity;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDate getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance(LocalDate date_naissance) {
        this.date_naissance = date_naissance;
    }

    public String getAddresse() {
        return addresse;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }
}
