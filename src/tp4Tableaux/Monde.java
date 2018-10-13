package tp4Tableaux;

public class Monde {
	
	private Cellule[][] contenu;
	private int nbLignes, nbColonnes;

	public Monde(int nbLignes, int nbColonnes) {
		
		this.nbLignes = nbLignes;
		this.nbColonnes = nbColonnes;
		this.contenu = new Cellule[nbLignes][nbColonnes];
		
		for(int i = 0; i < nbLignes; i++) {
			
			for(int j = 0; j < nbColonnes; j++) {
				
				contenu[i][j] = new Cellule(false, this, i, j);
				
			}
			
		}
		
	}
	
	public void init(int[][] positions) {
		
		for (int[] p : positions) {
			
			int pX = p[0];
			int pY = p[1];
			
			if(pX < this.nbColonnes && pY < this.nbLignes) {
				
				this.getCellule(pX, pY).nait();
				
			}
			
		}
		
	}
	
	public Cellule getCellule(int i, int j) {
		return this.contenu[j][i];
	}
	
	public Cellule[] getVoisins(int i, int j) {
		
		Cellule[] voisins = new Cellule[9];
		int n = 0;
		
		for (int x = i-1; x < i+2; x++) {
			
			for (int y = j-1; y < j+2; y++) {
				
				if(x>=0 && x<this.nbColonnes && y>=0 && y<this.nbLignes && (x != i || y != j)) {
					
					voisins[n] = this.contenu[y][x];
					
				}
				
				else {
					
					voisins[n] = null;
					
				}
				
				n++;
				
			}
			
		}
		
		return voisins;
		
	}
	
	public int getNbVoisins(int i, int j) {
		
		int nbVoisins = 0;
		Cellule[] lvoisins = this.getVoisins(i, j);
		
		for(Cellule c : lvoisins) {
			if(c != null && c.estVivante()) {
				nbVoisins++;
			}
		}
		
		return nbVoisins;
	}
	
	public void affichage() {
		
		char[][] population = new char[this.nbLignes][this.nbColonnes];
		
		for(int i = 0; i < this.nbLignes; i++) {
			
			for(int j = 0; j < this.nbColonnes; j++) {
				
				population[i][j] = this.contenu[i][j].etat();
				
			}
			
		}
		
		for(int i = 0; i < this.nbLignes; i++) {
			
			for(int j = 0; j < this.nbColonnes; j++) {
				
				System.out.print(" " + population[i][j] + " ");
				
			}
			
			System.out.print("\n");
			
		}
		
	}
	
	

}
