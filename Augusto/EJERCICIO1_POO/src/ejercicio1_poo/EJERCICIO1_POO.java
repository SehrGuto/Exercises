/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_poo;

import entidades.Libro;


/**
 *
 * @author ARCILA - PAVANI
 */
public class EJERCICIO1_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro L1 = new Libro();
        L1.llenarLibro(L1);
        System.out.println(L1.toString());
    }
    
    
}
