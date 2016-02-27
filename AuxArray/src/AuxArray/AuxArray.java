package AuxArray;

import java.util.Random;

public class AuxArray
{

	public static int comparaArrays(int[] array1, int[] array2)
	{
		int contador = 0;

		if (array1.length == array2.length)
		{

			for (int i = 0; i < array2.length; i++)
			{
				if (array2[i] != array1[i])
				{
					contador++;

				}
			}

		}

		if (array1.length > array2.length)
		{

			for (int i = 0; i < array2.length; i++)
			{
				if (array2[i] == array1[i])
				{
					return array1.length - array2.length;

				}
			}

		}

		if (array1.length < array2.length)
		{
			for (int i = 0; i < array1.length; i++)
			{
				if (array1[i] == array2[i])
				{
					return array2.length - array1.length;

				}
			}

		}
		return contador;

	}

	public static int encuentraMenorArray(int[] array)
	{
		int numero = array[0];

		for (int i = 1; i < array.length; i++)
		{
			if (array[i] < numero)
			{
				numero = array[i];
			}
		}
		return numero;

	}

	public static int encuentraMayorArray(int[] array)
	{
		int numero = array[0];

		for (int i = 1; i < array.length; i++)
		{
			if (array[i] > numero)
			{
				numero = array[i];
			}
		}
		return numero;

	}

	public static int[] eliminaValorArray(int[] array, int valor)
	{

		int[] elimina = new int[array.length - 1];
		int count = 0;

		for (int i = 0; i < array.length; i++)
		{
			if (array[i] != valor)
			{
				elimina[count] = array[i];
				count++; // suma y asi si no entra en el if, no suma y no cambia
							// la posicion de array elimina pero si en el array
							// del argumento
			}

		}
		return elimina;
	}

	public static int[] ordenaArray(int[] array, boolean menorprimero)
	{
		int[] orden = new int[array.length];
		int variable;

		if (menorprimero == true)
		{

			for (int i = 0; i < array.length; i++)
			{
				for (int j = i + 1; j < array.length; j++)
				{
					if (array[i] < array[j])
					{
						variable = array[j];
						array[j] = array[i];
						array[i] = variable;
					}

				}
				orden[i] = array[i];
			}

		}

		if (menorprimero == false)
		{

			for (int i = 0; i < array.length; i++)
			{
				for (int j = i + 1; j < array.length; j++)
				{
					if (array[i] > array[j])
					{
						variable = array[j];
						array[j] = array[i];
						array[i] = variable;
					}

				}
				orden[i] = array[i];
			}

		}
		return orden;
	}

	public static String[] ordenaArrayPoli(String[] array)
	{

		String[] resultado = new String[array.length];
		String auxiliar;

		for (int i = 0; i < array.length; i++)
		{
			for (int j = i + 1; j < array.length; j++)
			{
				if (array[i].compareToIgnoreCase(array[j]) > 0)
				{
					auxiliar = array[i];
					array[i] = array[j];
					array[j] = auxiliar;
				}
			}
			resultado[i] = array[i];
		}

		return resultado;

	}

	public static int[] combinaArrays(int[] array1, int[] array2)
	{
		int[] combina = new int[array1.length + array2.length];
		int count = 0;
		int count2 = 0;

		if (array1.length == array2.length)
		{

			for (int i = 0; i < array2.length; i++)
			{

				combina[count2] = array2[count];
				combina[count2 + 1] = array1[count];
				count2 += 2;
				count++;

			}
			for (int j = count2; j < combina.length; j++)
			{

				combina[count2] = array1[count];
				count2++;
				count++;

			}
		}

		if (array1.length > array2.length)
		{

			for (int i = 0; i < array2.length; i++)
			{

				combina[count2] = array2[count];
				combina[count2 + 1] = array1[count];
				count2 += 2;
				count++;

			}
			for (int j = count2; j < combina.length; j++)
			{

				combina[count2] = array1[count];
				count2++;
				count++;

			}
		}

		if (array1.length < array2.length)
		{

			for (int i = 0; i < array1.length; i++)
			{

				combina[count2] = array1[count];
				combina[count2 + 1] = array2[count];
				count2 += 2;
				count++;

			}
			for (int j = count2; j < combina.length; j++)
			{

				combina[count2] = array2[count];
				count2++;
				count++;

			}
		}
		return combina;

	}

	public static int[] mezclaArrays(int[] array1, int[] array2)
	{

		int mezcla[] = new int[array1.length + array2.length];

		System.arraycopy(array1, 0, mezcla, 0, array1.length);
		System.arraycopy(array2, 0, mezcla, array1.length, array2.length);

		Random numero = new Random();

		for (int i = 0; i < mezcla.length; i++)
		{
			int aleatorio = numero.nextInt(array1.length);
			int aux = mezcla[i];
			mezcla[i] = mezcla[aleatorio];
			mezcla[aleatorio] = aux;
		}

		return mezcla;
	}

	public static String toString(int[] array)
	{
		String s = "";
		for (int i = 0; i < array.length; i++)
		{
			s += array[i] + ", ";
		}
		return s;
	}

	public static String toString(String[] array)
	{
		String s = "";
		for (int i = 0; i < array.length; i++)
		{
			s += array[i] + ", ";
		}
		return s;
	}

}
