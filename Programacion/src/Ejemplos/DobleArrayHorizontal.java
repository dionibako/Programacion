package Ejemplos;

public class DobleArrayHorizontal {

	public static void main(String[] args)
	{
		double suma = 0;
		double coordenadas[][] = { { 4, 7, 25, 8, 7 }, { 5, -9, 4, 11, 7 } };

		for (int i = 0; i < coordenadas[0].length; i++)
		{

			for (int j = 0; j < 2; j++)
			{
				suma += coordenadas[j][i];
			}

			System.out.println(suma);
			suma = 0;

		}
	}
}
