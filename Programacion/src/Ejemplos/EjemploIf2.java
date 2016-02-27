package Ejemplos;

public class EjemploIf2 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		int x = Integer.valueOf(args[0]);
		int y = Integer.valueOf(args[1]);

		if (mayorcero(x))
		{
			if (mayorcero(y))
			{
				System.out.println("Ambos mayor que 0");
			}
			else
				System.out.println("Y menor que 0");
		}
		else
			System.out.println("x menor que 0");
	}

	static public boolean mayorcero(int n)
	{
		boolean ret;
		if (n > 0)
			ret = true;
		else
			ret = false;
		return ret;

	}

}
