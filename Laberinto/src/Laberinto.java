
public class Laberinto {
	int alto;
	int ancho;
	int nEnemigos;

	int inicioX;
	int inicioY;
	int salidaX;
	int salidaY;

	char mapa[][];

	/**
	 * @return the alto
	 */
	public int getAlto()
	{
		return alto;
	}

	/**
	 * @param alto
	 *            the alto to set
	 */
	public void setAlto(int alto)
	{
		this.alto = alto;
	}

	/**
	 * @return the ancho
	 */
	public int getAncho()
	{
		return ancho;
	}

	/**
	 * @param ancho
	 *            the ancho to set
	 */
	public void setAncho(int ancho)
	{
		this.ancho = ancho;
	}

	/**
	 * @return the nEnemigos
	 */
	public int getnEnemigos()
	{
		return nEnemigos;
	}

	/**
	 * @param nEnemigos
	 *            the nEnemigos to set
	 */
	public void setnEnemigos(int nEnemigos)
	{
		this.nEnemigos = nEnemigos;
	}

	/**
	 * @return the inicioX
	 */
	public int getInicioX()
	{
		return inicioX;
	}

	/**
	 * @param inicioX
	 *            the inicioX to set
	 */
	public void setInicioX(int inicioX)
	{
		this.inicioX = inicioX;
	}

	/**
	 * @return the inicioY
	 */
	public int getInicioY()
	{
		return inicioY;
	}

	/**
	 * @param inicioY
	 *            the inicioY to set
	 */
	public void setInicioY(int inicioY)
	{
		this.inicioY = inicioY;
	}

	/**
	 * @return the salidaX
	 */
	public int getSalidaX()
	{
		return salidaX;
	}

	/**
	 * @param salidaX
	 *            the salidaX to set
	 */
	public void setSalidaX(int salidaX)
	{
		this.salidaX = salidaX;
	}

	/**
	 * @return the salidaY
	 */
	public int getSalidaY()
	{
		return salidaY;
	}

	/**
	 * @param salidaY
	 *            the salidaY to set
	 */
	public void setSalidaY(int salidaY)
	{
		this.salidaY = salidaY;
	}

	/**
	 * @return the mapa
	 */
	public char[][] getMapa()
	{
		return mapa;
	}

	/**
	 * @param mapa
	 *            the mapa to set
	 */
	public void setMapa(char[][] mapa)
	{
		this.mapa = mapa;
	}

	public void mostrarMapa()
	{

		for (int i = 0; i < mapa.length; i++)
		{
			for (int j = 0; j < mapa[i].length; j++)
			{
				System.out.print(mapa[i][j]);
			}
			System.out.println(" ");

		}
		System.out.println("____________________________________\n");

	}
}
