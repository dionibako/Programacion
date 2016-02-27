package ejer3;

import java.util.Scanner;

public class ED
{
	public static void main(String[] args)
	{
		int numero, potencia;
		numero = Integer.valueOf(args[0]);
		int i = 1;
		potencia = Integer.valueOf(args[1]);
		int resultado = 1;
		while (i <= potencia)
		{
			resultado *= numero;
			i++;
		}
		System.out.print("La potencia " + potencia + " del numero " + numero + " es ");
		System.out.print(resultado);

		Scanner sc = new Scanner(System.in);
		System.out.print("\nEscribe tu nombre: ");
		String nombre = sc.nextLine();
		System.out.print("Escribe la nota que quieres: ");
		int nota = sc.nextInt();
		sc.close();

		System.out.println(devolverMensaje(nota, nombre));
	}

	public static String devolverMensaje(int nota, String nombre)
	{

		System.out.println("calculando resultado");
		String res = nombre + ", ";
		if (nota <= 5)
			res += "te voy a colgar de las orejas";
		else if (nota < 6)
			res += "no hay que conformarse con aprobar";
		else if (nota < 8)
			res += "vas en buen camino";
		else if (nota < 9)
			res += "a ver si es verdad";
		else if (nota < 10)
			res += "no te vengas arriba";
		else
			res = "xD xD xD xD";
		return res;
	}
}
