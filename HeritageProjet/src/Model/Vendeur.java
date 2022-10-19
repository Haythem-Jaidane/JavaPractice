/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author TheBigBrother
 */
public class Vendeur extends Employe {
    
    private float tauxDeVente;
    
    public Vendeur(){
        super();
        this.tauxDeVente = 0;
    }

    public void setTauxDeVente(float tauxDeVente) {
        this.tauxDeVente = tauxDeVente;
    }

    public float getTauxDeVente() {
        return tauxDeVente;
    }
    
    public Vendeur(int id,String nom,String adresse,int nbr_heures,float tauxDeVente){
        super(id,nom,adresse,nbr_heures);
        this.tauxDeVente = tauxDeVente;
    }
}
