/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import entidades.Operacion;

/**
 *
 * @author ARCILA - PAVANI
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operacion o1 = new Operacion();
        o1.crearOperacion();
        o1.sumar();
        o1.restar();
        o1.multiplicar();
        o1.dividir();
    }
    
}
