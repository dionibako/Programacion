package metodos;

public class DesviacionTipica
{

	public static float desviacionTipica(float[] array)
	{
		return (float) Math.sqrt(Varianza.varianza(array));

	}
}
