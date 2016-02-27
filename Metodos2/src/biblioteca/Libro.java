package biblioteca;

public class Libro
{
	String titulo;
	String autor;
	int nEjemplares;
	int nPrestados;

	public Libro()
	{
		titulo = "";
		autor = "";
		nEjemplares = 0;
		nPrestados = 0;
	}

	public Libro(String titulo, String autor, int nEjemplares, int nPrestados)
	{
		this.titulo = titulo;
		this.autor = autor;
		this.nEjemplares = nEjemplares;
		this.nPrestados = nPrestados;
	}

	public boolean prestar()
	{
		if (nPrestados > nEjemplares || nEjemplares == 0)
			return false;
		else
		{
			nEjemplares--;
			nPrestados++;
			return true;
		}

	}

	public boolean devolver()
	{
		if (nPrestados == 0)
		{
			return false;
		} else
		{
			nEjemplares++;
			nPrestados--;
			return true;
		}

	}

	

	@Override
	public String toString()
	{
		String s="";
		s="Titulo: " + titulo + ", Autor: " + autor + ", nEjemplares: " + nEjemplares + ", nPrestados: "
				+ nPrestados;
		return s;
	}

	public String getTitulo()
	{
		return titulo;
	}

	public void setTitulo(String titulo)
	{
		this.titulo = titulo;
	}

	public String getAutor()
	{
		return autor;
	}

	public void setAutor(String autor)
	{
		this.autor = autor;
	}

	public int getnEjemplares()
	{
		return nEjemplares;
	}

	public void setnEjemplares(int nEjemplares)
	{
		this.nEjemplares = nEjemplares;
	}

	public int getnPrestados()
	{
		return nPrestados;
	}

	public void setnPrestados(int nPrestados)
	{
		this.nPrestados = nPrestados;
	}

}
