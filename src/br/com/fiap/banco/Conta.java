package br.com.fiap.banco;

public class Conta {

	private String titular;
	private int numero;
	private double saldo;
	private double juros;

	public Conta(String titular) {
		this.titular = titular;
		numero = 1;
		saldo = 100;
		juros = 0.008875;
	}

	// Auto creation Getters and Setters:
	// CTRL + 3 -> ggas

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getJuros() {
		return juros;
	}

	public void setJuros(double juros) {
		this.juros = juros;
	}

}
