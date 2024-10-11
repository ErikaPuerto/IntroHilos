/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo2;

/**
 *
 * @author nedic
 */
public class Hilo2 implements Runnable{
 
    public void run() {
        for(int i = 0; i < 4; i++) {
            System.out.println("Ejecutando " + Thread.currentThread().getName() + " => i = " + i);
        }
    }
}
