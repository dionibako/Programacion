package bloque6;

import java.util.Scanner;

public class veintinuevePrincipal
{

	public static void main(String[] args)
	{
		int arrayEmple[] = new int[2];

		for (int i = 0; i < arrayEmple.length; i++)
		{
			System.out.println("Introduce el nombre del empleado " + (i + 1));

			Scanner sc = new Scanner(System.in);
			String nombre = sc.nextLine();
			System.out.println("Introduce el sueldo del empleado " + (i + 1));
			int sueldo = sc.nextInt();
			veintinueveEmpleado empleado = new veintinueveEmpleado(nombre, sueldo);
			empleado.setNombre(nombre);
			empleado.setSueldo(sueldo);
			int sueldoAlto = 0;
			String nombreMayor = "";
			if (sueldoAlto < empleado.getSueldo())
			{
				sueldoAlto = empleado.getSueldo();
				nombreMayor = empleado.getNombre();
			}

			System.out.println("El sueldo mas alto es de " + nombreMayor + " " + sueldoAlto);

		}

	}

}
