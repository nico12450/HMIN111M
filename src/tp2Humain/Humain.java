package tp2Humain;

public class Humain {
	
	private String nom, genre;
	@SuppressWarnings("unused")
	private Genre genreEnum;
	private int age;
	private Humain conjoint;
	private Mariage mariage;
	
	public Humain() {
		this.conjoint = null;
	}
	
	public Humain(String nom, int age, String genre) {
		
		this.nom = nom;
		this.age = age;
		this.genre = genre;
		
		if(genre == "homme"){
			genreEnum = Genre.homme;
		}
		else{
			genreEnum = Genre.femme;
		}
		
		this.conjoint = null;
		this.mariage = null;
		
	}
	
	public void seMarier(Humain conjoint) {
		
		if((this.conjoint == null && conjoint.conjoint == null) || (this.conjoint == null && conjoint.conjoint == this)) {
			
			this.conjoint = conjoint;
			conjoint.seMarier(this);
			System.out.println(this.nom + " est désormais marié(e) à " + conjoint.nom);
			
		}
		else if(this.conjoint == conjoint && conjoint.conjoint == this){
			System.out.println(this.nom + " et " + conjoint.nom + " sont mariés");
		}
		
		else {
			System.out.println("impossible de marier " + this.nom + " à " + conjoint.nom + " car au moins un des deux est déjà marié");
		}
		
	}
	
	public void seMarier(Humain conjoint, String date, String lieu, Humain temoin1, Humain temoin2, String typeContrat){
		
		if((this.conjoint == null && conjoint.conjoint == null) || (this.conjoint == null && conjoint.conjoint == this)) {
			
			this.conjoint = conjoint;
			conjoint.seMarier(this);
			System.out.println(this.nom + " est désormais marié(e) à " + conjoint.nom);
			this.mariage = new Mariage(date,lieu,typeContrat,temoin1,temoin2);
			
		}
		
		else {
			System.out.println("impossible de marier " + this.nom + " à " + conjoint.nom + " car au moins un des deux est déjà marié");
		}
		
	}
	
	public boolean estMarie() {
		return this.conjoint!=null;
	}
	
	public void seSeparer(Humain conjoint) {
		
		if(this.conjoint == conjoint) {
			
			this.conjoint = null;
			conjoint.conjoint = null;
			
		}
		
		else {
			System.out.println("impossible de se séparer sans être marié au préalable");
		}
		
	}
	
	public boolean estMajeur() {
		return this.age>=18;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Humain getConjoint() {
		return this.conjoint;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public Mariage getMariage(){
		return this.mariage;
	}

	@Override
	public String toString() {
		
		String situation = new String();
		
		situation += this.nom;
				
		if (this.genre == "femme") {
			
			situation += " est une femme";
					
			if(this.conjoint == null) {
				situation += " célibataire \n";
			}
			else {
				situation += "\n";
				situation += "Elle est mariée à " + this.conjoint.nom + "\n";
			}
			
			situation += "elle a " + this.age + " ans";
			
		}
		else {
			
			situation += " est un homme";
			
			if(this.conjoint == null) {
				situation += " célibataire \n";
			}
			else {
				
				situation += "\n";
				situation += "Il est marié à " + this.conjoint.nom + "\n";
				
			}
			
			situation += "il a " + this.age + " ans";
			
		}
		
		situation += "\n";
		
		return situation;
	}
	
	

}
