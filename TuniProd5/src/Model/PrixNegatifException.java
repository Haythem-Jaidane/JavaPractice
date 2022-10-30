/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author TheBigBrother
 */
public class PrixNegatifException extends Exception{
    
    public PrixNegatifException(){
        super();
    }
    
    public PrixNegatifException(String msg){
        super(msg);
    }
}
