package tp2_exo2;

/**
 *
 * @author yacine
 */
public class Tp2_exo2 extends Thread{
    private static int numThread = 0;
    private int numero;
    private volatile static  int   partage =0 ;
    Tp2_exo2(){
        numero = numThread;
        numThread ++;
        int acc = partage;
        
        
        acc++;
        partage =acc;
        System.out.println("Thread numero " + numero + " créé");}
    
    public void run(){
        System.out.println("Thread numero " + numero + " demarre");
        
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            return;
        }
        
        System.out.println("Thread numero " + numero + " terminé");
        
    }
    public static void main(String args[]){
        System.out.println("Programme demarre..");
        for(int i=0;i<5;i++){
            Thread unThread = new Tp2_exo2();
            unThread.start();
            
        }
        System.out.println("Programme principal termine " + partage);
        
    }
    
}
    