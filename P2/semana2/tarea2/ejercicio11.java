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
public class ejercicio11 {
     public static void main (String[] args) {
     Scanner sc = new Scanner(System.in);
    int horas;
    int minutos;
    int ResultadoSegundos;
    
    System.out.println("Ingrese La Hora Actual (Solo Se Permite Ingresarla En Horario De 24 Horas): ");
    horas = sc.nextInt();
    
    System.out.println("Ingrese Los Minutos Actuales: ");
    minutos = sc.nextInt();
    
    if (horas >= 25)
    {
    System.out.println("La Hora Ingresa No Es Valida");   
    }
    
    if (minutos >= 61)
    {
    System.out.println("Los Minutos Ingresados No Son Validos");   
    }
    
    int segundosTranscurridos = (horas * 3600) + (minutos * 60);
    ResultadoSegundos = (24 * 3600) - segundosTranscurridos;
    
    System.out.printf("Desde las %02d:%02d hasta la medianoche faltan %d segundos", horas, minutos, ResultadoSegundos);
  }
    
}
