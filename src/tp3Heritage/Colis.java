package tp3Heritage;

public class Colis extends ObjetPostal {

	public Colis(String origine, String destination, int codePostal, double poids, double volume, int taux, String contenu, String valeur) {
		super(origine, destination, codePostal, poids, volume, taux);
		
		this.contenu = contenu;
		this.valeur = valeur;
	}
	
	private String contenu, valeur;

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public String getValeur() {
		return valeur;
	}

	public void setValeur(String valeur) {
		this.valeur = valeur;
	}
	
	

}
