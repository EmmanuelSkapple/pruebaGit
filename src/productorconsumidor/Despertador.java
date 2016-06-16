
package productorconsumidor;
//kshdfjkhdfjghfjgfjh
public class Despertador {
    private int[] buffer;
    private int tope =0;
   boolean lleno = false;
   boolean vacio = true;
   public Despertador(int longitud){
         buffer= new int[longitud];
   }
    
    public synchronized void poner (int cifra)throws Exception{
        
        while(lleno){
            wait();
        }
        buffer[tope++]=cifra;
        vacio=false;
        lleno=tope>=buffer.length;
        notifyAll();
    }
    public synchronized int quitar() throws Exception{
        while(vacio){
            wait();
        }
         int cifra= buffer[--tope];
         lleno=false;
        vacio=tope<=0;
       
        notifyAll();
        return cifra;
    }
}
