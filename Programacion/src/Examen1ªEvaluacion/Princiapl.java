package Examen1ªEvaluacion;

public class Princiapl {

	public static void main(String[] args) {
		CuentaBancaria c1 = new CuentaBancaria(10);
		c1.ingresar(100);
		c1.sacar(30);
		c1.setInteres(5);
		c1.generarInteres();

		System.out.println("El saldo de mi cuenta es: " + c1.getSaldo());
	}

}
