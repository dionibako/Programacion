package bloque6;

import java.util.Scanner;

public class VeintisiestePrincipal
{

	public static void main(String[] args)
	{

		System.out.println("¿Cuantos alumnos hay en tu clase?");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int numAlum = sc.nextInt();
		sc.nextLine();

		VeintisieteAlum arrayAlum[] = new VeintisieteAlum[numAlum];
		int count = 0;
		String nombreAlum = " ";
		double notaAlum = 0;
		double notaMedia = 0;

		for (int i = 0; i < arrayAlum.length; i++)
		{
			System.out.println("Introduce el nombre del alumno " + (i + 1) + " de " + numAlum);
			nombreAlum = sc.nextLine();

			System.out.println("Introduce la nota del alumno " + (i + 1) + " de " + numAlum);
			notaAlum = sc.nextInt();
			sc.nextLine();

			VeintisieteAlum alum = new VeintisieteAlum(nombreAlum, notaAlum);
			arrayAlum[i] = alum;

			notaMedia += arrayAlum[i].getNota();
		}

		System.out.println("La nota media de clase es: " + notaMedia / numAlum);

		for (int j = 0; j < arrayAlum.length; j++)
		{
			if (arrayAlum[j].getNota() > notaMedia)
			{
				count = j;

			}
			System.out.println(arrayAlum[count].getNombre()
					+ " tiene una nota por encima de la media de clase y su nota es: " + arrayAlum[count].getNota());

		}

	}

}
