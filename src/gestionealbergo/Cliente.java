package gestionealbergo;

import java.util.Vector;


public class Cliente {
	
	private String nome;
	private String cognome;
	private String cellulare;
	private String email;
	
	public Cliente(String nome, String cognome, String cellulare) {
		super();
		
		if ((nome != null) && (nome.length() > 0)){
			this.nome = nome;
		}
		else 
			throw new IllegalArgumentException("problema nome");
		
		if((cognome != null) && (cognome.length() > 0)){
			this.cognome = cognome;
		}
		else
			throw new IllegalArgumentException("problema cognome");
		
		if((cellulare != null)&& (cellulare.length() > 0)){
			this.cellulare = cellulare;
		}
		else
			throw new IllegalArgumentException("problema cellulare");
		
	}

	public Cliente(String nome, String cognome, String cellulare, String email) {
		super();
		if ((nome != null) && (nome.length() > 0)){
			this.nome = nome;
		}
		else 
			throw new IllegalArgumentException("problema nome");
		
		if((cognome != null) && (cognome.length() > 0)){
			this.cognome = cognome;
		}
		else
			throw new IllegalArgumentException("problema cognome");
		
		if((cellulare != null)&& (cellulare.length() > 0)){
			this.cellulare = cellulare;
		}
		else
			throw new IllegalArgumentException("problema cellulare");
		
		if((email != null) && (email.length() > 0)){
			this.email = email;
		}
		else 
			throw new IllegalArgumentException();
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public String getCellulare() {
		return cellulare;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCognome(String conome) {
		this.cognome = cognome;
	}

	public void setCellulare(String cellulare) {
		this.cellulare = cellulare;
	}
	
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cognome=" + cognome
				+ ", cellulare=" + cellulare + ", email=" + email + "]";
	}
	
}
