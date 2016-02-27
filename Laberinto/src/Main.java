
import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		System.out.println("Bienvenido al Corredor del Laberinto");

		ConjuntoLaberintos labs = new ConjuntoLaberintos();

		Scanner menu = new Scanner(System.in);

		int opcion;
		do
		{
			System.out.println("Selecciona una opcion:\n");
			System.out.println("Pulsa 1 para Jugar.");
			System.out.println("Pulsa 2 para ver los Mapas.\n");
			opcion = Integer.valueOf(menu.nextLine());
			if (opcion == 1)
			{
				System.out.println("Elige mapa.");

			}

			else if (opcion == 2)
			{
				for (int i = 0; i < labs.getnLaberintos(); i++)
				{
					System.out.println("Esta es la opción: " + i);
					labs.laberintos[i].mostrarMapa();
				}
			}

		}
		while (opcion != 3);
		System.out.println("Gracias por jugar.");
		menu.close();
	}

}
