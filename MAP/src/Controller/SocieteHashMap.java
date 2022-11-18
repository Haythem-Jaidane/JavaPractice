/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Departement;
import Model.Employe;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author LENOVO
 */

public class SocieteHashMap implements InterfaceSociete {
    
    private HashMap<Employe,Departement> societe;
    
    void SocieteHashMap(){
        societe = new HashMap<>();
    }

    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        societe.put(e,d);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        societe.remove(e);
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
        for(Map.Entry item : societe.entrySet()){
            System.out.println(item.getKey() + " " + item.getValue());
        }
    }

    @Override
    public void afficherLesEmployes() {
        for(Employe employeSet : societe.keySet()){
            System.out.println(employeSet);
        }
    }

    @Override
    public void afficherLesDepartements() {
        for(Departement depaSet : societe.values()){
            System.out.println(depaSet);
        }
    }

    @Override
    public void afficherDepartement(Employe e) {
        System.out.println(societe.get(e));
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return societe.containsKey(e);
    }

    @Override
    public boolean rechercherDepartement(Departement e) {
        return societe.containsValue(e);
    }
    
}
