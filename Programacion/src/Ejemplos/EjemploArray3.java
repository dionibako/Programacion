package Ejemplos;

public class EjemploArray3 {

	public static void main(String[] args)
	{
		int suma = 0;

		for (int i = 0; i < args.length; i++)
		{
			System.out.print(args[i]);
			suma = suma + Integer.valueOf(args[i]);
		}

		System.out.println("\nLa suma es: " + suma + ".");
	}
}
