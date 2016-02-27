package Tema1;

public class Ejercicio5 {

	public static void main(String[] args)
	{

		int dinero = Integer.valueOf(args[0]); // la variable dinero almacena el
		                                       // valor que introduzcamos por
		                                       // pantalla

		/*
		 * calculamos el valor de mayor a menor y con el resto podemos calcular
		 * los siguientes valores
		 */

		int quinientos = dinero / 500;
		int restoquinientos = dinero % 500;
		int doscientos = restoquinientos / 200;
		int restodoscientos = restoquinientos % 200;
		int cien = restodoscientos / 100;
		int restocien = restodoscientos % 100;
		int cincuenta = restocien / 50;
		int restocincuenta = restocien % 50;
		int veinte = restocincuenta / 20;
		int restoveinte = restocincuenta % 20;
		int diez = restoveinte / 10;
		int restodiez = restoveinte % 10;
		int cinco = restodiez / 5;
		int restocinco = restodiez % 5;
		int dos = restocinco / 2;
		int restodos = restocinco % 2;
		int uno = restodos / 1;

		// imprimimos por pantalla

		System.out.println(dinero + " euros son: \n" + quinientos + " billete de 500, \n" + doscientos
		        + " billete de 200, \n" + cien + " billete de 100, \n" + cincuenta + " billete de 50, \n" + veinte
		        + " billetes de 20, \n" + diez + " billetes de 10, \n" + cinco + " billetes de 5, \n" + dos
		        + " monedas de 2, \n" + uno + " monedas de 1.");
	}
}
