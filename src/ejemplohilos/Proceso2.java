package ejemplohilos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nedic
 */
public class Proceso2 extends Thread{
    private String nombre;
    
    public Proceso2(String name){
        super(name);
        this.nombre = name;
    }
    
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Texto2");
            try {
                Thread.sleep(500);
            } catch (Exception ex) {
                System.out.println("Pailas aca fallo");
            }
        }
 
    }
}

