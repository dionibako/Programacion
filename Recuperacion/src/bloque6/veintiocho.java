package bloque6;

import java.util.Scanner;

public class veintiocho
{

	public static void main(String[] args)
	{
		int array[] = new int[10];
		int contadorCero = 0;
		int contadorPosi = 0;
		int contadorNega = 0;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < array.length; i++)
		{
			System.out.println("Introduce el numero " + (i + 1) + " de 10:");
			array[i] = sc.nextInt();

			if (array[i] == 0)
			{
				contadorCero++;

			}
			if (array[i] > 0)
			{
				contadorPosi++;

			}
			if (array[i] < 0)
			{
				contadorNega++;

			}

		}
		System.out.println("Hay " + contadorCero + " numero con valor 0");
		System.out.println("Hay " + contadorPosi + " numero con valor positivo");
		System.out.println("Hay " + contadorNega + " numero con valor negativo");
		sc.close();

	}

}
