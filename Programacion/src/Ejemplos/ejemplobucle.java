package Ejemplos;

public class ejemplobucle {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		int x = 1;
		int i = 1;
		while (i <= 4) // mientras que i es igual o menor que 4 sigue
		               // ejecutandose
		{
			System.out.println("X es igual a: " + x);
			System.out.println("I es igual a: " + i);
			System.out.println("----------------");
			x = x + 2 * i;
			i++;

		}

	}

}
