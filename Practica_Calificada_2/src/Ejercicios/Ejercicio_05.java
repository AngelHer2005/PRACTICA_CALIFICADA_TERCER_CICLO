/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

public class Ejercicio_05 {

    public static void main(String[] args) {
        //5) La tienda ABC paga una comisión del 30% del total de 
        // venta de sus productos, v visualizar la comisión.
        Scanner input = new Scanner(System.in);
        double total_p;

        System.out.println("¿Dime el total de la venta de los productos de la tienda ABC:");
        total_p = input.nextDouble();

        System.out.println("La comisión del total de la venta es " + (total_p * 0.3));
        input.close();
    }
}
