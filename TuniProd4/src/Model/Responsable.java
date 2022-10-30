/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author TheBigBrother
 */
public class Responsable extends Employe {
    
    private float prime;
    
    public Responsable(){
        super();
        this.prime = 0;
    }
    
    public Responsable(int id,String nom,String adresse,int nbr_heures,float prime){
        super(id,nom,adresse,nbr_heures);
        this.prime = prime;
    }

    public float getPrime() {
        return prime;
    }
}
