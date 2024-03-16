/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

public class Ejercicio_01 {

    public static void main(String[] args) {
        // 1. Ingresar un 4 número, visualizar de la suma su cuadrado y cubo.
        Scanner input = new Scanner(System.in);
        int n1, n2, n3, n4;
        
        System.out.println("Ingresa 4 números:");
        n1 = input.nextInt();
        n2 = input.nextInt();
        n3 = input.nextInt();
        n4 = input.nextInt();
        
        System.out.println("La suma de su cuadrado de loa 4 números es: " + (Math.pow(n1,2)+Math.pow(n2,2) + Math.pow(n3,2) + Math.pow(n4,2)));
        System.out.println("La suma de su cuadrado de loa 4 números es: " + (Math.pow(n1,3)+Math.pow(n2,3) + Math.pow(n3,3) + Math.pow(n4,3)));
        input.close();

    }
    
}
