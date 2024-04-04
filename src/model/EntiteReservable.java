package model;

public abstract class EntiteReservable <T extends Formulaire>{
	
	private int numero;
	private CalendrierAnnuel calendrier;

	public EntiteReservable(int numero, CalendrierAnnuel calendrier) {
		this.numero = numero;
		this.calendrier = calendrier;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public boolean estLibre(T formulaire) {
		return calendrier.estLibre(formulaire.getJour(), formulaire.getMois());
	}
	
	public abstract boolean compatible(T formulaire);
	public abstract Reservation reserver(T formulaire);

}
