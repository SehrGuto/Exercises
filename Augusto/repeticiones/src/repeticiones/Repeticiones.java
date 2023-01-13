/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeticiones;
import java.util.Scanner;
/**
 *
 * @author ARCILA - PAVANI
 */
public class Repeticiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        /*EJERCICIO 8 MANOS A LA OBRA
        System.out.println("ingrese una nota entre 0 y 10");
        int nota = leer.nextInt();
        
               while (nota>10 || nota<0){
            System.out.println("valor incorreto, por favor ingrese una nota entre 0 y 10");
            nota = leer.nextInt();
        }
                     System.out.println("nota correta: " + nota);
                   */
       
        /*EJERCICIO 9
        int sum = 0;
        int contador = 1;
        int num1;
        
        do {
            System.out.println("ingrese o numero " + contador);
            num1 = leer.nextInt();
            
            if (num1 == 0) break;
            
            if (num1>0){
            sum = sum + num1;
            }else{
                sum = sum + 0;
            }
            contador++;           
            
            }while (contador<=20);
        if (num1 == 0){
            System.out.println("se capturó el numero 0");
        }else{
        System.out.println("la suma de los numero ingresados es: " + sum);
        }
        */
        /*EJERCICIO 10 MANOS A LA OBRA
        System.out.println("ingrese el primer numero");
        int a = leer.nextInt();
        
        System.out.println("ingrese el segundo numero");
        int b = leer.nextInt();
        
        System.out.println("ingrese el tercero numero");
        int c = leer.nextInt();
        
        System.out.println("ingrese el cuarto numero");
        int d = leer.nextInt();
        
        System.out.print(a);
        for (int i = 0; i < a; i++) {
            System.out.print("*");
        }
        System.out.println(" ");
        System.out.print(b);
        for (int i = 0; i < b; i++) {
            System.out.print("*");
        }
        
        System.out.println(" ");
        System.out.print(c);
        for (int i = 0; i < c; i++) {
            System.out.print("*");
        }
        
        System.out.println(" ");
        System.out.print(d);
        for (int i = 0; i < d; i++) {
            System.out.print("*");
        }
        System.out.println(" ");
*/
        /*EJERCICIO 10 PAGINA 43
        System.out.println("ingrese el valor limite");
        int i = leer.nextInt();
        int suma = 0;
        
        do {
            System.out.println("ingrese un numero");
            int a = leer.nextInt();
            suma = suma + a;
            
        } while (suma<i);
        
        System.out.println("limite: " + i);
        System.out.println("suma: " + suma);
        */
        boolean salida = false;
        int x;
        while (!salida) {
            
            System.out.println("ingrese el primer numero:");
        int a = leer.nextInt();
        
        System.out.println("ingrese el segundo numero:");
        int b = leer.nextInt();
        
            System.out.println("    ");
            
            System.out.println("MENU");
            System.out.println("1. SUMAR");
            System.out.println("2. RESTAR");
            System.out.println("3. MULTIPLICAR");
            System.out.println("4. DIVIDIR");
            System.out.println("5. SALIR");
            
            System.out.println("ELIJA UNA OPCIÓN:");
            x = leer.nextInt();
           
                                
        switch  (x){
            case 1:
                System.out.println("SUMA: " + (a+b));
                break;
            case 2:
                System.out.println("RESTA: " + (a-b));
                break;
            case 3:
                System.out.println("MULTIPLICACION: " + (a*b));
                break;
            case 4:
                System.out.println("DIVIDIR: " + (a/b));
                break;          
            case 5:
                salida = true;
                break;
                             
            default:
                System.out.println("Solo numeros de 1 a 5");
                          
        }
       
}
    }
}
