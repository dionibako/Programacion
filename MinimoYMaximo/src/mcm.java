

import java.util.Scanner;

public class mcm
{

	public static void main(String[] args)
	{

		Scanner numero = new Scanner(System.in);

		int a = numero.nextInt();
		int b = numero.nextInt();
		numero.close();
		int maximo;
		int i;

		maximo = a;

		if (b > a)
		{
			maximo = b;
		}

		i = maximo;

		while ((i % a != 0) || (i % b != 0))
		{
			i++;
		}
		System.out.println(i);

	}
}
