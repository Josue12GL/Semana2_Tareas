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
public class ejercicio2 {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        double pesetas = 166.39, euro, R;
        System.out.print("Cantidad de Euros: "); euro = s.nextDouble();
        R = euro * pesetas;
        System.out.println((euro + " Euros es igual a " + R + " Pesetas"));   
    }
}
