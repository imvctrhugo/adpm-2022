package br.com.fiap.mmorpg;

public class Jogador extends Object {

	private String nome;

	private int xp;
	private int hp;
	private boolean envenenado;

	public Jogador() {
		this.xp = 0; // Boa pratica sempre usar this.
		this.hp = 100;
		this.envenenado = false;

	}

//	Sobrecarga de metodo
	public Jogador(String nome) {
		this.nome = nome;
		this.xp = 0;
		this.hp = 100;
		this.envenenado = false;

	}

	public int getXp() {
		return xp;
	}

	public int getHp() {
		return hp;
	}

	public boolean isEnvenenado() {
		return this.envenenado;
	}

	public void receberDano(int pontos) {
		this.hp -= pontos; // == this.hp = this.hp - pontos

//		if (this.hp <= 0) {
//			JOptionPane.showInternalMessageDialog(null, "GAME OVER!");
//		}
	}

	public void receberCura(int pontos) {
		this.hp += pontos;
	}

	public void receberVeneno() {
		this.envenenado = true;
	}

	public void ganharExperiencia(int pontos) {
		this.xp += pontos;
	}

	public void receberAntidoto() {
		if (this.isEnvenenado())
			this.envenenado = false;
		else
			this.envenenado = true;

	}

	public String getNome() {
		return nome;
	}

//	Sobrescrita de metodo
	@Override
	public String toString() {
		String estatistica = this.getNome();
		estatistica += "\nXP: " + this.getXp();
		estatistica += "\nHP: " + this.getHp();
		estatistica += "\nEnvenenado: " + this.isEnvenenado();

		return estatistica;

	}

}
