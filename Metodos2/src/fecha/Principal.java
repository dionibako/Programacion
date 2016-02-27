package fecha;

public class Principal
{

	public static void main(String[] args)
	{
		Fecha fecha1 = new Fecha(30, 2, 2018);

		System.out.println("¿La fecha es correcta?: " + fecha1.fechaCorrecta());
		System.out.println("");
		System.out.println("Mi fecha es: \n" + fecha1.toString());
		System.out.println("");
		System.out.println("El dia siguiente es: ");
		fecha1.diaSiguiente();
		System.out.println(fecha1.toString());

		for (int i = 1; i < 5; i++)
		{
			fecha1.diaSiguiente();
			System.out.println(fecha1.toString());
		}

	}

}
