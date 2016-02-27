package Otros;

public class DivisionesRestas {

	public static void main(String[] args)
	{
		int numero = Integer.valueOf(args[0]);
		int divisor = Integer.valueOf(args[1]);
		int numero2 = numero;
		int counter = 0;

		while (numero >= divisor) // mientras que el numero sea mayor o igual
		                          // que el divisor, se restara el divisor al
		                          // numero
		{
			numero = numero - divisor;
			counter++; // suma 1 cada vez que se ejecute el bucle
		}
		System.out.println(
		        +numero2 + " dividido entre " + divisor + " es igual a: " + counter + " y de resto : " + numero);

	}
}
