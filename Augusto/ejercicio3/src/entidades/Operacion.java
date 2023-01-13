/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author ARCILA - PAVANI
 */
public class Operacion {
    //atributos
    private int numero1;
    private int numero2;

    public Operacion() {
    }

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public void crearOperacion(){
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el numero 1");
        this.numero1 = leer.nextInt();
        System.out.println("ingrese el numero 2");
        this.numero2 = leer.nextInt();
        
    }
    public void sumar(){
        int suma = numero1 + numero2;
        System.out.println("La suma es: " + suma);
    }
    
    public void restar(){
        int resta = numero1 - numero2;
        System.out.println("La resta es: " + resta);
    }
    public void multiplicar(){
        if (numero1 == 0 || numero2 == 0){
        System.out.println("multiplicacion por cero, resultado: 0");
    }else{
            int producto = numero1 * numero2;
        System.out.println("El producto es: " + producto);
            }
        
    }
    public void dividir(){
        if (numero1 == 0 || numero2 == 0){
        System.out.println("division por cero, resultado: 0");
    }else{
            int division = numero1/numero2;
        System.out.println("La division es: " + division);
            }
        
    }
}
