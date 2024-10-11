/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo3;

/**
 *
 * @author nedic
 */
public class MultiHilos extends Thread{
    public void run()   {
        try {
            System.out.println(   "Thread" + Thread.currentThread().getId()  + " isrunning");
        }catch (Exception e) {
            System.out.println("Exceptioniscaught");
        }
    }
}
