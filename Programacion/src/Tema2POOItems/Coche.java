package Tema2POOItems;

public class Coche {

	// Atributos

	String color;
	int velocidad;
	String tipo_rueda;
	String tipo_motor;

	// Metodos

	void arranca()
	{
		System.out.println("El coche ha arrancado");
	}

	void frena()
	{
		System.out.println("El coche ha frenado");
	}

	void dobla(int giro, String lado/* derecha, izquierda */)
	{
		System.out.println("El coche girara a la" + lado + " tantos " + giro + " grados.");
	}

}
