package tp1Etudiant;

import java.util.Scanner;

public class ProgrammeEtudiant {

	public static void main(String[] args) {
		
//		SituationFinancière sf1 = SituationFinancière.autre;	
//		System.out.println(sf1.name().equals());
//		
//		System.exit(1);
		System.out.println("création des étudiants");
		
		Etudiant Jean = new Etudiant("Jean",0,0,0,24,1,3);
		Etudiant Abdoulkhader = new Etudiant("Abdoulkhader",0,0,0,23,2,3);
		Etudiant Astrid = new Etudiant("Astrid",0,0,0,26,1,2);
		Etudiant Paolo = new Etudiant("Paolo",0,0,0,27,1,2);
		Etudiant Zoe = new Etudiant("zoé",12,14,17,26,1,1);
		
		Astrid.setNoteProg(16);
		Astrid.setNoteSys(15);
		Astrid.setNoteStage(14);
		Zoe.setNoteProg(15);

		
		System.out.println(Zoe);
//		System.out.println("moyenne de Zoe : " + Zoe.moyenne());
//		System.out.println("mention de Zoe : " + Zoe.mention());
		System.out.println(Zoe.ligneResultats());
		
		Scanner sc = new Scanner(System.in);
		
		Zoe.saisie(sc);
		
		System.out.println(Zoe.getSituFin());
		

	}

}
