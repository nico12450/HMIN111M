package tp5TableauxAgence;

public abstract class Appartement {
	
	public Appartement(String adresse, int nbPieces, int anneeConstruction, double superficie) {
		this.adresse = adresse;
		this.superficie = superficie;
		this.nbPieces = nbPieces;
		this.anneeConstruction = anneeConstruction;
		
	}
	private int nbPieces, anneeConstruction;
	private String adresse;
	private double superficie;
	
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public double getSuperficie() {
		return superficie;
	}
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}
	
	public int getNbPieces() {
		return nbPieces;
	}
	public void setNbPieces(int nbPieces) {
		this.nbPieces = nbPieces;
	}
	public int getAnneeConstruction() {
		return anneeConstruction;
	}
	public void setAnneeConstruction(int anneeConstruction) {
		this.anneeConstruction = anneeConstruction;
	}
	
	public abstract double coeffModerateur();
	
	public double valLocativeBase(){
		return this.superficie*5*(1+this.nbPieces/10);
	}
	
	public double loyer(){
		return valLocativeBase()*coeffModerateur();
	}

}
