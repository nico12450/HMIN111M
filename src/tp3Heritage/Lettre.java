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
		
		return caracteristiques;
	}
	
	

}
