package ejemplohilos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nedic
 */
public class Proceso1 extends Thread{
    private String nombre;
    
    public Proceso1(String name){
        super(name);
        this.nombre = name;
    }
    
    public void run(){
        for (int i=0; i<10; i++){
            System.out.println("texto1");

        try {
            System.out.println("Corriendo la clase hilo " + this.nombre);
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            System.out.println("Me quede dormido y produje  un problema");
        }
        }
    }
}

