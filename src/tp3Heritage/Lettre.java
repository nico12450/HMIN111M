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

	@Override
	public String toString() {
		
		String caracteristiques = new String();
		
		caracteristiques += "\n";
		caracteristiques += "Lettre en provenance de " + this.origine + ", ";
		caracteristiques += "à destination de " + this.destination + ", ";
		caracteristiques += "code postal du destinataire : " + this.codePostal + "\n";
		
		if(this.urgente) {
			caracteristiques += "Cette lettre est urgente \n";
		}
		else {
			caracteristiques += "Cette lettre est ordinaire \n";
		}
		
		caracteristiques += "elle pèse " + this.poids + " g, ";
		caracteristiques += "a un volume de " + this.volume + " m3 ";
		caracteristiques += "et un taux de recommendation de " + this.taux;
		
		caracteristiques += "\n";
		
		return caracteristiques;
	}
	
	

}
