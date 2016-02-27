package principal;

import java.util.Scanner;

import clases.Animal;
import clases.Zona;

public class Zoo
{
	String nombre = "Wild Life Adventure";
	String ubicacion = "av/de las Matas";
	int presupuesto = 356090;
	Zona[] zonas;

	public static void main(String[] args)
	{

		// Animales
		// mamiferos
		Animal camello = new Animal("Mamifero", "Camello", 250, "Tarzan");
		Animal tigre = new Animal("Mamifero", "Tigre", 100, "Tarzan");
		Animal puma = new Animal("Mamifero", "Puma", 250, "Juan");
		Animal orca = new Animal("Mamifero", "Orca", 1000, "Willy");

		// reptiles
		Animal serpiente = new Animal("Reptil", "Serpiente", 6, "Tarzan");
		Animal tortuga = new Animal("Reptil", "Tortuga", 25, "Juan");
		Animal dragonKomodo = new Animal("Reptil", "Dragon de Komodo", 80, "Tarzan");
		Animal camaleon = new Animal("Reptil", "Camaleon", 1, "Willy");

		// peces
		Animal tiburon = new Animal("Pez", "Tiburon", 230, "Tarzan");
		Animal piraña = new Animal("Pez", "Piraña", 4, "Juan");
		Animal percaNilo = new Animal("Pez", "Perca del Nilo", 30, "Tarzan");
		Animal pezLoro = new Animal("Pez", "Pez Loro", 6, "Juan");

		// zonas
		// selva
		Animal[] animalesSelva = new Animal[5];
		animalesSelva[0] = tigre;
		animalesSelva[1] = puma;
		animalesSelva[2] = serpiente;
		animalesSelva[3] = camaleon;
		animalesSelva[4] = tortuga;
		Zona selva = new Zona("Selva", 10, 20, 25, "Yimmy", animalesSelva);

		// acuario
		Animal[] animalesAcuario = new Animal[5];
		animalesAcuario[0] = tiburon;
		animalesAcuario[1] = piraña;
		animalesAcuario[2] = percaNilo;
		animalesAcuario[3] = pezLoro;
		animalesAcuario[4] = orca;
		Zona acuario = new Zona("Acuario", 12, 19, 50, "Capitan Pescanova", animalesAcuario);

		// desierto
		Animal[] animalesDesierto = new Animal[2];
		animalesDesierto[0] = camello;
		animalesDesierto[1] = dragonKomodo;
		Zona desierto = new Zona("Desierto", 10, 15, 10, "Lorens de Arabia", animalesDesierto);

		Zona[] zonas = new Zona[3];
		zonas[0] = selva;
		zonas[1] = acuario;
		zonas[2] = desierto;

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una Zona");
		String opcionZona = sc.next();

		for (int i = 0; i < zonas.length; i++)
		{
			if (zonas[i].getNombreZona().compareTo(opcionZona) == 0)
			{
				zonas[i].mostarAnimales();
			}
		}

		System.out.println("Introduce un Tipo");
		String opcionTipo = sc.next();

		for (int i = 0; i < zonas.length; i++)
		{
			zonas[i].mostrarAnimalTipo(opcionTipo);
		}

		System.out.println("Introduce un Cuidador");
		String opcionCuidador = sc.next();

		for (int i = 0; i < zonas.length; i++)
		{
			zonas[i].mostrarCuidador(opcionCuidador);

		}

		sc.close();

	}

}
