
public class MiArray
{

	int array[];

	public MiArray()
	{
		array = new int[10];
		for (int i = 0; i < 10; i++)
		{
			array[i] = -1;
		}

	}

	public MiArray(int longitud)
	{
		array = new int[longitud];
		for (int i = 0; i < longitud; i++)
		{
			array[i] = -1;
		}
	}

	public MiArray(int longitud, int valor)
	{
		array = new int[longitud];
		for (int i = 0; i < longitud; i++)
		{
			array[i] = valor;
		}

	}

	public void inicializa(int valor)
	{
		for (int i = 0; i < array.length; i++)
		{
			array[i] = valor;
		}
	}

	public void resetea()
	{
		for (int i = 0; i < array.length; i++)
		{
			array[i] = -1;
		}
	}

	public int sumaValores()
	{
		int suma = 0;
		for (int i = 0; i < array.length; i++)
		{
			suma += array[i];
		}
		return suma;
	}

	public int pares()
	{
		int count = 0;
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] % 2 == 0)
			{
				count++;
			}
		}
		return count;

	}

	public int impares()
	{
		int count = 0;
		array = new int[array.length];
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] % 2 != 0)
			{
				count++;
			}
		}
		return count;

	}

	public boolean contains(int numero)
	{
		boolean contiene = false;
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] == numero)
			{
				contiene = true;
			}

		}
		return contiene;

	}

	public int count(int numero)
	{
		int ocurrencia = 0;
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] == numero)
			{
				ocurrencia++;
			}

		}
		return ocurrencia;

	}

	public String toString()
	{
		String ret = "";
		for (int i = 0; i < array.length; i++)
		{
			ret += array[i] + " ";
		}
		return ret;

	}

	public void show()
	{
		String ret = "";
		for (int i = 0; i < array.length; i++)
		{
			ret += array[i] + " ";

		}
		System.out.println("El array es: " + ret);

	}

	public MiArray sumaArray(int sumandoArray[], boolean actualiza)
	{
		MiArray arraySuma = new MiArray();

		if (array.length < sumandoArray.length)
		{
			arraySuma.array = sumandoArray;

			for (int i = 0; i < array.length; i++)
			{
				arraySuma.array[i] = sumandoArray[i] + array[i];
			}

		}

		else
		{
			arraySuma.array = array;

			for (int i = 0; i < sumandoArray.length; i++)
			{
				arraySuma.array[i] = array[i] + sumandoArray[i];
			}

		}
		if (actualiza)
		{
			array = arraySuma.array;
		}
		return arraySuma;
	}

	public MiArray clone()
	{
		MiArray ret = new MiArray(array.length);

		for (int i = 0; i < array.length; i++)
		{
			ret.array[i] = array[i];
		}
		return ret;
	}

	public MiArray concat(int arrayEnteros[])
	{
		MiArray arrayConcat = new MiArray(array.length + arrayEnteros.length);

		for (int i = 0; i < array.length; i++)
		{
			arrayConcat.array[i] = array[i];
		}

		for (int i = array.length; i < arrayEnteros.length + array.length; i++)
		{
			arrayConcat.array[i] = arrayEnteros[i - array.length];
		}

		return arrayConcat;

	}

}
