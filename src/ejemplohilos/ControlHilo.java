package ejemplohilos;

/**
 *
 * @author nedic
 */
public class ControlHilo {
    private Proceso1 hilo1;
    private Proceso2 hilo2;
    
    public ControlHilo(){
        ejecutarHilo();
    }
    
    public void ejecutarHilo(){
    hilo1 = new Proceso1("Maria");
    hilo2 = new Proceso2("Juan");
    hilo1.start();
    hilo2.start();
    }
}
