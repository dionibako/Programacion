package MazeRunner;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		ConjuntoLaberintos lab = new ConjuntoLaberintos();
		System.out.println("Bienvenido al Corredor del Laberinto");
		System.out.println("Pulsa 1 para jugar");
		System.out.println("Pulsa 2 para ver los mapas");

		Scanner menu = new Scanner(System.in);
		int opcion = Integer.valueOf(menu.nextLine());

		switch (opcion)
		{
			case 1:
				System.out.println("Elige mapa.");
				break;
			case 2:
				System.out.println("Aqui tienes los mapas.");
				for (int i = 0; i < lab.getnLaberintos(); i++)
				{
					System.out.println("Esta es la opcion " + i);
					lab.laberintos[i].mostrar_mapas();
				}
				break;
			default:
				System.out.println("Introduce un numero correcto");
		}
		menu.close();
	}

}
