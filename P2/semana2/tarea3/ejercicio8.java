/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P2.semana2.tarea3;

import java.util.Scanner;

/**
 *
 * @author Josue Garcia
 */
public class ejercicio8 {
    public static void main (String[] args) {
        Scanner s = new Scanner (System. in );
         
        System.out.println("Dame un numero ; ");
        int a = s.nextInt();
        System.out.println("La tabla de multiplicar de " + a + " es ;");
        for(int x = 1;x <= 12;x++) {
             int multiplicar = a * x;
             System.out.println(multiplicar);
        }  
    }
}
