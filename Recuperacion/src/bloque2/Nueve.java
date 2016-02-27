package bloque2;
import java.util.Scanner;

public class Nueve
{

	public static void main(String[] args)
	{
		System.out.println("Introduce velocidad en Hm/h.");
		Scanner sc = new Scanner(System.in);
		double velocidad = sc.nextInt();
		sc.close();

		System.out.println(velocidad + " Km/h son " + (velocidad * 1000) / 3600 + " m/s.");

	}

}
