package Tarea1;

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
        for(int i = 0; i < 6; i++) {
            System.out.println(this.nombre + " esta comiendo plato No.  " + i);
        }
        System.out.println(this.nombre + " ya se termino de comer");
    }
}