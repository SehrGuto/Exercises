/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;
import java.util.Scanner;
/**
 *
 * @author ARCILA - PAVANI
 */
public class Condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        /*MANOS A LA OBRA PAGINA 22
        System.out.println("ingrese o primeiro numero:");
        int num1 = leer.nextInt();
        
        System.out.println("ingrese o segundo numero:");
        int num2 = leer.nextInt();
        
        if (num1 > 25 && num2 >25) {
            System.out.println("ambos numeros sao maiores que 25");
        }else if (num1 > 25 && num2 < 25){
            System.out.println(num1 + "é maior que 25");
        }else if (num1 < 25 && num2 > 25 ){
            System.out.println(num2 + "é maior que 25");
        }else {
            System.out.println("nenhum dos dois numeros é maior que 25");
        }
        MANOS A LA OBRA PAGINA 22*/
        
        /*EXERCICIO 7 MANOS A LA OBRA PG 23
        System.out.println("ingrese o tipo de motor: (1 a 4)");
        int motor = leer.nextInt();
        
        switch (motor){
            case 1:
                System.out.println("la bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("la bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("la bomba es una bomba de hormigon");
                break;
            case 4:
                System.out.println("la bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("valor invalido");                
    }*/
        /*exercicio 6
        System.out.println("ingrese un numero");
        int num1 = leer.nextInt();
        
        if (num1%2 == 0){
            System.out.println("es par");
        }else{
            System.out.println("es impar");
        }
exercicio 6*/
        
        /*EXERCICIO 7
        System.out.println("ingrese uma palavra:");
        String palavra = leer.nextLine();
        
        if (palavra.equals("eureka")){
            System.out.println("correto");
        }else{
            System.out.println("incorreto");
        }
        EXERCICIO 7*/
        
        /*EXERCICIO8
        System.out.println("ingrese uma palavra de 8 letras");
        String nome = leer.nextLine();
        int tam = nome.length();
        
        if (tam == 8){
            System.out.println("correto");            
        }else{
            System.out.println("incorreto");
        }
        EXERCICIO 8*/
        
        /*EXERCICIO 9
        System.out.println("ingrese uma palavra ou frase");
        String palavra = leer.nextLine();
        String letra = palavra.substring(0, 1);
        System.out.println(letra);
        
        if (letra.equals("A") || letra.equals("a")) {
            System.out.println("correto");           
        }else{
            System.out.println("incorreto");
        }
EXERCICIO 9 */
        
    }
    
}
