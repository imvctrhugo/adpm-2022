package br.com.fiap.rh;

public abstract class Empregado {

	private int codigo;
	private String nome;
	private double salarioBase;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salario) {
		this.salarioBase = salario;
	}

	public abstract double calcularSalario();

}
