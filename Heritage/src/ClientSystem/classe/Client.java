/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClientSystem.classe;

/**
 *
 * @author Haythem
 */
public class Client {
    
    public int age;

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }
    private int id;
    protected String nom;
    
    public Client(){}
    
    public Client(int id,String nom){
        this.id=id;
        this.nom=nom;
    }
    
    public void acheter(){
        System.out.println("J'achete");
    }
    
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        else if(this == obj){
            return true;
        }
        
        else if(this.getClass() != obj.getClass()){
            return false;
        }
        
        else{
            final Client tmp = (Client)obj;
            if(this.id == tmp.id && this.nom.equals(tmp.nom)){
                return true;
            }
            return false;
        }
    }
    
    public String toString(){
        return "id = "+this.id+", nom = "+this.nom;
    }
}
