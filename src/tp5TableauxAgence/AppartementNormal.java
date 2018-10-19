package tp5TableauxAgence;

public class AppartementNormal extends Appartement {

	public AppartementNormal(String adresse, int nbPieces,
			int anneeConstruction, double superficie, int nbNuisances, String nuisances) {
		super(adresse, nbPieces, anneeConstruction, superficie);
		// TODO Auto-generated constructor stub
		this.nbNuisances = nbNuisances;
		this.nuisances = nuisances;
	}
	
	private int nbNuisances;
	private String nuisances;

	@Override
	public double coeffModerateur() {
		// TODO Auto-generated method stub
		if(nbNuisances<10){
			return 1-0.1*this.nbNuisances;
		}
		return 0.1;
	}

	@Override
	public String toString() {
		return "AppartementNormal [nbNuisances=" + nbNuisances + ", nuisances="
				+ nuisances + "]";
	}

}
