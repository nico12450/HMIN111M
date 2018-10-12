package tp4;

import java.util.Scanner;

public class MonTableauDeCaracteres {
	
	private char[] contenu;
	
	public MonTableauDeCaracteres(){
		this.contenu = new char[]{};
	}

	public MonTableauDeCaracteres(char[] t) {
		
		this.contenu = t;
		
	}
	
	public void afficher(){
		
		for (char c : this.contenu){
			System.out.print(c);
		}
		
	}
	
	public void saisirEtCreer(Scanner sc){
		
		this.contenu = new char[]{};
		
		System.out.print("entrez la taille du tableau : ");
		int taille = sc.nextInt();
				
		
		System.out.println("entrez les caractères du tableau");
		
		int i = 0;
		
		while(i < taille){
			
			System.out.print("caractere suivant : ");
			this.contenu[i] = sc.next().charAt(0);
			i++;
			
		}
		
	}
	
}
