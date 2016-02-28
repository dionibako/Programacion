package bloque5;

import java.util.Scanner;

public class Veinticuatro
{

	public static void main(String[] args)
	{
		System.out.println("¿Cuantas cifras tiene tu numero binario?");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		int arrayBin[] = new int[numero];
		int sumaBin = 0;

		for (int i = 0; i < arrayBin.length; i++)
		{
			System.out.println("Introduce el numero " + (i + 1) + " de " + numero);
			arrayBin[arrayBin.length - 1 - i] = sc.nextInt();
		}

		for (int i = 0; i < arrayBin.length; i++)
		{
			if (arrayBin[i] == 1)
			{
				int potencia = ((int) Math.pow(2, i));
				sumaBin += potencia;
			}
		}
		System.out.println("El numero en binario es: " + sumaBin);

	}

}
