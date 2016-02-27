package Tema1;

public class Ejercicio3 {

	public static void main(String[] args)
	{

		int t = Integer.valueOf(args[0]); // introducimos el valor en segundos

		int segundos = t % 60; // cogemos el resto para saber los segundos
		int min = t / 60; // dividimos el tiempo entre 60 para saber los minutos
		int minutos = min % 60; // cogemos el resto para saber los minutos
		                        // reales
		int horas = t / 3600; // dividimos entre 3600 para saber las horas

		// imprimimos por pantalla

		System.out
		        .println(t + " segundos son, " + horas + " horas," + minutos + " minutos, " + segundos + " segundos.");

	}

}
