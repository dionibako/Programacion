package principal;

import java.util.Scanner;

import clases.Jugada;
import clases.Tablero;

public class TresEnRaya
{
	static Tablero tab = new Tablero();

	public static void main(String[] args)
	{
		mostrarMenu();
	}

	public static void mostrarMenu() // menu
	{
		int opcionMenu;
		// menu
		do
		{
			System.out.println("---------------------------");
			System.out.println("| Pulsa 1 para: P1 VS CPU |");
			System.out.println("| Pulsa 2 para: P1 VS P2  |");
			System.out.println("|   Pulsa 3 para: Salir   |");
			System.out.println("---------------------------");

			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			opcionMenu = sc.nextInt();

			switch (opcionMenu)
			{
			case 1:
				tab.escogerFicha();
				tab.mostrarTablero();
				leerJugada();

				break;
			case 2:
				System.out.println("Opcion2");
				break;
			case 3:
				System.out.println("Vuelve Pronto\n");
				System.out.println("   |X| | |");
				System.out.println("   | |A| |");
				System.out.println("   | | |O|");
				break;
			default:
				System.out.println("Introduce un numero valido.");
			}
		} while (opcionMenu != 3);
	}

	public static Jugada leerJugada() // introducir parametros
	{
		System.out.println("Introduce Fila.");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int columna = Integer.valueOf(sc.nextLine());

		System.out.println("Introduce Columna.");
		int fila = Integer.valueOf(sc.nextLine());
		Jugada ju = new Jugada(columna, fila);
		return ju;
	}

	public void jugarPartida(){
		boolean valida = false;
		Jugada jugada;
		int nJugada = 0;
		do {
			tab.mostrarTablero();
			do{
				// TODO distinguir turno y tipo de jugador
				jugada = leerJugada();
			} while (!tab.isValida(jugada));
			tab.ejecutaJugada(jugada, );
		} while (tab.isGanador(simb) || nJugada==9);
	}
}
