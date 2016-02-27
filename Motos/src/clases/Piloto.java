package clases;

public class Piloto
{
	String nombre;
	String nacionalidad;
	int peso;
	int edad;
	int puntos;

	public Piloto(String nombre, String nacionalidad, int peso, int edad, int puntos)
	{
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.peso = peso;
		this.edad = edad;
		this.puntos = puntos;
	}

	@Override
	public String toString()
	{
		return "Piloto: " + nombre + ", nacionalidad=" + nacionalidad + ", peso=" + peso + ", edad=" + edad
				+ ", puntos=" + puntos + "]";
	}

	public int getPuntos()
	{
		return puntos;
	}

	public void setPuntos(int puntos)
	{
		this.puntos = puntos;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public String getNacionalidad()
	{
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad)
	{
		this.nacionalidad = nacionalidad;
	}

	public int getPeso()
	{
		return peso;
	}

	public void setPeso(int peso)
	{
		this.peso = peso;
	}

	public int getEdad()
	{
		return edad;
	}

	public void setEdad(int edad)
	{
		this.edad = edad;
	}

}
