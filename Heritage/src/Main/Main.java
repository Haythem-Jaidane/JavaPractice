/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import ClientSystem.classe.*;

/**
 *
 * @author Haythem
 */

public class Main {
    public static void main(String[] args){
        Client cl = new Client(1 , "Ali");
        ClientParticulier cp = new ClientParticulier(2,"Med",999);
        ClientLocal clientloc = new ClientLocal(3,"Fedi","0001Al","Ariana");
        ClientEntreprise cel = new ClientEntreprise(4,"Salah","AA001");
        
        cl.acheter();
        cp.acheter();
        clientloc.acheter();
        cel.acheter();
        
        Client cl2 = new ClientLocal(5,"Ahmed","11AAW","Manouba");
        ((ClientEntreprise)cl2).acheter();
        
        ClientEntreprise cl3 = new ClientLocal(8,"Ahmed","11AAW","Manouba");
        cl3.acheter();
        cl3.payerFacture();
        
        ClientLocal cll2 = (ClientLocal)cl3;
        cll2.calculerTva();
        
        Client[] clients = {cl,cp,cel};
        for(int i=0;i < clients.length ; i++){
            if(clients[i] instanceof Client){
                clients[i].acheter();
            }
            else if(clients[i] instanceof ClientParticulier){
                clients[i].acheter();
            }
            else if(clients[i] instanceof ClientEntreprise){
                ((ClientEntreprise)clients[i]).payerFacture();
            }
        }
    }
}
