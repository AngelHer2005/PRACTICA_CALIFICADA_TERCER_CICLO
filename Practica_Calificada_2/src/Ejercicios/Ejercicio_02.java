/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

public class Ejercicio_02 {

    public static void main(String[] args) {
        // 2. Ingresar 8 números, visualizar de la suma el promedio y la raíz cuadrada.
        Scanner input = new Scanner(System.in);
        int n1, n2, n3, n4, n5, n6, n7, n8;
        
        System.out.println("Ingresa 8 números: ");
        n1 = input.nextInt();
        n2 = input.nextInt();
        n3 = input.nextInt();
        n4 = input.nextInt();
        n5 = input.nextInt();
        n6 = input.nextInt();
        n7 = input.nextInt();
        n8 = input.nextInt();
        
        System.out.println("El promedio es: " + (n1+n2+n3+n4+n5+n6+n7+n8)/8);
        System.out.println("La raíz cuadrada de la suma es: " + Math.sqrt(n1+n2+n3+n4+n5+n6+n7+n8));
        input.close();
    }
    
}
