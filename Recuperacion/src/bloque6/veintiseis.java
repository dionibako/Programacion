package bloque6;

import java.util.Scanner;

public class veintiseis
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

		for (int i = 0; i < arrayNumero.length; i += 2)
		{
			System.out.print(arrayNumero[i] + ", ");
		}

	}

}
