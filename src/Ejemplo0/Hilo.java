/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo0;

/**
 *
 * @author nedic
 */
public class Hilo implements Runnable{
    public void run(){
    System.out.println(Thread.currentThread().getName());
    for (int x = 1; x < 6; x++){
        System.out.println("Runnable running");
    }
    }
}
