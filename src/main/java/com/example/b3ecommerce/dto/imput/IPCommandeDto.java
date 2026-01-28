package com.example.b3ecommerce.dto.imput;

import java.time.LocalDateTime;

public class IPCommandeDto {

    private String email;
    private Integer id_produit;

    private LocalDateTime date_commande;

    private Float prix_vente;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId_produit() {
        return id_produit;
    }

    public void setId_produit(Integer id_produit) {
        this.id_produit = id_produit;
    }

    public LocalDateTime getDate_commande() {
        return date_commande;
    }

    public void setDate_commande(LocalDateTime date_commande) {
        this.date_commande = date_commande;
    }

    public Float getPrix_vente() {
        return prix_vente;
    }

    public void setPrix_vente(Float prix_vente) {
        this.prix_vente = prix_vente;
    }
}
