package br.com.fiap.veterinario;

public class Gatil {
	public static void main(String[] args) {
		
		Gato felix = new Gato(); // Construtor
		felix.nome = "Felix";
		felix.cor = "preto";
		felix.tamanho = 10;
		felix.miar();

		Gato garfield = new Gato();
		garfield.nome = "Garfield";
		garfield.cor = "laranja";
		garfield.miar();
		

	}

}
