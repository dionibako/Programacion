package clases;

public class Zona
{
	String zona;
	int horaAper;
	int horaCierre;
	int superficie;
	String responsable;
	Animal[] animales;

	public Zona(String zona, int horaAper, int horaCierre, int superficie, String responsable, Animal[] animales)
	{
		this.zona = zona;
		this.horaAper = horaAper;
		this.horaCierre = horaCierre;
		this.superficie = superficie;
		this.responsable = responsable;
		this.animales = animales;
	}

	public void mostarAnimales()
	{
		for (int i = 0; i < animales.length; i++)
		{
			System.out.println(animales[i].getNombre());
		}

	}

	public void mostrarAnimalTipo(String opcionTipo)
	{

		for (int i = 0; i < animales.length; i++)
		{
			if (animales[i].getTipo().compareTo(opcionTipo) == 0)
				System.out.println(animales[i].getNombre());
		}

	}

	public void mostrarCuidador(String opcionCuidador)
	{

		for (int i = 0; i < animales.length; i++)
		{
			if (animales[i].getTipo().compareTo(opcionCuidador) == 0)
				System.out.println(animales[i].getNombre());
		}

	}

	public String getNombreZona()
	{
		return zona;
	}

	public void setNombreZona(String nombreZona)
	{
		this.zona = nombreZona;
	}

	public int getHoraAper()
	{
		return horaAper;
	}

	public void setHoraAper(int horaAper)
	{
		this.horaAper = horaAper;
	}

	public int getHoraCierre()
	{
		return horaCierre;
	}

	public void setHoraCierre(int horaCierre)
	{
		this.horaCierre = horaCierre;
	}

	public int getSuperficie()
	{
		return superficie;
	}

	public void setSuperficie(int superficie)
	{
		this.superficie = superficie;
	}

	public String getResponsable()
	{
		return responsable;
	}

	public void setResponsable(String responsable)
	{
		this.responsable = responsable;
	}

	public Animal[] getZona()
	{
		return animales;
	}

	public void setZona(Animal[] zona)
	{
		this.animales = zona;
	}

	public Animal[] getAnimales()
	{
		return animales;
	}

	public void setAnimales(Animal[] animales)
	{
		this.animales = animales;
	}

	public void setZona(String zona)
	{
		this.zona = zona;

	}
}
