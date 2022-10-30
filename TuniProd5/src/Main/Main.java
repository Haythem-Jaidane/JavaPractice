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
        
        
        try{
            Produit P = new Produit(1,"","",20.3f);
            Produit P1 = new Produit(2,"","",15.6f);
            Produit P2 = new Produit(3,"","",-14.2f);
        
            M1.ajouterProduit(P);
            M1.ajouterProduit(P1);
            M1.ajouterProduit(P2);
        }
        catch(MagasinPleinException e){
            System.out.println(e.getMessage());
        }
        catch(PrixNegatifException p){
            System.out.println(p.getMessage());
        }

        M1.afficherProduits();

    }



}
