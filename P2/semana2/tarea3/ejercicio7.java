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
public class ejercicio7 {
    public static void main (String[] args) {
        Scanner s=new Scanner (System. in );
        int contraseña = 10991, a = 1, maximo = 4;
         
        while(a <= maximo) {
             System.out.println("Por favor ingresa la contraseña; ");
             int ingresar = Integer.parseInt(s.nextLine());
        if (ingresar == contraseña) {
             System.out.println("La caja Fuerte se ha abierto satisfactoriamente! ");
        }
        else  {
             System.out.println("Lo siento esa no es la combinación! ");
            
        }
         maximo--;
        }
    }
}
