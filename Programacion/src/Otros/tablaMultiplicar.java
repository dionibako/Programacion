package Otros;

public class tablaMultiplicar {

	public static void main(String[] args)
	{

		int numero = Integer.valueOf(args[0]);

		for (int i = 1; i <= 10; i++)
		{
			System.out.println(numero + " multiplicado por " + i + " es igual a " + numero * i);
		}

	}

}
