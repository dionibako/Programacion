

import java.util.Scanner;

public class MCD
{

	public static void main(String[] args)
	{

		Scanner numero = new Scanner(System.in);

		int a = numero.nextInt();
		int b = numero.nextInt();
		numero.close();
		int minimo;
		int i;

		minimo = a;

		if (b < a)
		{
			minimo = b;
		}

		i = minimo;
		while ((a % i != 0) || (b % i != 0))
		{
			i--;
		}
		System.out.println(i);
	}

}
