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
public class ejercicio8 {
    public static void main (String[] args) {
        Scanner s = new Scanner (System.in);
        int n1, n2, n3, media;
        System.out.print("Ingrese la nota del curso de Matematica: "); n1 = s.nextInt();
        System.out.print("Ingrese la nota del curso de Programacion: "); n2 = s.nextInt();
        System.out.print("Ingrese la nota del curso de Fisica: "); n3 = s.nextInt();
        media = (n1 + n2 + n3)/3;
        if (media >= 90) { 
            System.out.println("La media es: " + media + "\nSOBRESALIENTE!"); }
        if (media >= 80 && media <= 89 ) { 
            System.out.println("La media es: " + media + "\nNOTABLE!"); }
        if (media >= 70 && media <= 79 ) { 
            System.out.println("La media es: " + media + "\nBIEN!"); }
        if (media >= 60 && media <= 69 ) { 
            System.out.println("La media es: " + media + "\nSUFICIENTE!"); }
        if (media < 60 ) { 
            System.out.println("La media es: " + media + "\nINSUFICIENTE!"); }
    }
}
