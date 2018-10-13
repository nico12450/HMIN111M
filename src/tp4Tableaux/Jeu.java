package tp4Tableaux;

import java.util.Scanner;

public class Jeu {

	public static void main(String[] args) {
		
		Monde m1 = new Monde(20,20);
		m1.init(new int[][]{{2,1},{2,2},{2,3}});
		m1.init(new int[][]{{1,16},{2,16},{3,16},{3,17},{2,18}});
		
		m1.affichage();
		//System.out.println(m1.getNbVoisins(1, 2));
		//System.out.println(m1.getNbVoisins(2, 1));
		//System.out.println(m1.getNbVoisins(2, 2));
		
		//m1.etatSuivant();
		//m1.affichage();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("continuer ? (y/n)");
			
			if(sc.next().charAt(0) == 'n') {
				break;
				
			}
			
			m1.etatSuivant();
			m1.affichage();
			
		}
		
		sc.close();
		
	}

}
