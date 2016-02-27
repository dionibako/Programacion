package clases;

import java.util.Scanner;

public class Ficha
{
	char ficha;
	int fichaOpcion;

	public char elegirFicha()
	{

		System.out.println("Pulsa 1 para Jugar con O");
		System.out.println("Pulsa 2 para Jugar con X");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		fichaOpcion = sc.nextInt();

		switch (fichaOpcion)
		{
		case 1:
			ficha = 'O';
			System.out.println("Juegas con O");
			break;
		case 2:
			ficha = 'X';
			System.out.println("Juegas con X");
			break;

		}
		return ficha;

	}

	/**
	 * @return the ficha
	 */
	public char getFicha()
	{
		return ficha;
	}

	/**
	 * @param ficha
	 *            the ficha to set
	 */
	public void setFicha(char ficha)
	{
		this.ficha = ficha;
	}

}
