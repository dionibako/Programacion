package bloque4;

import java.util.Scanner;

public class Diecinueve
{

	public static void main(String[] args)
	{
		int inicio = 1;
		int suma = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
		int numero = sc.nextInt();
		do
		{
			inicio++;
			if (inicio % 2 != 0)
			{
				suma += inicio;
			}

		} while (inicio < numero);
		System.out.println("La suma de los numeros impares anteriores a " + numero + " es: " + suma);
		sc.close();
	}

}
