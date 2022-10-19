/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author TheBigBrother
 */
public class Produit {
    private int identifiant;
    private String libelle;
    private String marque;
    private float prix;
    private Date dateExpiration;
    
    public Produit(){ 
    }
    
    public Produit(int identifiant,String libelle,String marque){ 
        this.identifiant=identifiant;
        this.libelle=libelle;
        this.marque=marque;
    }
    
    public Produit(int identifiant,String libelle,String marque,float prix){ 
        this.identifiant=identifiant;
        this.libelle=libelle;
        this.marque=marque;
        this.prix=prix;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public String getLibelle() {
        return libelle;
    }

    public String getMarque() {
        return marque;
    }

    public float getPrix() {
        return prix;
    }

    public Date getDateExpiration() {
        return dateExpiration;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }
    
    public boolean comparer(Produit p){
        if(p.getIdentifiant() != this.identifiant){
            return false;
        }
        else if(!p.getLibelle().equals(this.libelle)){
            return false;
        }
        else if(p.getPrix() != this.prix){
            return false;  
        }
        else{
            return true;
        }
    }
    
    public boolean comparer(Produit p1,Produit p2){
        if(p1.getIdentifiant() != p2.getIdentifiant()){
            return false;
        }
        else if(!p1.getLibelle().equals(p2.getIdentifiant())){
            return false;
        }
        else if(p1.getPrix() != p2.getIdentifiant()){
            return false;  
        }
        else{
            return true;
        }
    }
    
    void afficher(){
        System.out.println("--------------------------------");
        System.out.println("Id : "+this.identifiant);
        System.out.println("Libelle : "+this.libelle);
        System.out.println("Marque : "+this.marque);
        System.out.println("Prix : "+this.prix);
        System.out.println("--------------------------------");
    }
    
    public String toString(){
        return "--------------------------------\n"+"Id : "+this.identifiant+"\nLibelle : "+this.libelle+"\nMarque : "+this.marque+"\nPrix : "+this.prix+"\n--------------------------------\n";
    }
}
