package clases;

public class Componente
{
	Ingrediente ingredientes;
	int cantidad;

	public Componente(Ingrediente ingredientes, int cantidad)
	{
		this.ingredientes = ingredientes;
		this.cantidad = cantidad;
	}
	
	

	@Override
	public String toString()
	{
		return "Componente: " + ingredientes + ", Cantidad: " + cantidad + "";
	}



	public Ingrediente getIngredientes()
	{
		return ingredientes;
	}

	public void setIngredientes(Ingrediente ingredientes)
	{
		this.ingredientes = ingredientes;
	}

	public int getCantidad()
	{
		return cantidad;
	}

	public void setCantidad(int cantidad)
	{
		this.cantidad = cantidad;
	}
}
