package Tema2EjerciciosFlujos;

public class pares_10 {

	public static void main(String[] args)
	{
		int numero = Integer.valueOf(args[0]);
		/*
		 * bucle que suma de 2 en 2, desde 10 hasta el valor que introduzcamos
		 * que sea mayor que 10
		 */

		for (int i = 10; i < numero; i += 2)
		{
			System.out.println(i);
		}

	}

}
