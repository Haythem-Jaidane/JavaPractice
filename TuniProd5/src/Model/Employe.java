/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author TheBigBrother
 */
public class Employe {
    
    private int id;
    private String nom;
    private String adresse;
    private int nbr_heures;
    
    public Employe(){
        this.id = 0;
        this.nom = "manedrouch";
        this.adresse = "manedrouch";
        this.nbr_heures = -1;
    }
    
    public Employe(int id,String nom,String adresse,int nbr_heures){
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.nbr_heures = nbr_heures;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getNbr_heures() {
        return nbr_heures;
    }
    
    public String toString(){
        return "************************\n"+"id : "+this.id+"\nnom : "+this.nom+"\nAdresse : "+this.adresse+"\nnombre d'heures"+this.nbr_heures+"\n************************";
    }
}
