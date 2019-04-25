
public class Productor extends Thread {

             private Madriguera cubbyhole;
             private int number, totalProducts;
             private String productName;

             public Productor(Madriguera c, int number, String productName, int totalProducts) {
                 cubbyhole = c;
                 this.number = number;
                 this.productName = productName;
                 this.totalProducts = totalProducts;
                 this.setName("Productor #" + this.number);
             }

             public void run() {
                 String str1;
                 for (int i = 0; i < totalProducts; i++) {
                     str1=this.productName + "-" + (number*1000+i) ;
                     cubbyhole.put(str1);
                     libHilos.hacerTiem(1,1000);
                 }
             }
}