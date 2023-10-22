package edu.ariane.model;

public class AparelhoTelefonico {
	private int numeroTelefone;
	
	public void ligar(int numeroTelefone) {
		System.out.println("ligando .....");
	}
	public boolean atender() {
		System.out.println("Atendendo...");
		return true;
	}
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz....");
	}
}
