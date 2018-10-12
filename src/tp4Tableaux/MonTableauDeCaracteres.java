package tp4Tableaux;

import java.util.Scanner;

public class MonTableauDeCaracteres {

	char[] contenu;
	
	public MonTableauDeCaracteres() {
		this.contenu = new char[0];
	}
	
	public MonTableauDeCaracteres(char[] t) {
		this.contenu = t;
	}
	
	public void afficherTableau() {
		
		if(this.contenu != null) {
			for (char c : this.contenu) {
				System.out.print(c);
			}
			System.out.print("\n");
		}
		
		else {
			System.out.println("le tableau est vide");
		}
		
	}
	
	public void saisirEtCreer(Scanner sc) {
		
		System.out.print("taille du tableau : ");
		contenu = new char[sc.nextInt()];
		int i = 0;
		
		System.out.println("entrez le contenu du tableau");
		
		while(i<contenu.length) {
			
			System.out.print("prochain caractere : ");
			contenu[i] = sc.next().charAt(0);
			i++;
			
		}
		
		System.out.println("tableau créé");
		
	}
	
	public int nombreOccurences(char C) {
		
		int n = 0;
		
		for (char c : this.contenu) {
			if(c == C) {
				n++;
			}
		}
		
		return n;
		
	}
	
	public void inverse() {
		
		char[] intermediaire = this.contenu.clone();
		int i = intermediaire.length - 1;
		int j = 0;
		
		while(i>=0) {
			this.contenu[j] = intermediaire[i];
			i--;
			j++;
		}
		
	}
	
	public MonTableauDeCaracteres instanceInverse() {
		
		MonTableauDeCaracteres t = new MonTableauDeCaracteres(this.contenu.clone());
		
		t.inverse();
		
		return t;
		
	}
	
	public boolean memeContenu(MonTableauDeCaracteres t) {	
		return egale(triAlphabetique(this.contenu),triAlphabetique(t.contenu));
	}
	
	public boolean estIdentique(MonTableauDeCaracteres t) {
		return egale(this.contenu,t.contenu);
	}
	
	public boolean estPalindrome() {
		
		int i = 0, taille = this.contenu.length;
		
		while(i <= taille / 2) {
			
			if(this.contenu[i] != this.contenu[taille-i-1]){
				return false;
			}
			
			i++;
			
		}
		
		return true;
	}
	
	public static boolean estTrie(char[] c) {
		
		int i = 0;
		
		while(i<c.length-1) {
			
			if (c[i]>c[i+1]) {
				return false;
			}
			
			i++;
			
		}
		
		return true;
	}
	
	public static char[] triAlphabetique(char[] c) {
		
		char[] contenuTrie = c.clone();
		char intermediaire;
		int i;
		
		while(!estTrie(contenuTrie)) {
			
			i = 0;
			
			while(i<contenuTrie.length-1) {
				
				if(contenuTrie[i]>contenuTrie[i+1]) {
					
					intermediaire = contenuTrie[i];
					contenuTrie[i] = contenuTrie[i+1];
					contenuTrie[i+1] = intermediaire;
					
				}
				
				i++;
				
			}
			
		}	
		
		return contenuTrie;
		
	}
	
	public static boolean egale(char[] c1, char[] c2) {
		
		int i = 0, taille = c1.length;
		
		if(taille != c2.length) {
			return false;
		}
		
		while(i<taille) {
			
			if(c1[i] != c2[i]) {				
				return false;		
			}
			
			i++;
		}
		
		return true;
	}
	
}
