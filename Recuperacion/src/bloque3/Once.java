package bloque3;
import java.util.Scanner;

public class Once
{

	public static void main(String[] args)
	{
		System.out.println("Introduce un numero");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		sc.close();

		if (numero % 2 == 0)
		{
			if (numero % 10 == 0)
			{
				System.out.println(numero + " Es par y multiplo de diez.");
			} else
			{
				System.out.println(numero + " Es par pero no es multiplo de diez.");
			}
		} else
		{
			if (numero % 10 == 0)
			{
				System.out.println(numero + " Es impar pero es multiplo de diez.");
			} else
			{
				System.out.println(numero + " Es impar y no es multiplo de diez.");
			}
		}

	}

}
