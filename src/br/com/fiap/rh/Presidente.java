package br.com.fiap.rh;

public final class Presidente extends Empregado {

	private double acoes;

	public double getAcoes() {
		return acoes;
	}

	public void setAcoes(double acoes) {
		this.acoes = acoes;
	}

	@Override
	public double calcularSalario() {
		return this.getSalarioBase() + this.getAcoes();
	}

}
