package Ejemplos;

public class contador {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		int counter = Integer.valueOf(args[0]); // introducimos un valor para el
		                                        // numero de repeticiones
		while (counter > 0) // mientras que el valor introducido sea mayor que 0
		                    // realizara el proceso
		{
			System.out.println("Hola Mundo. " + counter);
			counter--; // restamos 1 al valor del contador introducido por
			           // pantalla
		}
	}
}
