package fecha;

public class Fecha
{

	private int dia;
	private int mes;
	private int anno;

	public Fecha()
	{
		dia = 0;
		mes = 0;
		anno = 0;
	}

	public Fecha(int dia, int mes, int anno)
	{
		this.dia = dia;
		this.mes = mes;
		this.anno = anno;
	}

	public int getDia()
	{
		return dia;
	}

	public void setDia(int dia)
	{
		this.dia = dia;
	}

	public int getMes()
	{
		return mes;
	}

	public void setMes(int mes)
	{
		this.mes = mes;
	}

	public int getAnno()
	{
		return anno;
	}

	public void setAnno(int anno)
	{
		this.anno = anno;
	}

	public boolean fechaCorrecta()
	{

		if (mes < 0 || mes > 12)
		{
			return false;
		}
		if (mes == 2 && dia > 0 && dia < 29)
		{
			return true;
		}
		if (mes == 2 && dia > 0 && dia <= 29)
		{
			if (dia == 29 && !esBisiesto())
				return false;
			else
			{
				return true;
			}
		}
		if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia > 0
				&& dia <= 31)
		{
			return true;
		}
		if ((mes == 2 || mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 0 && dia <= 30)
		{
			return true;
		}
		return false;

	}

	private boolean esBisiesto()
	{
		if (anno % 4 == 0)
			return true;
		else
			return false;
	}

	public void diaSiguiente()
	{
		if (dia > 31)
		{
			System.out.println("No se puede sumar");
		}
		if (mes == 2 && dia == 29)
		{
			mes++;
			dia = 1;
		} else if (mes == 2 && dia == 28 && esBisiesto() == false)
		{
			mes++;
			dia = 1;
		} else if (mes == 12 && dia == 31)
		{
			anno++;
			dia = 1;
			mes = 1;
		} else if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10) && dia == 31)
		{
			mes++;
			dia = 1;
		} else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia == 30)
		{
			mes++;
			dia = 1;
		} else
		{
			dia++;
		}

	}

	@Override
	public String toString()
	{
		String s = "";
		if (dia > 0 && dia < 10)
		{
			s += "0" + dia;
		} else
		{
			s += dia;
		}
		if (mes > 0 && mes < 10)
		{
			s += "-0" + mes;
		} else
		{
			s += "-" + mes;
		}

		return s += "-" + anno;
	}
}
