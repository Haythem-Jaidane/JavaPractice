/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author TheBigBrother
 */
public class Caissier extends Employe{
    
    private int numeroDeCaisse;
    
    public Caissier(){
        super();
        this.numeroDeCaisse = -1;
    }
    
    public Caissier(int id,String nom,String adresse,int nbr_heures,int numeroDeCaisse){
        super(id,nom,adresse,nbr_heures);
        this.numeroDeCaisse = numeroDeCaisse;
    }
}
