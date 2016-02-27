package bloque6;

public class veintinueveEmpleado
{

	String nombre = " ";
	int sueldo = 0;

	/**
	 * @param nombre
	 * @param sueldo
	 */
	public veintinueveEmpleado(String nombre, int sueldo)
	{
		this.nombre = nombre;
		this.sueldo = sueldo;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public int getSueldo()
	{
		return sueldo;
	}

	public void setSueldo(int sueldo)
	{
		this.sueldo = sueldo;
	}

}
