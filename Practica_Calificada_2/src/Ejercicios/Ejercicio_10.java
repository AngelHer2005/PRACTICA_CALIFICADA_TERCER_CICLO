/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

public class Ejercicio_10 {

    public static void main(String[] args) {
        // 10) Se necesita un sistema para un supermercado, en el cual si el monto de la compra del cliente 
        // es mayor de $8000 se le hará un descuento del 35%, si es menor o igual a $7000 pero mayor que $3500 
        // será del 23%, si no rebasa los $3000 pero si los $1000 la rebaja efectiva es del 15% y en caso de que no rebase los $1000 no tendrá beneficio
        Scanner input = new Scanner(System.in);
        int monto;
        double desc = 0;
        
        System.out.println("Ingresa el monto de la compra del cliente:");
        monto = input.nextInt();
        
        if (monto > 8000) {
            desc = 0.35;
        }else if (monto <= 7000 && monto > 3500) {
            desc = 0.23;
        }else if(monto < 3000 && monto > 1000){
            desc = 0.15;
        }
        System.out.println("Su monto es S/. " + monto + ", con descuento del " + Math.round(desc*100) + "%, su monto final será S/. " + (monto-(monto*desc)));
    }
}
