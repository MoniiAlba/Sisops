
public class Consumidor extends Thread {
             private Madriguera cubbyhole;
             private int number, totalProducts;
             private String productName;

             public Consumidor(Madriguera c, int number, String productName, int totalProducts) {
                 cubbyhole = c;
                 this.number = number;
                 this.productName = productName;
                 this.totalProducts = totalProducts;
                 this.setName("Consumidor #" + this.number);
             }

             public void run() {
                 String val;
                 for (int i = 0; i < totalProducts; i++) {
                     val = cubbyhole.get();
                     libHilos.hacerTiem(1,1000);
                 }
             }
}