package gestionealbergo;

import java.util.Vector;

//import agenziaviaggi.Prenotazione;

public class Albergo {

	private String nome;
	private Vector <Camera> camere;


	public Vector<Camera> getCamere() {
		return camere;
	}
	
	public String getNome(){
		return nome;
	}

	public Albergo(String nome) {
		if (nome != null)
			this.nome = nome;
		else
			throw new IllegalArgumentException("nome cannot be null");
		camere = new Vector<Camera>();
	}
	
	@Override
	public String toString() {
		return "Albergo [nome=" + nome + ", numeroCamere=" + camere.size() + "]";
	}
	
}
