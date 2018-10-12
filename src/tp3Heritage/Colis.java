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
	
	public double tarifAffranchissement() {
		
		if(this.volume>0.125) {
			return super.tarifAffranchissement() + 5;
		}
		
		return super.tarifAffranchissement() + 2;
	}
	
	public double tarifRemboursement(){
		
		switch (this.taux){
			case 1: return 0.1*this.valeur;
			case 2: return 0.5*this.valeur;
			default: return super.tarifRemboursement();
		}
		
	}

	@Override
	public String toString() {
		
		String caracteristiques = super.toString();
		caracteristiques = caracteristiques.replaceAll("Objet postal", "Colis");
		
		caracteristiques += "contenu du colis : " + this.contenu + "\n";
		caracteristiques += "valeur du colis : " + this.valeur + " euros\n";
		
		caracteristiques += "tarif d'affranchissement : " + this.tarifAffranchissement() + " euros\n";
		caracteristiques += "tarif de remboursement : " + this.tarifRemboursement() + " euros\n";
			
		return caracteristiques;
	}
	
	

}
