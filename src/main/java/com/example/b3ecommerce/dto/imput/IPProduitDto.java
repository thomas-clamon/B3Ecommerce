package com.example.b3ecommerce.dto.imput;

public class IPProduitDto {

    private String Nom;
    private Double Prix;

    private String Type_produit;

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public Double getPrix() {
        return Prix;
    }

    public void setPrix(Double prix) {
        Prix = prix;
    }

    public String getType_produit() {
        return Type_produit;
    }

    public void setType_produit(String type_produit) {
        Type_produit = type_produit;
    }
}
