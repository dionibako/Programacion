package AuxArray;

public class Principal
{

	public static void main(String[] args)
	{
		int[] array1 = { 1, 5, 8, 9, 10 };
		int[] array2 = { 7, 2, 8 };
		int[] array3 = { 1, 2, 3, 4, 5, 6, 7 };
		String[] array4 = { "D", "I", "O", "N", "I" };

		System.out.println("Casillas que no coinciden: " + AuxArray.comparaArrays(array1, array2));

		System.out.println("El numero menor es: " + AuxArray.encuentraMenorArray(array1));

		System.out.println("El numero mayor es: " + AuxArray.encuentraMayorArray(array1));

		System.out.println("Array ordenado: " + AuxArray.toString(AuxArray.ordenaArray(array1, false)));

		System.out.println("Elima valor: " + AuxArray.toString(AuxArray.eliminaValorArray(array3, 5)));

		System.out.println("La combinacion es: " + AuxArray.toString(AuxArray.combinaArrays(array1, array2)));

		System.out.println("String array: " + AuxArray.toString(AuxArray.ordenaArrayPoli(array4)));

		System.out.println("Combinacion Aleatorio: " + AuxArray.toString(AuxArray.mezclaArrays(array2, array1)));

	}

}
