package bloque3;
import java.util.Scanner;

public class catorce
{

	public static void main(String[] args)
	{
		int a, b, c;

		System.out.println("Introduce el primer numero");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		System.out.println("Introduce el segundo numero");
		b = sc.nextInt();
		System.out.println("Introduce el tercer numero");
		c = sc.nextInt();
		sc.close();

		if (a > b)
		{
			if (a > c)
			{
				System.out.println(a + " Es el mayor");
			}

		}
		if (b > a)
		{
			if (b > c)
			{
				System.out.println(b + " Es el mayor");
			}

		}
		if (c > a)
		{
			if (c > b)
			{
				System.out.println(c + " Es el mayor");
			}

		}

	}

}
