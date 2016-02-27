package Tema2EjerciciosBucles;

public class asteriscos {

	public static void main(String[] args)
	{
		int numero = Integer.valueOf(args[0]);

		for (int vertical = 0; vertical < numero; vertical++) // para hacer el
		                                                      // numero de filas
		                                                      // que
		                                                      // introduzcamos
		{
			for (int horizontal = 0; vertical > horizontal; horizontal++) // pinta
			                                                              // un
			                                                              // *
			                                                              // siempre
			                                                              // que
			                                                              // vertical
			                                                              // sea
			                                                              // mayor
			                                                              // que
			                                                              // horizontal
			                                                              // y
			                                                              // suma
			                                                              // 1
			{
				System.out.print("*");
			}
			System.out.println("*");
		}
	}
}
