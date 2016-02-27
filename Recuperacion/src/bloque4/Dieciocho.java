package bloque4;

import java.util.Scanner;

public class Dieciocho
{

	public static void main(String[] args)
	{
		int a;
		int b;

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
		a = sc.nextInt();
		System.out.println("Introduce otro numero mayor al anterior");
		b = sc.nextInt();
		sc.close();

		int c;
		int d = 2 * b;

		for (c = a; c <= d; c++)
		{
			if (c % 2 != 0)
				System.out.println(c);
		}

	}

}
