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
public class ejercicio9 {
    public static void main (String[] args) {
  
    Scanner sc = new Scanner(System.in);
    double a,b,c;
    double X0,X1;

    System.out.println("Valor a:");
    a = sc.nextDouble();
    System.out.println("Valor b:");
    b = sc.nextDouble();
    System.out.println("Valor c:");
    c = sc.nextDouble();
        
    double numero = (b*b) - (4*a*c);
       
    if(numero > 0) 
    {
    X0 = (-b + Math.sqrt(numero)) / 2*a;
    X1 = (-b - Math.sqrt(numero)) / 2*a;
    System.out.println("La ecuacion tiene dos soluciones");
    System.out.println("X0:"  +X0);
    System.out.println("X1:"  +X1);
    }
    else 
    {
    if(numero == 0) 
    {
    X0 = (-b) / 2*a;
    System.out.println("La ecuacion tiene una solucion");  
    System.out.println("X0:"  +X0);
    } else 
    {
    System.out.println("La ecuacion no tien solución");
    }
    }
    }    
    
}
