package br.com.fiap.rh;

public class Gerente extends Empregado {

	private String area;
	private double bonus;

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
