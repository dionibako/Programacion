package Ejemplos;

public class Ejemploarray2 {

	public static void main(String[] args)
	{
		int numeros[] = { 1, 4, 5, 8 };
		int suma = 0;
		for (int i = 0; i < numeros.length; i++)
		{

			// System.out.println(numeros[i]+", ");

			suma += numeros[i]; // se pone toda la expresion numeros[i]

		}
		System.out.println(suma);
	}
}
