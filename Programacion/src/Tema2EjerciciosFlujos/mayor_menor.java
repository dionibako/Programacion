package Tema2EjerciciosFlujos;

public class mayor_menor {

	public static void main(String[] args)
	{
		/* variables */
		int a = Integer.valueOf(args[0]);
		int b = Integer.valueOf(args[1]);
		int c = Integer.valueOf(args[2]);

		System.out.println("Has introducido: " + a + ", " + b + ", " + c + ".");

		if (a > b && a > c) // si a>b y a su vez a>c
		{
			System.out.println("El mayor es " + a);
		}
		else if (b > a && b > c) // si b>a y b>c
		{
			System.out.println("El mayor es " + b);
		}
		else // resto de casos
			System.out.println("El mayor es " + c);

		if (a < b && a < c) // si a<b y a<c
		{
			System.out.println("El menor es " + a);
		}
		else if (b < a && b < c) // si b<a y b<c
		{
			System.out.println("El menor es " + b);
		}
		else // resto de casos
			System.out.println("El menor es " + c);

	}

}
