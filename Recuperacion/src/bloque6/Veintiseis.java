package bloque6;

import java.util.Scanner;

public class Veintiseis
{

	public static void main(String[] args)
	{
		System.out.println("Introduce 10 numero");

		int arrayNumero[] = new int[10];

		for (int i = 0; i < arrayNumero.length; i++)
		{
			System.out.println("Introduce el numero " + (i + 1) + " de 10");
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			int numero = sc.nextInt();
			arrayNumero[i] = numero;
		}
		int suma = 0;
		for (int i = 0; i < arrayNumero.length; i += 2)
		{
			suma += arrayNumero[i];

		}
		System.out.print("La media es: " + (suma / 5));

	}

}
