package com.example.b3ecommerce.dto.outpout;

import java.time.LocalDateTime;

public class OPCommandeDto {

    private String Client;
    private String Produit;

    private LocalDateTime Date_commande;

    private Double prix; // TTC

    public String getClient() {
        return Client;
    }

    public void setClient(String client) {
        Client = client;
    }

    public String getProduit() {
        return Produit;
    }

    public void setProduit(String produit) {
        Produit = produit;
    }

    public LocalDateTime getDate_commande() {
        return Date_commande;
    }

    public void setDate_commande(LocalDateTime date_commande) {
        Date_commande = date_commande;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }
}
