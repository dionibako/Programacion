package Tema2POO;

import Tema2POOItems.*;

public class Ejercicio2Main
{
	public static void main(String[] args)
	{
		// Lampara lamparaPasillo;
		// lamparaPasillo = new Lampara();
		// lamparaPasillo.color="Rojo";
		// lamparaPasillo.tulipa=true;

		Lampara lamparaCocina = new Lampara();
		lamparaCocina.color = "Azul";

		Bombilla b = new Bombilla();
		lamparaCocina.bombilla = b;
		lamparaCocina.bombilla.color = "Azul";

		if (lamparaCocina.isEncendida())

			System.out.println("Esta encendida");
		else
			System.out.println("Esta apagada");
	}

}
