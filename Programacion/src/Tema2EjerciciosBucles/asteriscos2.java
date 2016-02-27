package Tema2EjerciciosBucles;

public class asteriscos2 {

	public static void main(String[] args)
	{
		int numero = 0;

		for (int vertical = Integer.valueOf(args[0]); vertical >= numero; vertical--) // para
		                                                                              // hacer
		                                                                              // el
		                                                                              // numero
		                                                                              // de
		                                                                              // filas
		                                                                              // que
		                                                                              // introduzcamos
		{
			for (int horizontal = vertical; horizontal > numero; horizontal--) // pinta
			                                                                   // un
			                                                                   // *
			                                                                   // siempre
			                                                                   // que
			                                                                   // horizontal
			                                                                   // sea
			                                                                   // mayor
			                                                                   // que
			                                                                   // numero
			                                                                   // y
			                                                                   // resta
			                                                                   // 1
			{
				System.out.print("*");
			}
			System.out.println("*");
		}
	}
}
