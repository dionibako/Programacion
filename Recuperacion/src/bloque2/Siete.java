package bloque2;
import java.util.Scanner;

public class Siete
{

	public static void main(String[] args)
	{
		System.out.println("Introduce grados centigrados");

		Scanner sc = new Scanner(System.in);
		double valor = sc.nextInt();
		double aux = valor;

		System.out.println(aux + "ºC son " + (32 + 9 * (valor / 5) + "ºF"));
		sc.close();

	}

}
