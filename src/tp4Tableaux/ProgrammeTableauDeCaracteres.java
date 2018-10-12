package tp4Tableaux;

import java.util.Scanner;

@SuppressWarnings("unused")
public class ProgrammeTableauDeCaracteres {

	public static void main(String[] args) {
		
		char[] t = {'a','z','e','r','t','y','a','b','c','d','e'};
		char[] t2 = {'b','o','b'};
		MonTableauDeCaracteres tab = new MonTableauDeCaracteres(t);
		MonTableauDeCaracteres tab3 = new MonTableauDeCaracteres(t2);
		
//		Scanner sc = new Scanner(System.in);
//		tab.saisirEtCreer(sc);
//		sc.close();
		
		tab.afficherTableau();
		System.out.println("nombre d'occurences de a : " + tab.nombreOccurences('a'));
		System.out.println("inversion du tableau");
		MonTableauDeCaracteres tab2 = tab.instanceInverse();
		tab2.afficherTableau();
		tab.afficherTableau();
		System.out.println(MonTableauDeCaracteres.triAlphabetique(tab.contenu));
		System.out.println(MonTableauDeCaracteres.triAlphabetique(tab2.contenu));
		System.out.println(tab.estIdentique(tab2));
		System.out.println(tab.memeContenu(tab2));
		System.out.println(tab.estPalindrome());
		System.out.println(tab3.estPalindrome());
		
		//System.out.println(MonTableauDeCaracteres.triAlphabetique(tab.contenu));
		

	}

}
