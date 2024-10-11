package Tarea2;

/**
 *
 * @author nedic
 */
public class Hilo1 extends Thread{
    public void Hilo1(){}
    public void run(){
        for (int i=0; i<9; i++){
            if (i % 2 == 0){
                    System.out.println("PAR: " + " No. a: " + i + " + " + " No. b: " + (i+2) + " = " + (i+(i+2)));}
        }
    }
}
