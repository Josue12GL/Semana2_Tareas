/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P2.semana2.tarea3;

/**
 *
 * @author Josue Garcia
 */
public class ejercicio3 {
    public static void main (String[] args) {
        int i = 1;
        System.out.println("multiplos de 5: ");
        do{
            i++;  
            if (i % 5 == 0)
            {
                System.out.println("El numero " + i + " es multiplo de 5");
            }
         }while(i <= 100);
    }
}
