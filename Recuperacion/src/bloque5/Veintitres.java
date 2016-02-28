package bloque5;

import java.util.Scanner;

public class Veintitres
{

	public static void main(String[] args)
	{
		System.out.println("Introduce un numero.");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		int count = 1;
		int a = 1;
		int b = 1;
		System.out.println("Los " + numero + " primeros terminos de la serie Fibonacci son: ");
		System.out.print("1, 1, ");
		do
		{
			b = b + a;
			a = b - a;
			System.out.print(b + ", ");
			count++;

		} while (count < (numero - 1));
	}

}
