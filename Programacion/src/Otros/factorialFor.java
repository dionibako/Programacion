package Otros;

public class factorialFor {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		int a = Integer.valueOf(args[0]);
		int numero = a;

		for (numero = numero * a; a > 1; a--)
			;
		System.out.println(numero);

	}

}
