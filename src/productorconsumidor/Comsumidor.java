
package productorconsumidor;

public class Comsumidor extends Thread{
    private Despertador bu;
    int n;
    int dormir;
    
    public Comsumidor(Despertador bu,int num,int dormir){
     this.bu=bu;
     this.n=num;
     this.dormir=dormir;
    }
   public void run(){
      try{  
         int cifra;
           for (int i = 0; i < n; i++) {
                cifra= bu.quitar();
                System.out.println("se quito el numero :  "+ cifra);
                 sleep(dormir+100);
           }
      }
          catch(Exception ex){
            ex.printStackTrace();
            throw new RuntimeException(ex);
                    
                    }
   }
}
