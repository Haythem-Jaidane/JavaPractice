/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Model.*;

/**
 *
 * @author TheBigBrother
 */
public class Main {
    public static void main(String[] args){
        Magasin M1 = new Magasin(1,"Carrefour","Centre-Ville");
        Magasin M2 = new Magasin(2,"Monoprix","Menzah 6");
        
        Caissier c1 = new Caissier(1,"foulen","ariana",20,6);
        Caissier c2 = new Caissier(2,"foulen2","ariana",200,6);
        Responsable r1 = new Responsable();
        Vendeur v1 = new Vendeur();
        
        M1.ajouterEmploye(c1);
        M1.ajouterEmploye(c2);
        M1.ajouterEmploye(r1);
        M1.ajouterEmploye(v1);
        
        Caissier c11 = new Caissier();
        Responsable r11 = new Responsable();
        Vendeur v11 = new Vendeur();
        Vendeur v12 = new Vendeur();
        Vendeur v13 = new Vendeur();
        
        M2.ajouterEmploye(c11);
        M2.ajouterEmploye(r11);
        M2.ajouterEmploye(v11);
        M2.ajouterEmploye(v12);
        M2.ajouterEmploye(v13);
        
        System.out.print(M1);
        System.out.print(M2);
        
        M1.afficherSalaies();
        M2.afficherSalaies();

    }
}
