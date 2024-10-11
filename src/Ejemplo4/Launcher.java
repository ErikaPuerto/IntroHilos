package Ejemplo4;

/**
 *
 * @author nedic
 */
public class Launcher {
    public static void main(String[] args) {
        Banco ps = new Banco();
        Thread t1 = new Thread(ps, "Cristian");
        Thread t2 = new Thread(ps, "Angie");
        t1.start();
        t2.start();
    }
}
