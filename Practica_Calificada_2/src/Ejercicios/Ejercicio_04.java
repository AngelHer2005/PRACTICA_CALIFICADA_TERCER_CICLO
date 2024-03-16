/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

public class Ejercicio_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la altura del círculo: ");
        double altura = scanner.nextDouble();

        double area = Math.PI * Math.pow((altura/2), 2);

        System.out.println("El área del círculo es: " + area);

    }
    
}
