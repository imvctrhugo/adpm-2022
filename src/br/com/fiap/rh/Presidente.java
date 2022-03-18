package br.com.fiap.rh;

public final class Presidente extends Empregado implements Autenticavel {

	private double acoes;
	private String senha;

	@Override
	public void setSenha(String senha) {
		this.senha = senha;

	}

	@Override
	public boolean autenticar(String senha) {
		return this.senha == senha;
	}

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
