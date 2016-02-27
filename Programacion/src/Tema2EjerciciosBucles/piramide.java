package Tema2EjerciciosBucles;

public class piramide {

	public static void main(String[] args)
	{
		int altura = Integer.valueOf(args[0]);
		int fila, izquierda, piramide;

		for (fila = 0; fila < altura; fila++) // para hacer el numero de filas
		                                      // que introduzcamos
		{
			for (izquierda = 0; izquierda < altura - fila - 1; izquierda++) // empieza
			                                                                // en
			                                                                // cero
			                                                                // y
			                                                                // pinta
			                                                                // "
			                                                                // "
			                                                                // siempre
			                                                                // que
			                                                                // izquierda
			                                                                // sea
			                                                                // menos
			                                                                // que
			                                                                // la
			                                                                // altura
			                                                                // menos
			                                                                // la
			                                                                // fila
			                                                                // menos
			                                                                // 1
			{
				System.out.print(" ");
			}
			for (piramide = 0; piramide < 2 * fila + 1; piramide++) // empieza
			                                                        // en cero y
			                                                        // pinta *
			                                                        // siempre
			                                                        // que
			                                                        // piramide
			                                                        // sea menos
			                                                        // que el
			                                                        // doble de
			                                                        // la fila +
			                                                        // 1
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}
}
