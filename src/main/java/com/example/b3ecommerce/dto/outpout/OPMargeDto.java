package com.example.b3ecommerce.dto.outpout;

/**
 * Cette objet represante la marge sur une seul command
 */
public class OPMargeDto {

    private Float marge; // prixPRoduit - prixTotal - prixvente

    private Float MargeBrut; // prixPRoduit - prixTotal

    private Float tva; // prix total - prix Vente

    public Float getMarge() {
        return marge;
    }

    public void setMarge(Float marge) {
        this.marge = marge;
    }

    public Float getMargeBrut() {
        return MargeBrut;
    }

    public void setMargeBrut(Float margeBrut) {
        MargeBrut = margeBrut;
    }

    public Float getTva() {
        return tva;
    }

    public void setTva(Float tva) {
        this.tva = tva;
    }
}
