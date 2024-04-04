package model;

public abstract class Formulaire {
	
	protected int jour;
	protected int mois;
	protected int numEntite;
	protected int numService;

	protected Formulaire(int jour, int mois) {
		this.jour = jour;
		this.mois = mois;
	}
	
	public int getNumService() {
		return numService;
	}
	
	public int getIdentificationEntite() {
		return numEntite;
	}
	
	public int setIdentificationEntite(int numEntite) {
		return this.numEntite = numEntite;
	}

	public abstract int getJour();
	public abstract int getMois();

}
