package tp5TableauxAgence;

public class AppartementLuxe extends Appartement {

	public AppartementLuxe(String adresse, int nbPieces,
			int anneeConstruction, double superficie, String quartier, String services) {
		super(adresse, nbPieces, anneeConstruction, superficie);
		// TODO Auto-generated constructor stub
		this.quartier = quartier;
		this.services = services;
	}
	
	private String quartier, services;

	@Override
	public double coeffModerateur() {
		// TODO Auto-generated method stub
		return 1.1;
	}

}
