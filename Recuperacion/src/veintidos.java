import java.util.Scanner;

public class veintidos
{

	public static void main(String[] args)
	{
		System.out.println("Introduce un numero.");

		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();

		for (int i = 1; i <= 10; i++)
		{
			System.out.println(i * numero);
		}
		sc.close();

	}

}
