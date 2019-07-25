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
public class ejercicio10 {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int b = 0, num = 1, suma = 0, numero = 5 ;
        System.out.println("Para salir ingresa cero");
        do{
            System.out.println("Ingresa un numero"); numero = s.nextInt();
            if ( numero > 0) {
               suma = suma + numero;
               b++;
            }
        }while(numero >= 1);
        System.out.println("La media de los valores ingresados es: "+suma/(b)); 
    }
}
