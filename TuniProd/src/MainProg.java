/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Haythem Jaiadane
 */

import java.util.*;

public class MainProg {
    public static void main(String[] args){
        
        Produit p=new Produit();
        
        Produit p1 = new Produit(1021,"Lait" ,"Delice");
        Produit p2 = new Produit(2510,"Yaourt","Vitalait");
        Produit p3 = new Produit(3250,"Tomate","Sicam",1.2f);
        
        p.afficher();
        p1.afficher();
        p2.afficher();
        p3.afficher();
        
        p1.prix=0.7f;
        p1.afficher();
        
        p2.prix=1.5f;
        p.identifiant=8063;
        p.libelle="Oeuf";
        p.marque="Mazera";
        p.prix=0.9f;
        
        p2.afficher();
        p.afficher();
        
        System.out.println(p);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        
        p.dateExpiration = new Date();
        p1.dateExpiration = new Date();
        p2.dateExpiration = new Date();
        p3.dateExpiration = new Date();
        
    }
}
