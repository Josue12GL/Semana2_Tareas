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
public class ejercicio12 {
     public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, fibo1, fibo2, i;
        do {
            System.out.print("Introduce la cantidad de valores a mostrar : "); numero = sc.nextInt();
        }while(numero <= 1);
        System.out.println("Los " + numero + " primeros términos de la serie de Fibonacci son:"); 
        fibo1 = 0;
        fibo2 = 1; 
        System.out.print(fibo1 + " ");
        for(i = 2;i <= numero;i++) {
             System.out.print(fibo2 + " ");
             fibo2 = fibo1 + fibo2;
             fibo1 = fibo2 - fibo1;
        }
        System.out.println();
    }
}
