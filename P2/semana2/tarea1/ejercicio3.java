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
public class ejercicio3 {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        double pesetas, euro = 0.006, R;
        System.out.print("Cantidad de Pesetas a convertir: "); pesetas = s.nextDouble();
        R = pesetas*euro;
        System.out.println((pesetas + " Pesetas es igual a " + R + " Euros"));
    }
    
}
