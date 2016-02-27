package bloque2;

import java.util.Scanner;

public class Diez
{

	public static void main(String[] args)
	{
		System.out.println("Introduce un numero como maximo de 5 cifras");
		Scanner sc = new Scanner(System.in);

		int numero = sc.nextInt();
		int numerofijo = numero;

		System.out.println("Tu numero es " + numerofijo);
		System.out.println("El " + numerofijo + " tiene " + numero / 10000 + " decenas de millar.");
		numero = numero % 10000;
		System.out.println("El " + numerofijo + " tiene " + numero / 1000 + " unidades de millar.");
		numero = numero % 1000;
		System.out.println("El " + numerofijo + " tiene " + numero / 100 + " centenas.");
		numero = numero % 100;
		System.out.println("El " + numerofijo + " tiene " + numero / 10 + " decenas.");
		numero = numero % 10;
		System.out.println("El " + numerofijo + " tiene " + numero / 1 + " unidades.");
		sc.close();

	}

}
