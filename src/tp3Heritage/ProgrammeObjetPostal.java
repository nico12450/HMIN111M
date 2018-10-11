package tp3Heritage;

public class ProgrammeObjetPostal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lettre l1 = new Lettre("famille touk, igloo 1, banquise sud", "famille Kouk, igloo 2, banquise nord", 12450, 25, 0.001, 1, false);
		Lettre l2 = new Lettre("disciple Chouk, grotte du glacier fondant", "chaman Sbouk, igloo 8, banquise nord", 14000, 850, 0.02, 2, true);
		System.out.println(l1);
		System.out.println(l2);
		
		Colis c1 = new Colis("banquiz compagnie", "famille Miko, igloo 2, banquise ouest", 15000, 5000, 0.25, 1, "glace pilée", 15);
		Colis c2 = new Colis("banquiz compagnie", "sculpteur Frodok, hangar 200, terres ouest", 25000, 2000000, 1, 2, "glace en cube", 40);
		System.out.println(c1);
		System.out.println(c2);

	}

}
