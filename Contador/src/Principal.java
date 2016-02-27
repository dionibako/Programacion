
public class Principal
{

	public static void main(String[] args)
	{
		MiArray array1 = new MiArray();
		MiArray array2 = new MiArray(2);
		MiArray array3 = new MiArray(4, 5);
		MiArray array4 = new MiArray(5);

		int[] array5 = { 2, 4, 5, 6, 7, 8, 9, 5, 1, 2, 36 };

		System.out.println("El array es: " + array1.toString());
		System.out.println("El array es: " + array2.toString());
		System.out.println("El array es: " + array3.toString());

		array1.inicializa(8);
		System.out.println("El array es: " + array1.toString());

		array3.resetea();
		System.out.println("El array es: " + array3.toString());

		System.out.println("Suma: " + array1.sumaValores());
		System.out.println("Pares: " + array1.pares());
		System.out.println("Impares: " + array1.impares());

		array4.array[0] = 3;
		array4.array[1] = 4;
		array4.array[2] = -7;
		array4.array[3] = 5;
		array4.array[4] = 5;

		System.out.println("Contiene " + array4.contains(5));

		System.out.println("Numero de ocurrencias: " + array4.count(4));

		array4.show();

		System.out.println("Suma de array: " + array4.sumaArray(array5, true));
		System.out.println("El array clonado es: " + array4.clone());

		System.out.println("Concatenacion" + array4.concat(array5));

	}

}
