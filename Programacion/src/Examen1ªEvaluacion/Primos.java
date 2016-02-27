package Examen1ªEvaluacion;

public class Primos
{

	public static void main(String[] args)
	{
		int n = Integer.valueOf(args[0]);

		for (int i = 1; i <= n; i += 2)
		{
			for (int j = 1; j < i; j++)
			{
				if (i % j != 0 && i % j == 1)
				{
					System.out.print(i + " ");

				}

			}
			
		}

	}

}
