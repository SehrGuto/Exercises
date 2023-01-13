/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import geometria.Circunferencia;

/**
 *
 * @author ARCILA - PAVANI
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circunferencia c1 = new Circunferencia();
        c1.crearCircunferencia(c1);
        c1.area();
        c1.perimetro();
                      
    }
    
}
