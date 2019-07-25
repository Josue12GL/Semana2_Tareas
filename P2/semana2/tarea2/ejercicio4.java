/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P2.semana2.tarea2;

import java.util.Scanner;

/**
 *
 * @author Josue Garcia
 */
public class ejercicio4 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int  salario, horaordinaria = 12, horaextra = 16, calculohoraextra;
        System.out.print("Numero de horas de trabajo a la semana: "); 
        
        int horas = sc.nextInt();
        
        if(horas <= 40)
        {
        salario = horas * horaordinaria;
        System.out.println("Su salario semanal es de: " + salario + " Euros");
        }
       
        if(horas >= 41)
        {
        calculohoraextra = (horas - 40)* horaextra; 
        salario = (horas - 1) * horaordinaria + calculohoraextra;
        System.out.println("Su salario semanal es de: " + salario + " Euros");
        }
     
     }
    
}
