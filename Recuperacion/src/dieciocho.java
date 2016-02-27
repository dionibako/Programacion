import java.util.Scanner;

public class dieciocho
{

	public static void main(String[] args)
	{
		int a;
		int b;

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
		a = sc.nextInt();
		System.out.println("Introduce otro numero");
		b = sc.nextInt();
		sc.close();

		int c;
		int d = 2 * b;

		for (c = a; c <= d; c++)
		{
			System.out.println(c);
		}

	}

}
