package Tarea2;

/**
 *
 * @author nedic
 */
public class Hilo2 extends Thread {
    
    public void Hilo2(){}
    public void run(){
        for (int i=0; i<11; i++){
            if (i % 2 == 1){
                    System.out.println( "IMPAR: " + " No. a: " + i + " + " + " No. b: " + (i+2) + " = " + (i+(i+2)));}
        }
    }
}
