package Tema2EjerciciosFlujos;

public class numero_nomultiplos3 {

	public static void main(String[] args)
	{
		for (int i = 1; i <= 100; i++) // bucle para que "i" coja todos los
		                               // valores desde 1 hasta 100
		{
			int numero = i;

			/*
			 * //condicion para que solo imprima los que no son multiplos de 3
			 * toma el numero y lo divide entre3, si el resto es distitno de 0
			 * imprime ese numero
			 */

			if (numero % 3 != 0)
			{
				System.out.print(numero + ", ");
			}
		}

	}

}
