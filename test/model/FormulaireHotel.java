package model;

public class FormulaireHotel extends Formulaire{
	
	private int nbLitSimple;
	private int nbLitDouble;
	
	public FormulaireHotel(int jour, int mois, int nbLitSimple, int nbLitDouble) {
		super(jour, mois);
		this.nbLitDouble = nbLitDouble;
		this.nbLitSimple = nbLitSimple;
	}
	
	public int getNbLitSimple() {
		return nbLitSimple;
	}
	
	public int getNbLitDouble() {
		return nbLitDouble;
	}
	
	public int getJour() {
		return jour;
	}
	
	public int getMois() {
		return mois;
	}
	
}
