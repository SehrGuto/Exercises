/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

import java.util.Scanner;

/**
 *
 * @author ARCILA - PAVANI
 */
public class Circunferencia {
    //atributo
    private double radio;

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(Circunferencia circulo){
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el radio:");
        //radio = leer.nextDouble();
        circulo.setRadio(leer.nextDouble());
    }
    
    public void area(){
        double area = Math.PI * radio * radio;
        System.out.println("area:" + area);
    }
    
    public void perimetro(){
        double perimetro = Math.PI * 2 * radio;
        System.out.println("perimetro: " + perimetro);
    }
    
}
