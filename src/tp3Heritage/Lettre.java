package tp3Heritage;

public class Lettre extends ObjetPostal {
	
	boolean urgente;

	public Lettre(String origine, String destination, int codePostal,
			double poids, double volume, int taux, boolean urgence) {
		super(origine, destination, codePostal, poids, volume, taux);
		this.urgente = urgence;			
	}

	public boolean isUrgence() {
		return urgente;
	}

	public void setUrgence(boolean urgence) {
		this.urgente = urgence;
	}

	public double tarifAffranchissement() {
		
		if(this.isUrgence()) {
			return super.tarifAffranchissement() + 0.8;
		}
		
		return super.tarifAffranchissement() + 0.5;
	}
	
	public double tarifRemboursement(){
		
		switch (this.taux){
			
			case 1: return 1.5;
			
			case 2: return 15;
			
			default: return super.tarifRemboursement();
					

		}
		
		
	}

	@Override
	public String toString() {
		
		String caracteristiques = new String();
		
		caracteristiques += super.toString();
		caracteristiques = caracteristiques.replaceAll("Objet postal", "Lettre");
		
		if(this.urgente) {
			caracteristiques += "Cette lettre est urgente \n";
		}
		else {
			caracteristiques += "Cette lettre est ordinaire \n";
		}
		
		caracteristiques += "tarif d'affranchissement : " + this.tarifAffranchissement() + " euros\n";
		caracteristiques += "tarif de remboursement : " + this.tarifRemboursement() + " euros\n";
		return caracteristiques;
	}
	
	

}
