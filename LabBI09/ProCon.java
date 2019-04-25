
public class ProCon
{// Productor-Consumidor
    public static void main(String[] args)
    {
        // System.out.print(" De el maximo de elementos por almacen: ");
        int nMax = 20;  // Lectura de un entero.

        Madriguera c;
        String[] bienes = {"Sillas", "Mesa", "Sofa"};
        int[] totalProduction = {8, 5, 7};
        int[] totalConsumtion = {4, 5, 5, 6};
        Thread arrHilos[] = new Thread[21];
        int cont = 0;
        for	(int i = 0; i < 3; i++) {
        	c = new Madriguera(20);
        	Productor p;
        	for (int j = 0; j < 3; j++) {
        		p = new Productor(c, j + 1, bienes[i], totalProduction[j]);
        		arrHilos[cont] = p;
        		cont++;
        	}
        	Consumidor con;
        	for (int j = 0; j < 4; j++) {
        		con = new Consumidor(c, j + 1, bienes[i], totalConsumtion[j]);
        		arrHilos[cont] = con;
        		cont++;
        	}
        }
        for(Thread t: arrHilos)
        	t.start();
        
        libHilos.espTodos(arrHilos,arrHilos.length);

        System.out.println("MAIN : ADIOS");
    }
}// c. ProCon