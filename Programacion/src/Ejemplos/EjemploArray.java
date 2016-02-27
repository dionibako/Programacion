package Ejemplos;

public class EjemploArray {

	public static void main(String[] args)
	{
		int numeros[] = new int[10];
		int otrosNumeros[] = { 2, 4, 5, 6 };

		int l = numeros.length;
		System.out.println("Longitud de Numeros: " + l);

		l = otrosNumeros.length;
		System.out.println("Longitud de otrosNumeros: " + l);

		char milion[] = { 67, 65, 'R', 'M', 'I', 'L', 'I', 'O', 'N' };

		for (int i = 0; i < milion.length; i++)
		{
			System.out.print(milion[i]);
		}
	}
}
