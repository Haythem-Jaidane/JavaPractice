/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClientSystem.classe;

/**
 *
 * @author Haythem
 */
public class ClientEntreprise extends Client {
    
    private String matricule;
    
    public ClientEntreprise(){
        super();
    }
    
    public ClientEntreprise(int id,String nom,String matricule){
        super(id,nom);
        this.matricule=matricule;
    }
    
    public void payerFacture(){
        int idClient = this.getId();
        int ageClient = this.age;
        String nomClient = this.nom;
        System.out.println("Le client "+nomClient+" avec l'id "+idClient+" age de "+ageClient+" a paye sa facture");
    }
    
    public void acheter(){
        System.out.println("J'achete en tant que Client entreprise");
    }
}
