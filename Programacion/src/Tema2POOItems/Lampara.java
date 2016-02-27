package Tema2POOItems;

public class Lampara {
	// Atributos

	public String tipo_pie;
	public String color;
	public Boolean tulipa;
	public Bombilla bombilla;
	public boolean encendida = false;

	// Metodos

	void encendida()
	{
		encendida = true;
		bombilla.darLuz();
	}

	void apagada()
	{
		encendida = false;
		bombilla.quitarLuz();
	}

	public boolean isEncendida()
	{
		return encendida;
	}

}
