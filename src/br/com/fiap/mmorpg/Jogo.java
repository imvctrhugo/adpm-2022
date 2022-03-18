package br.com.fiap.mmorpg;

public class Jogo {
	public static void main(String[] args) {
		Jogador jogador = new Jogador("victorHugo");

		System.out.println(jogador);

		jogador.receberVeneno();
		jogador.receberAntidoto();
		jogador.receberDano(110);
		jogador.receberCura(30);
		jogador.ganharExperiencia(3);

		System.out.println(jogador);
	}

}
