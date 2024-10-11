/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea2;

/**
 *
 * @author nedic
 */
public class Control {
    private Hilo1 par;
    private Hilo2 impar;
    
    public Control(){
        ejecutarHilo();
    }
    
    public void ejecutarHilo(){
    par = new Hilo1();
    impar = new Hilo2();
    par.start();
    impar.start();
    }
}
