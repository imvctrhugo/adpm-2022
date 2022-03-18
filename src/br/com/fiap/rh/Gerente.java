package br.com.fiap.rh;

public class Gerente extends Empregado implements Autenticavel {

	private String area;
	private double bonus;
	private String senha;

	@Override
	public void setSenha(String senha) {
		this.senha = senha;

	}

	@Override
	public boolean autenticar(String senha) {
		return this.senha == senha;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public double calcularSalario() {
		return this.getSalarioBase() + this.getBonus();

	}

}
