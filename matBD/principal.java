// Crea tres nuevos threads que se ejecutan concurrentemente
public class principal
{
   public static void main(String[] args)
   {
	   
	   System.out.println("NOMBRE DEL THREAD: " + Thread.currentThread().getName());

      Refresco uno = new Refresco("Pepsi Cola");
      Refresco dos = new Refresco("Coca Cola");
      Refresco tres = new Refresco("Orange Crush");

      Refresco [] arr = {uno, dos, tres};
      uno.start();
      dos.start();
      tres.start();

      for(Refresco r : arr) {
    	  try {
        	  r.join();    		  
    	  }catch(Exception e) {
    		  System.out.println(e);
    	  }

      }
      System.out.println("\n+++main++++>>> Adios. ");
    } // Me. main
} // Cla. principal


// Thread que imprime el nombre de un refresco 7 veces,
class Refresco extends Thread
{
   private String nombre;

   Refresco(String cade)
   {
      nombre = cade;
   } //Me. constructor

   public void run()
   {
      System.out.println("--> " + this.getName() );
      System.out.println(" prioridad: " + this.getPriority());
      for(int i = 1; i <= 7; i++)
      {
         try
         {
            Thread.sleep(500);
         }
         catch( InterruptedException e)   {   }
         System.out.println( "  " + this.getName() + "  " + nombre + " # " + i );
      } // for
   } // Me. run
} // Cla. Refresco
