package br.com.fiap.rh;

public abstract interface Autenticavel {

	public abstract void setSenha(String senha);

	public boolean autenticar(String senha);
}
