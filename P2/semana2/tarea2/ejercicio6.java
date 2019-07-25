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
public class ejercicio6 {
     
    public static void main (String[] args) {
    int altura;
    double g = 9.81;   
        
    System.out.print("Ingrese La Altura Desde La Que Cae El Objeto: ");
    Scanner h = new Scanner(System.in);
    altura = h.nextInt();

    double s = Math.sqrt(2*altura/g);

    System.out.printf("El Objeto Tardo %.2f Segundos En Caer.\n", s);
  }
    
}
