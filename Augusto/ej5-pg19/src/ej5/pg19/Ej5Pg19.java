/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5.pg19;
import java.util.Scanner
/**
 *
 * @author ARCILA - PAVANI
 */
public class Ej5Pg19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese True or False");
        boolean verd = leer.nextBoolean();
        System.out.println("ingrese un numero con su decimal");
        double num1 = leer.nextDouble();
        System.out.println("ingrese un caracter");
        String carac = leer.next();
        
        System.out.println(verd);
        System.out.println(num1);
        System.out.println(carac);
    }
    
}
