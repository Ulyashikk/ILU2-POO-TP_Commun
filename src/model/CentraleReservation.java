package model;

public class CentraleReservation <E extends EntiteReservable <F>, F extends Formulaire> {
	
	private E[] entites;
	private int nbEntites;

	public CentraleReservation(E[] entites, int nbEntites) {
		 this.entites = entites;
		 this.nbEntites = nbEntites;
	}
	
	public int ajouterEntite(E entite) {
		this.entites[this.nbEntites] = entite;
		this.entites[this.nbEntites].setNumero(++this.nbEntites);
		return this.nbEntites;
	}
	
	public int[] donnerPossibilites(F Formulaire) {
		int[] dispo = new int[this.nbEntites];
		for(int i=0; i<nbEntites; i++) {
			if(this.entites[i].estLibre(Formulaire) && this.entites[i].compatible(Formulaire)) 
				dispo[i] = this.entites[i].getNumero();
			else dispo[i] = 0;
		}
		
		return dispo;
	}
	
	public Reservation reserver(int numEntite, F Formulaire) {
		 Formulaire.setIdentificationEntite(numEntite);
	     return this.entites[numEntite - 1].reserver(Formulaire);   
	}

}
