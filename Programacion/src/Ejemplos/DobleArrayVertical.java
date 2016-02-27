package Ejemplos;

public class DobleArrayVertical {

	public static void main(String[] args)
	{
		double suma = 0;

		double coordenadas[][] = { { 4, 5 }, { 7, -9 }, { 25, 4 }, { 8, 11 }, { 5, 7 } };

		double resultado[] = new double[coordenadas.length]; // aqui pasamos el
		                                                     // resultado a un
		                                                     // nuevo array de
		                                                     // longitud igual
		                                                     // al primer array

		for (int i = 0; i < coordenadas.length; i++) // recorremos las 5 filas
		{

			for (int j = 0; j < coordenadas[i].length; j++) // recorremos cada
			                                                // numero de la
			                                                // columna
			{
				suma += coordenadas[i][j]; // summamos cada par de numeros
			}

			resultado[i] = suma; // pasamos el resultado a un nuevo array para
			                     // almacenarlo
			suma = 0; // ponemos a 0 la suma para hacer la siguiente

		}

		for (int k = 0; k < resultado.length; k++) // recorremos el nuevo array
		                                           // con los valores de las
		                                           // sumas
		{
			System.out.println(resultado[k]); // imprimimos el nuevo array
		}
	}

}
