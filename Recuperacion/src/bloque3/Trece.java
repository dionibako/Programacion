package bloque3;
import java.util.Scanner;

public class Trece
{

	public static void main(String[] args)
	{
		int a;
		int b;

		System.out.println("Introduce el dividendo");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();

		System.out.println("Introduce el divisor");
		b = sc.nextInt();
		sc.close();

		if (b > 0)
		{
			System.out.println(a + " / " + b + " = " + (a / b));
		} else
			System.out.println("No se puede dividir");

	}

}
