package Ejemplos;

public class EjemploIf {
	/* declaramos dos constantes para hacer el descuento */
	final static float DESCUENTOJOVEN = 30;
	final static float DESCUENTOMAYOR = 50;
	final static float DESCUENTOFAMILIA = 20;

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		float costeBillete = 50; // precio del billete general
		int edad = Integer.valueOf(args[0]); // introducimos la edad
		boolean familiaNumerosa = Boolean.valueOf(args[1]);

		if (edad < 10) // edad menor que 10
		{
			costeBillete = costeBillete * (1 - DESCUENTOJOVEN / 100); // precio
			                                                          // del
			                                                          // billete
			                                                          // general
			                                                          // + el
			                                                          // descuento

		}
		else if (edad > 65) // edad mayor que 65
		{
			costeBillete = costeBillete * (1 - DESCUENTOMAYOR / 100); // precio
			                                                          // del
			                                                          // billete
			                                                          // general
			                                                          // + el
			                                                          // descuento
		}
		else // este else peude supimirse, porque ya esta declarado el valor
		     // antes
			costeBillete = 50;

		if (familiaNumerosa) // este if actua independientemente despues de
		                     // obtener un valor de los otros if
		{
			costeBillete = costeBillete * (1 - DESCUENTOFAMILIA / 100);
		}
		System.out.println("El coste del billete de tren es: " + costeBillete + " €");

	}

}
