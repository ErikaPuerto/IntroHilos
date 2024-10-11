/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo3;

/**
 *
 * @author nedic
 */
public class Control {
  
    public static void main(String[]args)    {
        int n = 8; // Cantidad de hilos
        for(int i = 0; i < n; i++) {
            MultiHilos object= new MultiHilos();
            object.start();
        }
    }
}  

