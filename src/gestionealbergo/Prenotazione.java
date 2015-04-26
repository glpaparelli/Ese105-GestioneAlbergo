package gestionealbergo;

import java.time.LocalDateTime;

public class Prenotazione {

	private LocalDateTime arrivoIl;
	private int numeroNotti;
	private String richieste;
	private LocalDateTime effettuataIl;
	private Cliente cliente;
	private Camera camera;
	
	@Override
	public String toString() {
		return "Prenotazione [arrivoIl=" + arrivoIl + ", numeroNotti="
				+ numeroNotti + ", richieste=" + richieste + ", effettuataIl="
				+ effettuataIl + ", cliente=" + cliente + ", camera=" + camera
				+ "]";
	}

	public Prenotazione(LocalDateTime arrivoIl, int numeroNotti,
			String richieste, LocalDateTime effettuataIl,Cliente cliente) {
		super();
		
		this.arrivoIl = arrivoIl;
		if(numeroNotti > 0){
			this.numeroNotti = numeroNotti;
		}
		
		if(richieste!=null)
			if(richieste.length()>0)
				this.richieste=richieste;
			else 
				throw new IllegalArgumentException("richiesteAggiuntive<=0");
		else throw new IllegalArgumentException("richiesteAggiuntive=null");
		
		
		
		this.effettuataIl = effettuataIl;
		this.cliente = cliente;
	}

	
	public Cliente getCliente(){
		return cliente;
	}
	
	public Camera getCamera(){
		return camera;
	}
	
	public LocalDateTime getArrivoIl() {
		return arrivoIl;
	}
	
	public void setArrivoIl(LocalDateTime arrivoIl) {
		this.arrivoIl = arrivoIl;
	}
	
	public int getNumeroNotti() {
		return numeroNotti;
	}
	
	public void setNumeroNotti(int numeroNotti) {
		this.numeroNotti = numeroNotti;
	}
	
	public String getRichieste() {
		return richieste;
	}
	
	public void setRichieste(String richieste) {
		this.richieste = richieste;
	}
	
	public LocalDateTime getEffettuataIl() {
		return effettuataIl;
	}
}
