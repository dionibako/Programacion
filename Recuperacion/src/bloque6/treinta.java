package bloque6;

import java.util.Scanner;

public class treinta
{

	public static void main(String[] args)
	{

		System.out.println("Calcula la suma de n numeros");

		System.out.println("¿Cuanto numeros quieres introducir?");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int repeticiones = sc.nextInt();
		int suma = 0;
		int count = 0;
		do
		{
			System.out.println("Introduce el numero " + (count + 1) + " de " + repeticiones);
			int numeroIntro = sc.nextInt();
			suma += numeroIntro;
			count++;
		} while (repeticiones != count);

		System.out.println("La suma es: " + suma);

	}

}
