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
public class ejercicio9 {
    public static void main (String[] args) {
        Scanner s = new Scanner (System.in);
        double v, r1, r2, h, pi = 3.1416;
        System.out.print("Ingrese el radio del cono: "); r1 = s.nextDouble();
        System.out.print("Ingrese la altura del cono: "); h = s.nextDouble();
        r2 = r1 * r1;
        v = (pi * r2 * h)/3;
        System.out.println("El volumen del cono es: " + v + " metros cubicos");
        
    }
    
}
