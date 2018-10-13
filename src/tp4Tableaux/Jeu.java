package tp4Tableaux;

public class Jeu {

	public static void main(String[] args) {
		
		Monde m1 = new Monde(10,10);
		m1.init(new int[][]{{1,2},{2,3}});
		m1.affichage();
		System.out.println(m1.getNbVoisins(2, 1));
		System.out.println(m1.getNbVoisins(2, 2));
		
	}

}
