package it.corso.model;

public class Regista extends Persona {

	public Regista(String nome, String cognome) {
		super(nome, cognome);
	}

	@Override
	public String toString() {
		return "Regista: " + getNome() + " " + getCognome();
	}

}
