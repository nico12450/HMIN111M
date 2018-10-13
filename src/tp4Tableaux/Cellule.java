package tp4Tableaux;

public class Cellule {
	
	private boolean occupee;
	private int age;
	private Monde monMonde;
	private int ligne, colonne;

	public Cellule(boolean occupee, Monde monMonde, int ligne, int colonne) {
		
		this.setOccupee(occupee);
		this.monMonde = monMonde;
		this.ligne = ligne;
		this.colonne = colonne;
		
	}
	
	public void setOccupee(boolean b) {
		
		this.occupee = b;
		this.age = 0;
		
		if(!b) {
			
			this.age = -1;
			
		}
		
	}
	
	public boolean estVivante() {
		return this.occupee;
	}
	
	public int[] getPosition() {
		return new int[] {this.colonne,this.ligne};
	}
	
	public void meurt() {
		this.setOccupee(false);
	}
	
	public void nait() {
		this.setOccupee(true);
	}
	
	public void prochainEtat(int nbVoisins) {
		
		if(this.estVivante() && (nbVoisins == 2 || nbVoisins == 3)) {
			
			this.age += 1;
			
		}
		
		else if(this.estVivante()) {
			this.meurt();
		}
		
		else if(nbVoisins == 3) {
			this.nait();
		}
		
	}
	
	public char etat() {
		return this.estVivante() ? 'O' : 'X';
	}
	
	public String toString() {
		
		String description = "\n";
		
		if(this.estVivante()) {
			description += "la cellule est vivante depuis " + this.age + " générations\n";
		}
		
		else {
			description += "la cellule est morte\n";
		}
		
		description += "elle est en position " + this.getPosition()[0] + " , " + this.getPosition()[1] + "\n";
		
		return description;
		
	}


}
