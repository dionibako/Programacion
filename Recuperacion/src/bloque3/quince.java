package bloque3;

import java.util.Scanner;

public class quince
{

	public static void main(String[] args)
	{
		System.out.println("Introduce un numero del 1 al 12");
		Scanner sc = new Scanner(System.in);
		int mes = 0;
		try
		{
			mes = sc.nextInt();
			nombreMes(mes);
			diasMes(mes);
			comprobarFecha(mes);
		} catch (Exception e)
		{
			System.out.println("Introduce un valor numerico");
		}
		sc.close();
	}

	private static void nombreMes(int mes)
	{
		switch (mes)
		{
		case 1:
			System.out.println("Enero.");
			break;
		case 2:
			System.out.println("Febrero.");
			break;
		case 3:
			System.out.println("Marzo.");
			break;
		case 4:
			System.out.println("Abril.");
			break;
		case 5:
			System.out.println("Mayo.");
			break;
		case 6:
			System.out.println("Junio.");
			break;
		case 7:
			System.out.println("Julio.");
			break;
		case 8:
			System.out.println("Agosto.");
			break;
		case 9:
			System.out.println("Septiembre.");
			break;
		case 10:
			System.out.println("Octubre.");
			break;
		case 11:
			System.out.println("Noviembre.");
			break;
		case 12:
			System.out.println("Diciembre.");
			break;
		}

	}

	public static void comprobarFecha(int mes)
	{
		if (mes > 12 || mes < 1)
			System.out.println("No es una fecha correcta.");
		else
		{
			System.out.println("Es una fecha correcta.");
		}
	}

	public static void diasMes(int mes)
	{
		if (mes == 1 || mes == 3 || mes == 1 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
		{

			System.out.println("Tiene 31 dias.");

		} else if (mes == 4 || mes == 6 || mes == 1 || mes == 9 || mes == 11)
		{

			System.out.println("Tiene 31 dias.");

		} else if (mes == 2)
		{

			System.out.println("Tiene 28 dias");

		}
	}

}
