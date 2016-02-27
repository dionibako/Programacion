package Tema2EjerciciosFlujos;

public class notas {

	public static void main(String[] args)
	{
		/* Declaramos las variables */
		double nota1 = Double.valueOf(args[0]);
		double nota2 = Double.valueOf(args[1]);
		double nota3 = Double.valueOf(args[2]);
		double media = (nota1 + nota2 + nota3) / 3;
		double varemada = 0.45 * nota1 + 0.45 * nota2 + 0.1 * nota3;

		/*
		 * Mostramos la informacion en la pantalla
		 */

		System.out.println("Tus notas son: " + nota1 + ", " + nota2 + ", " + nota3 + "\n");
		System.out.println("Tus media es : " + media + "\n");

		if (nota1 < 5 || nota2 < 5 || nota3 < 5) // En caso de que cualquier
		                                         // nota sema menor que 5
		{
			System.out.println("SUSPENSO: TIENES ALMENOS UN EXAMEN SUSPENSO\n");
		}

		else if (media >= 9.8) // En caso de que la media sea mayor o igual a
		                       // 9.8
		{
			System.out.println("MATRICULA\n");
		}
		else if (media >= 9 && media < 9.8) // En caso de que la media sea mayor
		                                    // o igual a 9 y menor que 9.8
		{
			System.out.println("SOBRESALIENTE\n");
		}
		else if (media >= 7 && media < 9) // En caso de que la media sea mayor o
		                                  // igual a 7 y menor que 9
		{
			System.out.println("NOTABLE\n");
		}
		else if (media >= 6 && media < 7) // En caso de que la media sea mayor o
		                                  // igual a 6 y menor que 7
		{
			System.out.println("BIEN\n");
		}
		else if (media >= 5 && media < 6) // En caso de que la media sea mayor o
		                                  // igual a 5 y menor que 6
		{
			System.out.println("APROBADO\n");
		}

		/*
		 * Mostramos la informacion en la pantalla
		 */

		System.out.println("Nota Varemada: " + 0.45 * nota1 + " Primera Nota " + 0.45 * nota2 + " Segunda Nota "
		        + 0.1 * nota3 + " Tercera Nota\n");

		System.out.println("Nota Varemada: " + varemada + "\n");

		if (nota1 < 5 || nota2 < 5 || nota3 < 5) // En caso de que cualquier
		                                         // nota sema menor que 5
		{
			System.out.println("SUSPENSO: TIENES ALMENOS UN EXAMEN SUSPENSO\n");
		}

		else if (varemada >= 9.8) // En caso de que la varemacion sea mayor o
		                          // igual a 9.8
		{
			System.out.println("MATRICULA\n");
		}
		else if (varemada >= 9 && varemada < 9.8) // En caso de que la
		                                          // varemacion sea mayor o
		                                          // igual a 9 y menor que 9.8
		{
			System.out.println("SOBRESALIENTE\n");
		}
		else if (varemada >= 7 && varemada < 9) // En caso de que la varemacion
		                                        // sea mayor o igual a 7 y menor
		                                        // que 9
		{
			System.out.println("NOTABLE\n");
		}
		else if (varemada >= 6 && varemada < 7) // En caso de que la varemacion
		                                        // sea mayor o igual a 6 y menor
		                                        // que 7
		{
			System.out.println("BIEN\n");
		}
		else if (varemada >= 5 && varemada < 6) // En caso de que la varemacion
		                                        // sea mayor o igual a 5 y menor
		                                        // que 6
		{
			System.out.println("APROBADO\n");
		}

	}

}
