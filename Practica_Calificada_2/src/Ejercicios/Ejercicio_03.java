/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

public class Ejercicio_03 {

    public static void main(String[] args) {
        // 3. Ingresar 4 números, visualizar la suma de los 2 primeros
        // y la resta de los 2 últimos
        Scanner input = new Scanner(System.in);
        int n1, n2, n3, n4;
        
        System.out.println("Ingresa 4 números:");
        n1 = input.nextInt();
        n2 = input.nextInt();
        n3 = input.nextInt();
        n4 = input.nextInt();

        System.out.println("La suma de los 2 primeros números es: " + (n1+n2));
        System.out.println("La resta de los 2 últimos números es: " + (n3-n4));
        input.close();
   
    }
}
