package Ejemplos;

public class DobleArray {

	public static void main(String[] args)
	{
		double suma = 0;
		double coordenadas[][] = { { 4, -7, 25, 8 }, { 5, 10, 3, 13 } };

		for (int i = 0; i < coordenadas.length; i++)
		{
			double array[] = coordenadas[i];

			for (int j = 0; j < array.length; j++)
			{

				suma = coordenadas[0][j] + coordenadas[1][j];

				System.out.println(suma);
			}

		}

	}

}
