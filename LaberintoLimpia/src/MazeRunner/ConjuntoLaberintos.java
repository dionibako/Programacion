package MazeRunner;

public class ConjuntoLaberintos {
	Laberinto laberintos[];
	
	public ConjuntoLaberintos()
	{
		laberintos = new Laberinto[2];
		
		Laberinto lab1 = new Laberinto();
		lab1.setAlto(10);
		lab1.setAncho(10);
		
		char mapa[][] = {
							{'*','*','*','*','*','*','*','*','*','*',},
							{'*','*','*','*','*','*','*','*','*','*',},
							{'*','*','*','*','*','*','*','*','*','*',},
							{'*','*','*','*','*','*','*','*','*','*',},
							{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',},
							{'*','*','*','*','*','*','*','*','*','*',},
							{'*','*','*','*','*','*','*','*','*','*',},
							{'*','*','*','*','*','*','*','*','*','*',},
							{'*','*','*','*','*','*','*','*','*','*',},
							{'*','*','*','*','*','*','*','*','*','*',}};
		lab1.setMapa(mapa);
		lab1.setInicioX(0);
		lab1.setInicioY(4);
		lab1.setSalidaX(9);
		lab1.setSalidaY(4);
		lab1.setnEnemigos(0);
		laberintos[0] = lab1;
		
		Laberinto lab2 = new Laberinto();
		lab2.setAlto(10);
		lab2.setAncho(10);
		
		char mapa2[][] = {
							{'*','*','*','*','*','*','*','*','*','*',},
							{'*',' ',' ',' ',' ','*','*','*','*','*',},
							{'*',' ','*','*',' ','*',' ','*','*','*',},
							{'*',' ','*','*',' ','*',' ',' ',' ',' ',},
							{' ',' ','*','*',' ','*',' ','*','*','*',},
							{'*','*','*','*',' ','*',' ','*','*','*',},
							{'*','*','*','*',' ','*',' ','*','*','*',},
							{'*','*','*','*',' ','*',' ','*','*','*',},
							{'*','*','*','*',' ',' ',' ',' ',' ','*',},
							{'*','*','*','*','*','*','*','*','*','*',}};
		lab2.setMapa(mapa2);
		lab2.setInicioX(0);
		lab2.setInicioY(4);
		lab2.setSalidaX(9);
		lab2.setSalidaY(3);
		lab2.setnEnemigos(0);
		laberintos[1] = lab2;
	}

	/**
	 * @return the laberintos
	 */
	public Laberinto[] getLaberintos() {
		return laberintos;
	}

	/**
	 * @param laberintos the laberintos to set
	 */
	public void setLaberintos(Laberinto[] laberintos) {
		this.laberintos = laberintos;
	}
	
	public int getnLaberintos()
	{
		return laberintos.length;
	}
}