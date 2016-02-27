package clases;

public class Plato
{
	String nombre;
	Componente[] receta;
	int precio;
	String dificultad;

	public Plato(String nombre, String categoria, Componente[] receta, int precio, String dificultad)
	{
		this.nombre = nombre;
		this.receta = receta;
		this.precio = precio;
		this.dificultad = dificultad;
	}

	public void mostrarRecetas()
	{
		for (int i = 0; i < receta.length; i++)
		{
			System.out.println(receta[i] + "");
		}
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public Componente[] getReceta()
	{
		return receta;
	}

	public void setReceta(Componente[] receta)
	{
		this.receta = receta;
	}

	public int getPrecio()
	{
		return precio;
	}

	public void setPrecio(int precio)
	{
		this.precio = precio;
	}

	public String getDificultad()
	{
		return dificultad;
	}

	public void setDificultad(String dificultad)
	{
		this.dificultad = dificultad;
	}

}
