/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tn.tuniprob.gestionmagasin;

/**
 *
 * @author LENOVO
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
    
    public boolean chercherProduit(Produit p){
        for(int i=0;i<this.capacite;i++){
            if(this.produits[i].comparer(p)){
                return true;
            }
        }
        return false;
    }
    
    
    public void ajouterProduit(Produit p){
        if(p.getPrix()>0 && !this.chercherProduit(p)){
            if(this.capacite < MAX_PRODUIT){
                capacite++;
                this.produits[this.capacite-1]=p;
            }
        }
    }
    
    public void supprimerProduit(Produit p){
        if(this.chercherProduit(p)){
            Produit[] tmp=new Produit[capacite - 1];
            int j=0;
            for(int i=0;i<this.capacite;i++){
                if(!this.produits[i].comparer(p)){
                    tmp[j]=this.produits[i];
                }
                j+=1;
            }
            this.produits=tmp;
            this.capacite-=1;
        }
        else{
            System.out.println("produit non trouvé");
        }
    }
    
    public int getCapacite(){
        return this.capacite;
    }
    
    public Magasin magasinPlusSature(Magasin m1,Magasin m2){
        if(m1.getCapacite()>m2.getCapacite()){
            return m1;
        }
        else{
            return m2;
        }
    }
    
    public String toString(){
        String str = "id="+this.Identifiant+",adresse="+this.adresse+", capacite="+this.capacite+"\n";
        for(int i=0;i<capacite;i++){
            str+=this.produits[i]+"\n";
        }
        return str ;
    }
    
}
