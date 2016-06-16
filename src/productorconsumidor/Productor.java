package productorconsumidor;

public class Productor extends Thread{
    private Despertador bu;
    int n;
    int dormir;
    public Productor(Despertador bu,int num,int dormir){
     this.bu=bu;
     this.n=num;
     this.dormir=dormir;
}
public void run(){
       try{   
        int cifra;
            for (int i = 0; i < n; i++) {
                cifra= 0+i;
                bu.poner(cifra);
                System.out.println("se produjo : "+cifra);
                sleep(dormir);
            }
       }
       catch(Exception ex){
           
            throw new RuntimeException(ex);}
    }
}
