package bloque3;

import java.io.IOException;
import java.util.Scanner;

public class Doce
{

	public static void main(String[] args) throws IOException
	{
		System.out.println("Introduce una letra mayuscula o minuscula");
		Scanner sc = new Scanner(System.in);
		char caracter = (char) System.in.read();
		sc.close();

		if (Character.isUpperCase(caracter))
		{
			System.out.println("Es Mayuscula");
		} else
		{
			System.out.println("Es minuscula");
		}
	}

}
