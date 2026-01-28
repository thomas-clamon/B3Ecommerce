package com.example.b3ecommerce.entities;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.time.LocalDateTime;

@Entity
@Table(name = "Commandes")
public class CommandeEntity {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "date_commande")
    private LocalDateTime date_commande;

    @Column(name = "prix_total")
    private Float prix_total;

    @Column(name = "prix_vente")
    private Float prix_vente;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "email_client")
    private ClientEntity Client;

    @OneToOne(fetch =  FetchType.LAZY)
    @JoinColumn(name ="id_produit" )
    private ProduitEntity Produit;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public LocalDateTime getDate_commande() {
        return date_commande;
    }

    public void setDate_commande(LocalDateTime date_commande) {
        this.date_commande = date_commande;
    }

    public Float getPrix_total() {
        return prix_total;
    }

    public void setPrix_total(Float prix_total) {
        this.prix_total = prix_total;
    }

    public Float getPrix_vente() {
        return prix_vente;
    }

    public void setPrix_vente(Float prix_vente) {
        this.prix_vente = prix_vente;
    }

    public ClientEntity getClient() {
        return Client;
    }

    public void setClient(ClientEntity client) {
        Client = client;
    }

    public ProduitEntity getProduit() {
        return Produit;
    }

    public void setProduit(ProduitEntity produit) {
        Produit = produit;
    }
}
