package clases;

public class Animal
{
	String tipo;
	String nombre;
	int peso;
	String cuidador;

	public Animal(String tipo, String nombre, int peso, String cuidador)
	{
		this.tipo = tipo;
		this.nombre = nombre;
		this.peso = peso;
		this.cuidador = cuidador;
	}

	public String getTipo()
	{
		return tipo;
	}

	public void setTipo(String tipo)
	{
		this.tipo = tipo;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public int getPeso()
	{
		return peso;
	}

	public void setPeso(int peso)
	{
		this.peso = peso;
	}

	public String getCuidador()
	{
		return cuidador;
	}

	public void setCuidador(String cuidador)
	{
		this.cuidador = cuidador;
	}

}
