/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo1;

import java.util.Scanner;
public class Hilo extends Thread{
    Scanner dato = new Scanner(System.in);
    String nombre;
 
    public void run() {
        System.out.println("Ingrese el nombre del atleta :");
        nombre = dato.next();
        for(int c = 1; c <= 30; c++) {
            System.out.print(this.nombre + " ha corrido " + c + " km ");
            try {
                sleep(1500);
            } catch (InterruptedException e) {
            }
        }
        System.out.println("\n Llego a la meta " + nombre);
    }
 
    public static void main(String[]args) {
        Hilo eje1 = new Hilo();
        Hilo eje2 = new Hilo();
        eje1.start();
        eje2.start();
    }
}
