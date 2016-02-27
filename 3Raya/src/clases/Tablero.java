package clases;

import java.util.Random;
import java.util.Scanner;

public class Tablero
{
	char[][] tablero = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
	String ficha1 = " ";
	String ficha2 = " ";

	public void mostrarTablero() // recorre el tablero
	{
		System.out.print(" ");
		for (int j = 0; j < tablero.length; j++)
		{
			System.out.print(" " + (j + 1));
		}
		System.out.println();
		for (int i = 0; i < tablero.length; i++)
		{
			System.out.print(i + 1);
			for (int j = 0; j < tablero.length; j++)
			{
				System.out.print("|" + tablero[i][j]);
			}
			System.out.println("|");
		}

	}

	public void escogerFicha() // escoger ficha
	{
		System.out.println(
				"Escoge una ficha:\nPulsa 1 para escoger X.\nPulsa 2 para escoger O\nPulsa 3 para escoger aleatoriamente");
		int numero = 0;
		Random ale = new Random();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		numero = sc.nextInt();

		if (numero == 3)
		{
			numero = ale.nextInt(2) + 1;
		} else if (numero == 1)
		{
			ficha1 = "X";
			ficha2 = "O";
			System.out.println("Juegas con: " + ficha1);
		} else if (numero == 2)
		{
			ficha1 = "X";
			ficha2 = "O";
			System.out.println("Juegas con: " + ficha2);
		} else
		{
			System.out.println("No has escogido una opcion correcta.");
		}
	}

	public boolean isValida(Jugada j) // verifica que puedas poner la ficha en
										// la posicion
	{
		if (tablero[j.fila][j.columna] == ' ')
		{
			return true;
		} else
		{
			return false;
		}
	}

	public char[][] getTablero()
	{
		return tablero;
	}

	public void setTablero(char[][] tablero)
	{
		this.tablero = tablero;
	}

}
