package gestionealbergo;

import java.time.LocalDateTime;
import java.util.Vector;

import gestionealbergo.*;

public abstract class Camera  {

	private String numero;
	private boolean disponibile;
	private int postiLetto;
	private Vector <Prenotazione> prenotazioni;
	
	

	
	public Camera(String numero, int postiLetto) {
		super();
		this.numero = numero;
		this.postiLetto = postiLetto;
		prenotazioni = new Vector <Prenotazione>() ;
	}

	public boolean isDisponibile(LocalDateTime dal, int numeroNotti){
		this.disponibile = true;
		
		Prenotazione p;
		for (int i = 0; i<prenotazioni.size();i++){
			p = prenotazioni.elementAt(i);
			if (p.getArrivoIl().isAfter(dal.plusDays(numeroNotti))){     // sommare un intero e una data
				this.disponibile = false;
			}
			if (dal.plusDays(numeroNotti).isBefore(dal)){
				this.disponibile = false;
			}		
		}
		
		return disponibile;
		
	}
	
	public void addPrenotazione(Prenotazione p){
	
		if (isDisponibile(p.getArrivoIl(), p.getNumeroNotti()) == true){
			prenotazioni.addElement(p);
		}
		else
			throw new IllegalArgumentException("camera non disponibile");
	}

	public String getNumero() {
		return numero;
	}

	public int getPostiLetto() {
		return postiLetto;
	}

	public Vector<Prenotazione> getPrenotazioni() {
		return prenotazioni;
	}
	

	@Override
	public String toString() {
		return "Camera [numero=" + numero + ", postiLetto=" + postiLetto + ", prenotazioni = " + prenotazioni.size() +"]";
	}
}
