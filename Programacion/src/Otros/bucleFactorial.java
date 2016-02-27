package Otros;

public class bucleFactorial {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		int a = Integer.valueOf(args[0]);
		int resultado = a;

		while (a > 1)
		{
			a--;
			resultado = resultado * a;
			System.out.println(resultado);
		}
	}

}
