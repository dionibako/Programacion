package contador;

public class Contador
{
	int cont;

	public Contador()
	{
		cont = 0;
	}

	public Contador(int n)
	{

		if (n < 0)
		{
			cont = 0;
		} else
		{
			cont = n;
		}

	}

	public Contador(Contador contador)
	{
		this.cont = contador.cont;
	}

	public int incrementar()
	{
		return cont++;
	}

	public int decrementar()
	{
		if (cont < 0)
		{
			cont = 0;
		} else
			cont--;
		return cont;

	}

	public int getCont()
	{
		return cont;
	}

	public void setCont(int cont)
	{
		this.cont = cont;
	}

}
