package tp3Heritage;

public class Lettre extends ObjetPostal {
	
	boolean urgence;

	public Lettre(String origine, String destination, int codePostal,
			int poids, int volume, int taux, boolean urgence) {
		super(origine, destination, codePostal, poids, volume, taux);
		this.urgence = urgence;			
	}

	public boolean isUrgence() {
		return urgence;
	}

	public void setUrgence(boolean urgence) {
		this.urgence = urgence;
	}
	
	

}
