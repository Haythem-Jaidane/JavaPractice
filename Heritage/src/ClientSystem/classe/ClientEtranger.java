/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClientSystem.classe;

/**
 *
 * @author Haythem
 */
public class ClientEtranger extends ClientEntreprise {
    private String pays;
    
    public ClientEtranger(){
        super();
    }
    
    public ClientEtranger(int id,String nom ,String matriucle,String pays){
        super(id,nom,matriucle);
        this.pays=pays;
    }
}
