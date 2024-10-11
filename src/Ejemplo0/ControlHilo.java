/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo0;

/**
 *
 * @author nedic
 */
public class ControlHilo {
    public static void main (String[] luis){
    Hilo r = new Hilo();
    Thread t = new Thread(r, "Teresa");
    t.start();}
}
