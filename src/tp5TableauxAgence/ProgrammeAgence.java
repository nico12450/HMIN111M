package tp5TableauxAgence;

public class ProgrammeAgence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Appartement a1 = new AppartementNormal("1092 avenue du pere soulas",2,2010,25,0,null);
		Appartement a2 = new AppartementLuxe("1080 avenue du pere soulas", 5, 2014, 120, null, null);
		Appartement tableauAppartements[] = {a1,a2};
		
		AgenceImmobiliere ag1 = new AgenceImmobiliere("la foret", "50 rue des acacias", tableauAppartements);
		System.out.println(ag1.afficher());
		System.out.println(a1.loyer());
		System.out.println(a2.loyer());
		System.out.println(ag1.sommeLoyers());
		System.out.println(ag1.moyenneLoyers());
		

	}

}
