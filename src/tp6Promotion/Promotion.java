package tp6Promotion;

import java.util.ArrayList;

public class Promotion {
	
	private int annee;
	private ArrayList<Etudiant> listeEtudiants;
	

	public Promotion(int annee) {
		
		this.annee = annee;
		this.listeEtudiants = new ArrayList<Etudiant>();
	}
	
	public void inscrire(Etudiant e){
		this.listeEtudiants.add(e);
	}
	
	public double moyenneGenerale(){
		
		double moyenne = 0;
		
		for(Etudiant e : this.listeEtudiants){
			moyenne+=e.moyenne();
		}
		
		moyenne /= this.listeEtudiants.size();
		
		return moyenne;
		
	}
	
	public String afficheResultats(){
		
		String description = "";
		
		for(Etudiant e : this.listeEtudiants){
			description += e.ligneResultats();
		}
		
		return description;
		
	}
	
	public Etudiant recherche(String nom){
		
		int i = 0;
		int taille = this.listeEtudiants.size();
		
		while(i < taille){
			if(this.listeEtudiants.get(i).getNom()==nom){
				return this.listeEtudiants.get(i);
			}
			i++;
		}
		
		return null;
	}
	
	public ArrayList<Etudiant> admis(){
		
		ArrayList<Etudiant> listeAdmis = new ArrayList<Etudiant>();
		
		for (Etudiant e : this.listeEtudiants){
			if(e.moyenne()>=10){
				listeAdmis.add(e);
			}
		}
		
		return listeAdmis;
	}
	
	public ArrayList<Etudiant> majors(){
		
		ArrayList<Etudiant> listeMajors = new ArrayList<Etudiant>();
		double max = 0;
		
		
		for (Etudiant e : this.listeEtudiants){
			
			if(e.moyenne() == max){
				listeMajors.add(e);
			}
			
			else if(e.moyenne() > max){
				
				max = e.moyenne();
				listeMajors = new ArrayList<Etudiant>();
				listeMajors.add(e);
				
			}
			
		}
		
		return listeMajors;
		
	}
	
	

}
