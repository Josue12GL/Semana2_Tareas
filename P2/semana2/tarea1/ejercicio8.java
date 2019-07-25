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
public class ejercicio8 {
    public static void main (String[] args) {
        Scanner s = new Scanner (System.in);
        int horas, salario, sh = 12;
        System.out.print("Numero de horas de trabajo a la semana: "); horas = s.nextInt();
        salario = horas * sh;
        System.out.println("Su salario semanal es de: " + salario + " Euros");
    }
    
}
