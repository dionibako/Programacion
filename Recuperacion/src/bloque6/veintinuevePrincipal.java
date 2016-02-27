package bloque6;

import java.util.Scanner;

public class veintinuevePrincipal
{

	public static void main(String[] args)
	{
		veintinueveEmpleado arrayEmple[] = new veintinueveEmpleado[10];
		int count = 0;
		for (int i = 0; i < arrayEmple.length; i++)
		{
			System.out.println("Introduce el nombre del empleado " + (i + 1));

			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			String nombre = sc.nextLine();
			System.out.println("Introduce el sueldo del empleado " + (i + 1));
			int sueldo = sc.nextInt();
			veintinueveEmpleado empleado = new veintinueveEmpleado(nombre, sueldo);
			arrayEmple[i] = empleado;
		}

		for (int j = 0; j < arrayEmple.length; j++)
		{

			if (arrayEmple[count].getSueldo() < arrayEmple[j].getSueldo())
			{
				count = j;
			}

		}

		System.out.println(
				"El sueldo mas alto es de " + arrayEmple[count].getNombre() + " " + arrayEmple[count].getSueldo());

	}

}
