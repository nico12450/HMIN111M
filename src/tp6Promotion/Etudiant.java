package tp6Promotion;

import java.util.Scanner;

public class Etudiant {

	private String nom;
	private double noteProg, noteSys, noteStage;
	private int age, codeInscription, codePays;
	private SituationFinancière situFin;
	
	public Etudiant(String nom, int age, int codeInscription, int codePays) {
		this.nom = nom;
		this.age = age;
		this.codeInscription = codeInscription;
		this.codePays = codePays;
	}
	
	public Etudiant(String nom, double noteProg, double noteSys,
			double noteStage, int age, int codeInscription, int codePays) {
		this.nom = nom;
		this.noteProg = noteProg;
		this.noteSys = noteSys;
		this.noteStage = noteStage;
		this.age = age;
		this.codeInscription = codeInscription;
		this.codePays = codePays;
	}
	
	public Etudiant(String nom, double noteProg, double noteSys,
			double noteStage, int age, int codeInscription, int codePays,
			SituationFinancière situFin) {
		this.nom = nom;
		this.noteProg = noteProg;
		this.noteSys = noteSys;
		this.noteStage = noteStage;
		this.age = age;
		this.codeInscription = codeInscription;
		this.codePays = codePays;
		this.situFin = situFin;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getNoteProg() {
		return noteProg;
	}

	public void setNoteProg(double noteProg) {
		if(noteProg >= 0 && noteProg <= 20){
			this.noteProg = noteProg;
		}
		else{
			System.out.println("erreur, la valeur entrée n'est pas comprise entre 0 et 20");
		}
	}

	public double getNoteSys() {
		return noteSys;
	}

	public void setNoteSys(double noteSys) {
		if(noteSys >= 0 && noteSys <= 20){
			this.noteSys = noteSys;
		}
		else{
			System.out.println("erreur, la valeur entrée n'est pas comprise entre 0 et 20");
		}
	}

	public double getNoteStage() {
		return noteStage;
	}

	public void setNoteStage(double noteStage) {
		if(noteStage >= 0 && noteStage <= 20){
			this.noteStage = noteStage;
		}
		else{
			System.out.println("erreur, la valeur entrée n'est pas comprise entre 0 et 20");
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getCodeInscription() {
		return codeInscription;
	}

	public void setCodeInscription(int codeInscription) {
		if(codeInscription == 1 || codeInscription == 2){
			this.codeInscription = codeInscription;
		}
		else{
			System.out.println("erreur, la valeur entrée doit être 1 ou 2");
		}
		
	}

	public int getCodePays() {
		return codePays;
	}

	public void setCodePays(int codePays) {
		if (codePays == 1 || codePays == 2 || codePays == 3){
			this.codePays = codePays;
		}
		else{
			System.out.println("erreur, la valeur entrée doit être 1,2 ou 3");
		}
		
		
	}

	@Override
	public String toString() {
		return "Etudiant [nom=" + nom + ", age=" + age + "]";
	}
	
	public double moyenne(){
		return (this.noteProg+this.noteStage+this.noteSys)/3;
	}
	
	public String mention(){
		
		double moyenne = this.moyenne();
		
		if(moyenne<12){
			return "pas de mention";
		}
		
		else if(moyenne<14){
			return "mention assez bien";
		}
		
		else if(moyenne<16){
			return "mention bien";
		}
		
		else{
			return "mention très bien";
		}
		
	}
	
	public String ligneResultats(){
		return "nom : " + this.nom + "; moyenne : " + this.moyenne() + "; mention : " + this.mention();
	}
	
	public void saisie(Scanner sc){
		
		System.out.println("entrez le nom de l'étudiant");
		this.nom = sc.next();
		System.out.println("entrez l'âge de l'étudiant");
		this.age = sc.nextInt();
		
		System.out.println("entrez la situation financière de l'étudiant");
		String situation = sc.next();
		for(SituationFinancière s : SituationFinancière.values()){
			if(situation.equals(s.toString())){
				this.situFin = s;
			}
		}
		
		System.out.println("fin de la saisie");
		
		sc.close();

	}
	
	public void setSituFin(SituationFinancière s){
		this.situFin = s;
	}
	
	public SituationFinancière getSituFin(){
		return situFin;
		
	}


}
