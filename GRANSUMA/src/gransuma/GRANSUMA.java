/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gransuma;

import java.util.Scanner;

/**
 *
 * @author manuelmelgarejojb
 */
public class GRANSUMA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        int resultado = 0; 
 
        System.out.println("Introduce el primer número:");			
        numero1 = reader.nextInt();

        System.out.println("Introduce el segundo número:");
        numero2 = reader.nextInt();
        resultado = numero1+numero2;
        System.out.println("La Suma es " + numero1 + " + " + numero2 + " = " + resultado);
    }
    
}
