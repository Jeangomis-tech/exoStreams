package com.jc;

public class Produit {
    private String nom;
    private String categorie;
    private  double prix;
    private int stock;
    public Produit(String nom, String categorie, double prix, int stock) {
        this.nom = nom;
        this.categorie = categorie;
        this.prix = prix;
        this.stock = 0;
    }
    String getNom() {
        return nom;
    }
    void setNom(String nom) {
        this.nom = nom;
    }

    String getCategorie() {
        return categorie;
    }
    void setCategorie(String categorie) {
        this.categorie = categorie;
    }
    double getPrix() {
        return prix;
    }
    void setPrix(double prix) {
        this.prix = prix;
    }
    int getStock() {
        return stock;
    }
    void setStock(int stock) {
        this.stock = stock;
    }
    @Override
    public String toString() {
        return "Produit{" + "nom=" + nom + ", categorie=" + categorie + ", prix=" + prix + ", stock=" + stock + '}';


    }
}
