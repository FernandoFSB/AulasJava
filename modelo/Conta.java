package modelo;

public class Conta {
	
	//atributos
	private int numero;
	private double saldo;
	
	//contrutores
	
	public Conta() {}
	
	public Conta(int num, double s) {
		this.numero = num;
		this.saldo = s;
	}
	
	//get e set
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	//toString
	
	public String toString() {
		return "Número: "+this.numero+", Saldo: "+this.saldo;
	}
	
	
}
