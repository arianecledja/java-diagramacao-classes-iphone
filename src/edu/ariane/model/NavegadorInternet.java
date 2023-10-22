package edu.ariane.model;

public class NavegadorInternet {
	private String urlPagina;
	
	public void exibirPagina(String urlPagina) {
		System.out.println("A página está sendo exibida");
	}
	public void adicionarAbaNova() {
		System.out.println("Nova aba sendo adicionada...");
	}
	public void atualizarPagina() {
		System.out.println("Página está sendo atualizada...");
	}
}
