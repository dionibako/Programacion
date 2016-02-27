package Tema2EjerciciosBucles;

public class numeros2 {

	public static void main(String[] args)
	{
		int numero = Integer.valueOf(args[0]);

		for (int vertical = 1; vertical <= numero; vertical++) // para hacer el
		                                                       // numero de
		                                                       // filas que
		                                                       // introduzcamos
		{
			for (int horizontal = 1; horizontal < vertical; horizontal++) // pinta
			                                                              // el
			                                                              // valor
			                                                              // que
			                                                              // adquiere
			                                                              // horizontal
			                                                              // siempre
			                                                              // que
			                                                              // horizontal
			                                                              // sea
			                                                              // menor
			                                                              // que
			                                                              // vertical
			                                                              // y
			                                                              // suma
			                                                              // 1
			{
				System.out.print(horizontal);
			}
			System.out.println(vertical);
		}
	}
}
