package bloque6;

import java.util.Random;

public class treinta
{

	public static void main(String[] args)
	{

		Random rdn = new Random();

		int array[] = new int[rdn.nextInt(100) + 1];
		int suma = 0;
		for (int i = 0; i < array.length; i++)
		{
			array[i] = rdn.nextInt(100) + 1;
			suma += array[i];
			System.out.print(array[i] + ", ");
		}
		System.out.print("\n" + suma);

	}

}
