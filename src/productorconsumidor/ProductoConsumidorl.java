
package productorconsumidor;

public class ProductoConsumidorl {
    
     public static void main(String[] args) {
    
    Despertador Desp = new Despertador(10);
    Productor pro = new Productor(Desp,6,1000);
    Comsumidor cons = new Comsumidor(Desp,6,1000);
    pro.start();
    cons.start();
}
}
