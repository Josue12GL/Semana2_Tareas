/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P2.semana2.tarea2;

import java.util.Scanner;

/**
 *
 * @author Josue Garcia
 */
public class ejercicio1 {
    public static void main (String[] args) {
     Scanner sc = new Scanner(System.in);   
    String Dia, Asignatura;
    System.out.println("Escriba Un Numero Del 1 al 7: ");
    int DiaDeLaSemana = sc.nextInt();
       
    if (DiaDeLaSemana == 1) {    
    Dia = "Lunes"; Asignatura = "Idioma Español"; 
    System.out.println("El Numero Que Eligio Es Del Dia " +Dia+ ". A Primera Hora Recibe La Asignatura De "+Asignatura);   
    }
    if (DiaDeLaSemana == 2) {    
    Dia = "Martes"; Asignatura = "Idioma Ingles";
    System.out.println("El Numero Que Eligio Es Del Dia " +Dia+ ". A Primera Hora Recibe La Asignatura De "+Asignatura);   
    }
    if (DiaDeLaSemana == 3) {    
    Dia = "Miercoles"; Asignatura = "Matematicas"; 
    System.out.println("El Numero Que Eligio Es Del Dia " +Dia+ ". A Primera Hora Recibe La Asignatura De "+Asignatura);   
    }
    if (DiaDeLaSemana == 4) {    
    Dia = "Jueves"; Asignatura = "Ciencias Naturales"; 
    System.out.println("El Numero Que Eligio Es Del Dia " +Dia+ ". A Primera Hora Recibe La Asignatura De "+Asignatura);   
    }
    if (DiaDeLaSemana == 5) {    
    Dia = "Viernes"; Asignatura = "Ciencias Sociales"; 
    System.out.println("El Numero Que Eligio Es Del Dia " +Dia+ ". A Primera Hora Recibe La Asignatura De "+Asignatura);   
    }
    if (DiaDeLaSemana == 6) {    
    Dia = "Sabado"; Asignatura = "Artes Plasticas"; 
    System.out.println("El Numero Que Eligio Es Del Dia " +Dia+ ". A Primera Hora Recibe La Asignatura De "+Asignatura);   
    }
    if (DiaDeLaSemana == 7) {    
    Dia = "Domingo"; Asignatura = "Idioma Xinca"; 
    System.out.println("El Numero Que Eligio Es Del Dia " +Dia+ ". A Primera Hora Recibe La Asignatura De "+Asignatura);   
    }
    if (DiaDeLaSemana >= 8) {
    System.out.println("Solo Puede Escoger Numeros Del 1 al 7");
    }
    
    }
    
}
