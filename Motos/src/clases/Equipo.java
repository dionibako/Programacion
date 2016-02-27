package clases;

import java.util.Arrays;

public class Equipo
{
	String nombre;
	String director;
	String nacionalidad;
	int presupuesto;
	Piloto[] pilotos;
	int puntos;

	public Equipo(String nombre, String directos, String nacionalidad, int presupuesto, Piloto[] pilotos, int puntos)
	{
		this.nombre = nombre;
		this.director = directos;
		this.nacionalidad = nacionalidad;
		this.presupuesto = presupuesto;
		this.pilotos = pilotos;
		this.puntos = puntos;

	}

	public void mostrarClasiPilotos()
	{
		for (int i = 0; i < pilotos.length; i++)
		{
			System.out.println(pilotos[i].getNombre() + ": " + pilotos[i].getPuntos() + " puntos.");
		}
	}

	public void mostrarClasiGeneral()
	{
		int sumaPuntos = 0;
		for (int i = 0; i < pilotos.length; i++)
		{
			pilotos[i].getPuntos();
			sumaPuntos += pilotos[i].getPuntos();
		}
		System.out.println(nombre + ": " + sumaPuntos + " puntos.");
	}

	@Override
	public String toString()
	{
		return "Director: " + director + ", nacionalidad=" + nacionalidad + ", presupuesto=" + presupuesto
				+ ", pilotos=" + Arrays.toString(pilotos) + "]";
	}

	public int getPuntos()
	{
		return puntos;
	}

	public void setPuntos(int puntos)
	{
		this.puntos = puntos;
	}

	public String getDirector()
	{
		return director;
	}

	public void setDirector(String director)
	{
		this.director = director;
	}

	public String getNacionalidad()
	{
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad)
	{
		this.nacionalidad = nacionalidad;
	}

	public int getPresupuesto()
	{
		return presupuesto;
	}

	public void setPresupuesto(int presupuesto)
	{
		this.presupuesto = presupuesto;
	}

	public Piloto[] getPilotos()
	{
		return pilotos;
	}

	public void setPilotos(Piloto[] pilotos)
	{
		this.pilotos = pilotos;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

}
