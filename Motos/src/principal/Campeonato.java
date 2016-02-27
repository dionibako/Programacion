package principal;

import clases.Equipo;
import clases.Piloto;

public class Campeonato
{

	public static void main(String[] args)
	{

		// pilotos
		Piloto marquez = new Piloto("Marc Marquez", "Español", 59, 23, 90);
		Piloto pedrosa = new Piloto("Dani Pedrosa", "Español", 51, 30, 80);
		Piloto lorenzo = new Piloto("Jorgue Lorenzo", "Español", 64, 28, 75);
		Piloto rossi = new Piloto("Valentino Rossi", "Italiano", 65, 37, 50);

		Piloto[] pilotosHonda = new Piloto[2];
		pilotosHonda[0] = marquez;
		pilotosHonda[1] = pedrosa;
		Piloto[] pilotosYamaha = new Piloto[2];
		pilotosYamaha[0] = lorenzo;
		pilotosYamaha[1] = rossi;

		// equipos
		Equipo honda = new Equipo("Honda", "Juan", "Japones", 50, pilotosHonda, 0);
		Equipo yamaha = new Equipo("Yamaha", "Jose", "Japones", 60, pilotosYamaha, 0);
		Equipo[] equipos = new Equipo[2];
		equipos[0] = honda;
		equipos[1] = yamaha;

		System.out.println("Clasificacion Pilotos\n----------------------");
		for (int i = 0; i < equipos.length; i++)
		{
			equipos[i].mostrarClasiPilotos();
			;
		}

		System.out.println("\nClasificacion Equipos\n----------------------");

		for (int i = 0; i < equipos.length; i++)
		{
			equipos[i].mostrarClasiGeneral();
		}
	}

}
