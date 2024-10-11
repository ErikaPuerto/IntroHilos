/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo6;

/**
 *
 * @author nedic
 */
public class Launcher {
    static Hilo liebre;
    static Hilo conejo;
    static Hilo tortuga;
    
    public static void main(String[] args) throws InterruptedException {
        conejo = new Hilo(" Conejo ");
        liebre = new Hilo(" liebre ");
        tortuga = new Hilo(" tortuga ");
        conejo.start();
        liebre.start();
        tortuga.start();
    }
}
