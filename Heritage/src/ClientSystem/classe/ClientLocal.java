/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClientSystem.classe;

/**
 *
 * @author Haythem
 */
public class ClientLocal extends ClientEntreprise {
    
    private String gov;
    
    public ClientLocal(){
        super();
    }
    
    public ClientLocal(int id,String nom ,String matriucle,String gov){
        super(id,nom,matriucle);
        this.gov=gov;
    }
    
    public void calculerTva(){
        System.out.println("La TVA est de 5%");
    }
  
}
