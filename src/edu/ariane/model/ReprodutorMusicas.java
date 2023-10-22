package edu.ariane.model;

import java.util.Date;

public class ReprodutorMusicas {
	private int id;
	private String nomeMusica;
	private Data tempo;
	
	public void tocar() {
		System.out.println("Tocando música ...");
	}
	public void pausar(Date tempo) {
		System.out.println("Parando música ....");
	}
	public void selecionarMusica(int id) {
		System.out.println("Música selecionada.");
	}
}
