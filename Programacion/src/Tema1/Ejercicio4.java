package Tema1;

public class Ejercicio4 {

	public static void main(String[] args)
	{

		double radio = Double.valueOf(args[0]); // insertamos el valor del radio
		double pi = 3.1415926535; // declaramos la variable pi

		double area = pi * (radio * radio); // calcula el area
		double perimetro = 2 * pi * radio; // calcula el perimetro

		// imprime por pantalla

		System.out.println("El radio de la circunferencia es " + radio + " . El area es " + area + " y el perimetro es "
		        + perimetro);

	}
}
