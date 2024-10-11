package Tarea1;

/**
 *
 * @author nedic
 */
public class Control {
    static Hilo Sakura;
    static Hilo Naruto;
    static Hilo Hinata;
    static Hilo Kiba;
    static Hilo Shino;
    static Hilo Neji;
    static Hilo Tenten;
    static Hilo Rock;
    static Hilo Choji;
    static Hilo Ino;
    
  public static void main(String[] fer){
  
      Sakura = new Hilo(" Sakura Haruno ");
      Naruto = new Hilo(" Naruto Uzumaki ");
      Hinata = new Hilo(" Hinata Hyuga ");
      Kiba = new Hilo(" Kiba Inuzuka ");
      Shino = new Hilo(" Shino Aburame ");
      Neji = new Hilo(" Neji Hyuga ");
      Tenten = new Hilo(" Tenten ");
      Rock = new Hilo(" Rock Lee ");
      Choji = new Hilo(" Choji Akimichi ");
      Ino = new Hilo(" Ino Yamanaka ");
      
  
  Sakura.start();
  Naruto.start();
  Hinata.start();
  Kiba.start();
  Shino.start();
  Neji.start();
  Tenten.start();
  Rock.start();
  Choji.start(); 
  Ino.start();
  }
}

