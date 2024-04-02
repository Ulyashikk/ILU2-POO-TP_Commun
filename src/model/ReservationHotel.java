package model;

public class ReservationHotel extends Reservation {

	private int nbLitSimple;
	private int nbLitDouble;
	private int numChambre;
	
	public ReservationHotel(int jour, int mois, int nbLitSimple, int nbLitDouble, int numChambre) {
		super(jour,mois);
		this.nbLitDouble = nbLitDouble;
		this.nbLitSimple = nbLitSimple;
		this.numChambre = numChambre;
	}
	
	public String toString() {
		StringBuilder chaine = new StringBuilder();
		chaine.append("Le " + super.jour + "/" + super.mois + "\nNombre de lit simple: " + nbLitSimple 
				+ "\nNombre de lit double: " + nbLitDouble + "\nChambre: " + numChambre);	
		return chaine.toString();
	}

}
