package Examen1ªEvaluacion;

public class CuentaBancaria {
	double saldo = 0;
	double interes;

	public CuentaBancaria(int b) {

		saldo = saldo + b;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	public void ingresar(int b) {
		saldo = saldo + b;
	}

	public void sacar(int b) {
		saldo = saldo - b;
	}

	public void ingresar(double b) {
		saldo = saldo + b;
	}

	public void sacar(double b) {
		saldo = saldo - b;
	}

	public void generarInteres() {
		saldo = saldo + (interes * saldo / 100);
	}

}
