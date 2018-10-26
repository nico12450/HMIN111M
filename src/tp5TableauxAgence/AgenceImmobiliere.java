package tp5TableauxAgence;

public class AgenceImmobiliere {
	
	private String nom, adresse;
	private Appartement appartements[];
	private int nbApptGeres;
	
	public AgenceImmobiliere(String nom, String adresse, Appartement appartements[]){
		
		this.nom = nom;
		this.adresse = adresse;
		this.nbApptGeres = appartements.length;
		this.appartements = new Appartement[nbApptGeres];
		
		int i = 0;
		
		while (i<nbApptGeres){
			
			this.appartements[i] = appartements[i];
			i++;
			
		}
		
		
	}
	
	public String afficher(){
		
		String description = new String();
		
		for(Appartement a : this.appartements){
			description += a.toString();
		}
		
		return description;
		
	}
	
	public void ajoutAppartement(Appartement a){
		
		Appartement nouveauTableau[] = new Appartement[this.nbApptGeres + 1];
		
		int i = 0;
		
		while (i<nbApptGeres){
			
			nouveauTableau[i] = this.appartements[i];
			i++;
			
		}
		
		nouveauTableau[i] = a;
		this.appartements = new Appartement[this.nbApptGeres +1];
		
		i = 0;
		
		while(i<nbApptGeres){
			
			this.appartements[i] = nouveauTableau[i];
			
		}
		
		nbApptGeres++;
		
	}
	
	public int sommeLoyers(){
		
		int somme = 0;
		
		for(Appartement a : this.appartements){
			somme += a.loyer();
		}
		
		return somme;
		
	}
	
	public double moyenneLoyers(){
		return sommeLoyers()/nbApptGeres;
	}
	
	public Appartement getAppartement(String adresse){
		
		for (Appartement a : this.appartements){
			
			if(a.getAdresse().equals(adresse)){
				return a;
			}
			
		}
		
		return null;
	}
	
	public void supprimerAppartement(Appartement a){
		
		Appartement nouveauTableau[] = new Appartement[this.nbApptGeres - 1];
		
		int i = 0;
		
		while (i<nbApptGeres){
			
			if(this.appartements[i].getAdresse()!=a.getAdresse()){
				nouveauTableau[i] = this.appartements[i];
			}
			i++;
			
		}
		
		i = 0;
		
		this.appartements = new Appartement[this.nbApptGeres-1];
		
		while(i<nbApptGeres){
			
			this.appartements[i] = nouveauTableau[i];
			
		}
		
		nbApptGeres++;
		
	}
	
	
	

}
