/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Haythem Jaidane
 */

import java.util.*;
        
public class Produit {
    int identifiant;
    String libelle;
    String marque;
    float prix;
    Date dateExpiration;
    
    Produit(){ 
    }
    
    Produit(int identifiant,String libelle,String marque){ 
        this.identifiant=identifiant;
        this.libelle=libelle;
        this.marque=marque;
    }
    
    Produit(int identifiant,String libelle,String marque,float prix){ 
        this.identifiant=identifiant;
        this.libelle=libelle;
        this.marque=marque;
        this.prix=prix;
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
