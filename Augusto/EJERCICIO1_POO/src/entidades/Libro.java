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
public class Libro {
    //atributos
    int ISBN;
    String titulo;
    String autor;
    int pagina;    
    
    //constructor vacio

    public Libro() {
    }
    
    //constructor

    public Libro(int ISBN, String titulo, String autor, int pagina) {
        this.ISBN = ISBN;
        this.pagina = pagina;
        this.titulo = titulo;
        this.autor = autor;
        
    }
    public void llenarLibro(Libro Libro){ 
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese los datos de tu libro");
        ISBN = leer.nextInt();
        pagina = leer.nextInt();
        titulo = leer.next();
        autor = leer.next();
        
    }   
    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", pagina=" + pagina + '}';
    }
    
}