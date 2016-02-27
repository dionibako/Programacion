package fracciones;

public class Fraccion
{
	int num;
	int den;

	public Fraccion()
	{
		num = 0;
		den = 1;
	}

	public Fraccion(int i)
	{
		num = i;
		den = 1;
	}

	public Fraccion(int i, int j)
	{
		num = i;
		den = j;
	}

	public Fraccion sumar(Fraccion f2)
	{
		Fraccion suma = new Fraccion();

		suma.num = (this.num * f2.den) + (this.den * f2.num);
		suma.den = (this.den * f2.den);
		return suma;

	}

	public Fraccion restar(Fraccion f3)
	{
		Fraccion resta = new Fraccion();

		resta.num = (this.num * f3.den) - (this.den * f3.num);
		resta.den = (this.den * f3.den);
		return resta;

	}

	public Fraccion multiplicar(Fraccion f4)
	{
		Fraccion multiplicacion = new Fraccion();

		multiplicacion.num = this.num * f4.num;
		multiplicacion.den = this.den * f4.den;
		return multiplicacion;

	}

	public Fraccion dividir(Fraccion f2)
	{
		Fraccion division = new Fraccion();

		division.num = this.num * f2.den;
		division.den = this.den * f2.num;
		return division;

	}

	@Override
	public String toString()
	{
		return num + "/" + den;
	}

	public int getNum()
	{
		return num;
	}

	public void setNum(int num)
	{
		this.num = num;
	}

	public int getDen()
	{
		return den;
	}

	public void setDen(int den)
	{
		this.den = den;
	}
	
	

}
