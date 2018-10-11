package tp3Heritage;

public class ObjetPostal {
	
	public ObjetPostal(String origine, String destination, int codePostal,
			double poids, double volume, int taux) {
		this.origine = origine;
		this.destination = destination;
		this.codePostal = codePostal;
		this.poids = poids;
		this.volume = volume;
		this.taux = taux;
	}

	String origine, destination;
	int codePostal, taux;
	double poids, volume;
	
	public String getOrigine() {
		return origine;
	}
	public void setOrigine(String origine) {
		this.origine = origine;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}
	public double getPoids() {
		return poids;
	}
	public void setPoids(int poids) {
		this.poids = poids;
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getTaux() {
		return taux;
	}
	public void setTaux(int taux) {
		this.taux = taux;
	}
	
	public double tarifAffranchissement() {
		
		double tarif = 0;
		
		switch (this.taux) {
		
			case 1: tarif += 0.5;
					break;
			
			case 2: tarif += 1.5;
					break;
		
		}
		
		return tarif;
	}
	
	
	public String toString() {
		
		String caracteristiques = new String();
		
		caracteristiques += "\n";
		caracteristiques += "Objet postal en provenance de " + this.origine + ", ";
		caracteristiques += "à destination de " + this.destination + ", ";
		caracteristiques += "code postal du destinataire : " + this.codePostal + "\n";
		
		caracteristiques += "poids : " + this.poids + " g, ";
		caracteristiques += "volume : " + this.volume + " m3 ";
		caracteristiques += "taux de recommandation : " + this.taux;
		
		caracteristiques += "\n";
		
		return caracteristiques;
	}
	
	
	

}
