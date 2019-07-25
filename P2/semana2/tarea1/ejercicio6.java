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
public class ejercicio6 {
    public static void main (String[] args) {
        Scanner s = new Scanner (System.in);
        double base, altura, area;
        System.out.print("Ingrese la base del triangulo en metros: "); base = s.nextDouble();
        System.out.print("Ingrese la altura del triangulo en metros: "); altura = s.nextDouble();
        area = (base * altura)/2;
        System.out.println("El area del triangulo es: " + area + " metros cuadrados");
    }
    
}
