import java.util.Scanner;

public class veintiuno
{

	public static void main(String[] args)
	{

		String opcion;
		do
		{
			System.out.println("Introduce grados centigrados");

			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			int numero = Integer.valueOf(sc.nextLine());// se hace integer para
														// eliminar el salto de
														// linea del buffer para
														// el siguiente scanner

			System.out.println(numero + "ºCentigrados son: " + (numero + 273.15) + " Kelvin.");

			System.out.println("¿Quieres volver a calcular otro valor. S/N?");
			opcion = sc.nextLine();

		} while (opcion.compareTo("N") != 0);
		System.out.println("Adios.");

	}

}
