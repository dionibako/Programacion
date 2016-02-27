package Tema2EjerciciosFlujos;

public class noMultiplo5 {

	public static void main(String[] args)
	{
		int numero = Integer.valueOf(args[0]);
		int contador = 0;
		for (int i = 1; i <= numero; i++) // for para que cuente de 1 hasta el
		                                  // valor introducido
		{
			if (i % 5 != 0) // si el numero no es multiplo de 5, lo imprime
				System.out.print(i + " ");
			contador++; // cada vez que se de esta condicion suma 1

			if (contador == 6) // cuando el contador anterior llega a 6, hace un
			                   // salto de linea y se pone a O
			{
				System.out.println();
				contador = 0;
			}
		}

	}

}
