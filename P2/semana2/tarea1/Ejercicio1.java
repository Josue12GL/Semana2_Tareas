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
public class Ejercicio1 {
    public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    int n1 = 0, n2 = 0, R = 0;
    System.out.print("Ingrese el primer numero: "); n1 = s.nextInt();
    System.out.print("Ingrese el primer numero: "); n2 = s.nextInt();
    R = (n1*n2);
    System.out.println((n1 + " x " + n2 + " = " + R));
    
    }
}
