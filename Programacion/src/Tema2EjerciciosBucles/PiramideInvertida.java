package Tema2EjerciciosBucles;

public class PiramideInvertida {

	public static void main(String[] args)
	{
		int altura = Integer.valueOf(args[0]);
		int fila, izquierda, piramide = 1;

		for (fila = 0; fila < altura; fila++) // para hacer el numero de filas
		                                      // que introduzcamos
		{
			for (izquierda = altura - fila; izquierda < altura; izquierda++) // su
			                                                                 // valor
			                                                                 // es
			                                                                 // la
			                                                                 // altura
			                                                                 // menos
			                                                                 // la
			                                                                 // fila
			                                                                 // y
			                                                                 // se
			                                                                 // cumple
			                                                                 // siempre
			                                                                 // que
			                                                                 // izquierda
			                                                                 // sea
			                                                                 // menor
			                                                                 // que
			                                                                 // altura
			{
				System.out.print(" ");
			}
			for (piramide = 2 * altura - 2 * fila; piramide > 1; piramide--) // su
			                                                                 // valor
			                                                                 // es
			                                                                 // 2
			                                                                 // veces
			                                                                 // la
			                                                                 // altura
			                                                                 // -
			                                                                 // 2veces
			                                                                 // la
			                                                                 // fila,
			                                                                 // se
			                                                                 // cumple
			                                                                 // siempre
			                                                                 // que
			                                                                 // su
			                                                                 // valor
			                                                                 // es
			                                                                 // mayor
			                                                                 // que
			                                                                 // 1
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}
