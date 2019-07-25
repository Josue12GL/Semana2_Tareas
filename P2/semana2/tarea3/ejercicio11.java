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
public class ejercicio11 {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int num = 5, b = 1, a;
        System.out.print("Dame un numero : "); a = s.nextInt();
          
        while(b <= num ) {
            num--;
            a++;
            System.out.print("El cuadrado es ;" +Math.pow(a,2));
            System.out.println("El cubo es ; "+Math.pow(a,3));
        }
    }
}
