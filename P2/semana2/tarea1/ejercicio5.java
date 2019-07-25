/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P2.semana2.tarea1;

import java.util.Scanner;

/**
 *
 * @author Josue Garcia
 */
public class ejercicio5 {
    public static void main (String[] args) {
        Scanner s = new Scanner (System.in);
        double ld, ancho, area;
        System.out.print("Ingrese la longitud del rectangulo en metros: "); ld = s.nextDouble();
        System.out.print("Ingrese el ancho del rectangulo en metros: "); ancho = s.nextDouble();
        area = ld * ancho;
        System.out.println("El area del rectangulo es: " + area + " metros cuadrados"); 
    }
    
}
