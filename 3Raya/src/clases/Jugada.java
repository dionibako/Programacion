package clases;

public class Jugada
{
	int columna;
	int fila;

	/**
	 * @param columna
	 * @param fila
	 */
	public Jugada(int columna, int fila)
	{
		this.columna = columna;
		this.fila = fila;
	}

	/**
	 * @return the columna
	 */
	public int getColumna()
	{
		return columna;
	}

	/**
	 * @param columna the columna to set
	 */
	public void setColumna(int columna)
	{
		this.columna = columna;
	}

	/**
	 * @return the fila
	 */
	public int getFila()
	{
		return fila;
	}

	/**
	 * @param fila the fila to set
	 */
	public void setFila(int fila)
	{
		this.fila = fila;
	}
	

}
