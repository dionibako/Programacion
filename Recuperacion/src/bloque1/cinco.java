package bloque1;

public class cinco
{

	public static void main(String[] args)
	{
		int c = 5;
		System.out.println("C vale: " + c);
		System.out.println(c + (c % 2 == 0 ? " Es par." : " Es impar."));
		System.out.println(c + (c >= 0 ? " Es positivo." : " Es negativos."));
		System.out.println(c + (c % 5 == 0 ? " Es multiplo de 5." : " No es multiplo de 5."));
		System.out.println(c + (c % 10 == 0 ? " Es multiplo de 10." : " No es multiplo de 5."));
		System.out.println(c + (c > 100 ? " Es mayor que 100." : " Es menor que 100."));

	}

}
