package tn.tuniprob.gestionmagasin;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Haythem Jaiadane
 */
public class Magasin {
    
    private int Identifiant;
    private String adresse;
    private int capacite;
    private Produit[] produits;
    private final int MAX_PRODUIT = 50; // final pour déclaré une constante
    
    public Magasin(){
        this.produits= new Produit[MAX_PRODUIT];
    }

    public int getIdentifiant() {
        return Identifiant;
    }

    public String getAdresse() {
        return adresse;
    }

    public Produit[] getProduits() {
        return produits;
    }

    public int getMAX_PRODUIT() {
        return MAX_PRODUIT;
    }

    public void setIdentifiant(int Identifiant) {
        this.Identifiant = Identifiant;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public void setProduits(Produit[] produits) {
        this.produits = produits;
    }
    
    
    
    public void ajouterProduit(Produit p){
        if(p.getPrix()>0){
            if(this.capacite < MAX_PRODUIT){
                capacite++;
                this.produits[this.capacite-1]=p;
            }
        }
    }
    
    public int getCapacite(){
        return this.capacite;
    }
    
    public String toString(){
        String str = "id="+this.Identifiant+",adresse="+this.adresse+", capacite="+this.capacite+"\n";
        for(int i=0;i<capacite;i++){
            str+=this.produits[i]+"\n";
        }
        return str ;
    }
    
}
