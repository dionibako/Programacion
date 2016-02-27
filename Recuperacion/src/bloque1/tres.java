package bloque1;

public class tres
{

	public static void main(String[] args)
	{
		int a = 2;
		int b = 4;
		int c = 5;
		int d = 3;
		int auxiliar;

		System.out.println("A vale: " + a);
		System.out.println("B vale: " + b);
		System.out.println("C vale: " + c);
		System.out.println("D vale: " + d);
		System.out.println(" ");

		auxiliar = b;
		b = c;
		c = a;
		a = d;
		d = auxiliar;

		System.out.println("A vale: " + a);
		System.out.println("B vale: " + b);
		System.out.println("C vale: " + c);
		System.out.println("D vale: " + d);

	}

}
