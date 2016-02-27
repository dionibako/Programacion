package clases;

public class Ingrediente
{
	String nombre;
	String tipo;

	@Override
	public String toString()
	{
		return "Ingrediente: " + nombre + ", Tipo: " + tipo + "";
	}

	public Ingrediente(String nombre, String tipo)
	{
		this.nombre = nombre;
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

	public String getTipo()
	{
		return tipo;
	}

	public void setTipo(String tipo)
	{
		this.tipo = tipo;
	}
	
	

}
