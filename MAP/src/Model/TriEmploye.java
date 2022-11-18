/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Comparator;

/**
 *
 * @author LENOVO
 */
public class TriEmploye implements Comparator<Employe> {
    
    @Override
    public int compare(Employe e1, Employe e2) {
        return e1.getCin()-e2.getCin();
    }
}
