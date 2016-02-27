package Tema2EjerciciosFlujos;

public class sumatorio {

	public static void main(String[] args)
	{
		/* declaramos las variables */

		int numero = Integer.valueOf(args[0]);
		int suma = 0;

		for (int i = 1; i <= numero; i++) // creamos un bucle desde 1 hasta el
		                                  // numero introducido
		{
			suma = suma + i; // hacemos la suma, para que cambie de valor segun
			                 // va cambiando el valor "i" con el for

		}
		System.out.print("Resultado Sumatorio de 1 a " + numero + " = " + suma);

	}

}
