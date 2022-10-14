/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClientSystem.classe;

/**
 *
 * @author Haythem
 */
public class ClientParticulier extends Client {
    private int cin;
    
    public ClientParticulier(){
        super();
    }
    
    public ClientParticulier(int id,String nom,int cin){
        super(id,nom);
        this.cin=cin;
    }
    
    public void acheter(){
        System.out.println("J'achete en tant que Client particulier");
    }
    
    public void acheter(String msg){
        System.out.println(msg);
    }
    public String toString(){
        return super.toString()+" , cin = "+this.cin;
    }
}
