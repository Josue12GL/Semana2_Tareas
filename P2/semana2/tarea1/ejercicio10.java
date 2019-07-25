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
public class ejercicio10 {
    public static void main (String[] args) {
        Scanner s = new Scanner (System.in);
        double kb, mb;
        System.out.print("Megabytes: "); mb = s.nextDouble();
        kb = mb*1000;
        System.out.println(mb + " Megabytes es igual a " + kb + " Kilobytes");
    }
    
}
