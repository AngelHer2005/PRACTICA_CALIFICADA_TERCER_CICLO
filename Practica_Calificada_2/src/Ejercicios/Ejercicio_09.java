/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

public class Ejercicio_09 {

    public static void main(String[] args) {
        // 9) Una compañía de viajes cuenta con tres tipos de autobuses (A, B y C), 
        // cada uno tiene un precio por kilómetro recorrido por persona, los costos 
        // respectivos son S/2.0, S/.2.5 y S/.3.0. Se requiere determinar el costo total y por persona del viaje.
        Scanner input = new Scanner(System.in);
        String opcion;
        int kil, indice;
        double[] p_kil = {2.0,2.5,3.0};
        char[] bus = {'a','b','c'};
        
        System.out.println("¿Qué bus tomarás? (A, B o C)");
        opcion = input.nextLine().toLowerCase();
        System.out.println("¿Cuántos kilómetros recorrerás?");
        kil = input.nextInt();
        indice = new String(bus).indexOf(opcion);
        System.out.println("La persona tendrá que pagar un costo total por el viaje de S/. " + (p_kil[indice]*kil));
    }
    
}
