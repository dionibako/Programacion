import java.util.Scanner;

public class RegistroCenso
{
	static protected String[] personas;
	static int contador = 0;

	public static void main(String[] args)
	{
		personas = new String[2];
		int opcion;
		do
		{
			mostrarOpciones();
			opcion = leerOpcion();
			if (opcion == 1)
			{
				registraPersona();
			}
			if (opcion == 2)
			{
				try
				{
					buscarPersona();
				} catch (PersonaNoEncontradaExcepcion e)
				{
					System.out.println(e.getMessage());
				}
			}
		} while (opcion != 3);
		System.out.println("Adios");

	}

	public static void buscarPersona() throws PersonaNoEncontradaExcepcion
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String nombre = sc.nextLine();
		try
		{
			for (int i = 0; i < personas.length; i++)
			{
				if (personas[i].compareTo(nombre) == 0)
				{
					System.out.println(nombre + " esta registrado en el censo.\n");
					return;
				}
			}
			PersonaNoEncontradaExcepcion e = new PersonaNoEncontradaExcepcion();
			{
				e.nombre = nombre;
				throw e;
			}
		} catch (NullPointerException e)
		{
			System.out.println("Todavia hay valores null.\n");
		}

	}

	private static int leerOpcion()
	{
		@SuppressWarnings("resource")
		Scanner sc1 = new Scanner(System.in);
		int opcion = sc1.nextInt();
		return opcion;
	}

	private static void mostrarOpciones()
	{
		System.out.println("Bienvenidos al Censo");
		System.out.println("Pulsa 1 para Registrar una persona");
		System.out.println("Pulsa 2 para Buscar una persona");
		System.out.println("Pulsa 3 para Salir");
	}

	private static void registraPersona()
	{
		System.out.println("Introduce un nombre:");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String nombre = sc.nextLine();
		try
		{
			personas[contador] = nombre;
		} catch (ArrayIndexOutOfBoundsException e)
		{
			contador = 0;
			personas[contador] = nombre;
			System.out.println("Se ha reiniciado el registro y el primero nombre es: " + nombre);
		} finally
		{
			contador++;
		}

	}
}
