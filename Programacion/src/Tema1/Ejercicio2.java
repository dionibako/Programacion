package Tema1;

public class Ejercicio2 {

	public static void main(String[] args)
	{

		int a = Integer.valueOf(args[0]); // introducimos el valor a
		int b = Integer.valueOf(args[1]); // introducimos el valor b

		// imprimimos los valores por pantalla

		System.out.println("El valor de a es " + a + " y el valor de b es " + b);

		// usamos una tercera variable para intercambiar los valores

		int c = a;
		a = b;
		b = c;

		// volvemos a imprimir por pantalla

		System.out.println("El valor de a es " + a + " y el valor de b es " + b);

	}

}
