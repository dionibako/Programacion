package bloque2;
import java.util.Scanner;

public class Ocho
{

	public static void main(String[] args)
	{
		System.out.println("Introduce el radio de la circunferencia");

		Scanner sc = new Scanner(System.in);
		double radio = sc.nextInt();

		System.out.println("La longitud es: " + (2 * Math.PI * radio));
		System.out.println("El area es: " + (Math.PI * Math.pow(radio, 2)));

		sc.close();
	}

}
