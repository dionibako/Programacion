package Tema1;

public class Ejercicio6 {

	public static void main(String[] args)
	{

		float num1 = Float.valueOf(args[0]); // primer numero
		float num2 = Float.valueOf(args[1]); // segundo numero
		float num3 = Float.valueOf(args[2]); // tercer numero
		float num4 = Float.valueOf(args[3]); // cuarto numero

		/*
		 * hacemos la media sumando los valores y diviendiendo entre el numero
		 * de valores
		 */

		float media = (num1 + num2 + num3 + num4) / 4;

		/* imprimimos por pantalla */

		System.out
		        .println("La media de " + num1 + " + " + num2 + " + " + num3 + " + " + num4 + " es igual a: " + media);

	}
}
