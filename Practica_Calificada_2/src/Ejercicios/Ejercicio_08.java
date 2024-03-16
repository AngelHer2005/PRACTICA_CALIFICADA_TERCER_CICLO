/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

public class Ejercicio_08 {

    public static void main(String[] args) {
        // 8) Incrementar el sueldo básico de un trabajador en un 25% 
        // con relación a su sueldo anterior, mostrar el nuevo sueldo.
        Scanner input = new Scanner(System.in);
        double sueldo_b;
        
        System.out.println("¿Cuál es el sueldo básico del trabajador?");
        sueldo_b = input.nextDouble();
        
        System.out.println("El sueldo actual que cuenta con un 25% más que el sueldo anterior es " + (sueldo_b*1.25));
        input.close();

    }
    
}
