package model;

public class ReservationSpectacle extends Reservation{
	
	private int numZone;
	private int numChaise;

	public ReservationSpectacle(int jour, int mois, int numZone, int numChaise) {
		super(jour, mois);
		this.numChaise = numChaise;
		this.numZone = numZone;
	}
	
	public String toString() {
		StringBuilder chaine = new StringBuilder();
		chaine.append("Le " + super.jour + "/" + super.mois + "\nZone: " + numZone + "\nnuméro de la chaise: " + numChaise);	
		return chaine.toString();
	}
}
