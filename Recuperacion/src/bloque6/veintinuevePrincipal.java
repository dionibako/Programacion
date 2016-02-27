package bloque6;

import java.util.Scanner;

public class veintinuevePrincipal
{

	public static void main(String[] args)
	{
		veintinuevePrincipal arrayEmple[] = new veintinuevePrincipal[2];
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
			int sueldoAlto = 0;
			String nombreMayor = "";
			if (empleado.getSueldo() < empleado.getSueldo())
			{
				sueldoAlto = empleado.getSueldo();
				nombreMayor = empleado.getNombre();
			}

			System.out.println("El sueldo mas alto es de " + nombreMayor + " " + sueldoAlto);

		}

	}

}
