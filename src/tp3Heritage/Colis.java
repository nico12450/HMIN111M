package tp3Heritage;

public class Colis extends ObjetPostal {

	public Colis(String origine, String destination, int codePostal, double poids, double volume, int taux, String contenu, int valeur) {
		super(origine, destination, codePostal, poids, volume, taux);
		
		this.contenu = contenu;
		this.valeur = valeur;
	}
	
	private String contenu;
	int valeur;

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public int getValeur() {
		return valeur;
	}

	public void setValeur(int valeur) {
		this.valeur = valeur;
	}

	@Override
	public String toString() {
		
		String caracteristiques = super.toString();
		caracteristiques = caracteristiques.replaceAll("Objet postal", "Colis");
		
		caracteristiques += "contenu du colis : " + this.contenu + "\n";
		caracteristiques += "valeur du colis : " + this.valeur + " euros\n";
		
		return caracteristiques;
	}
	
	

}
