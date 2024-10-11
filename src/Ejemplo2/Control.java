/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo2;

/**
 *
 * @author nedic
 */
public class Control{
  public static void main(String[] fer){
  Hilo2 nr = new Hilo2 ();
  Thread t1 = new Thread(nr,"luis");
  Thread t2 = new Thread(nr,"fernando");
  Thread t3 = new Thread(nr,"nayeli");
  t1.start();
  t2.start();
  t3.start();
  }
}