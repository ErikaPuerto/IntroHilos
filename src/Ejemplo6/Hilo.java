/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo6;

/**
 *
 * @author nedic
 */
public class Hilo extends Thread{
    String nombre;
    
    public Hilo(String nombre) {
        this.nombre = nombre;
    }
    public void run() {
        for (int c = 1; c <= 30; c++) {
                System.out.println(this.nombre + " "+ c + "mt");
                Thread.yield();
                //hace que el hilo se detenga temporalmente y permita que otro hilo se ejecute.
    }
    System.out.println("\n Llego a la meta " + nombre);
    }
}
