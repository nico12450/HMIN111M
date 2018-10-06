package tp2Humain;

public class ProgrammeHumain {

	public static void main(String[] args) {

		Humain adam = new Humain("Adam",20,"homme");
		Humain eve = new Humain("Eve",20,"femme");
		
		System.out.println(adam);
		System.out.println(eve);
		
		adam.seSeparer(eve);
		eve.seMarier(adam,"01/01/2018","Paris",new Humain("jean",20,"homme"),new Humain("jeanne",20,"femme"),"inconnu");
		adam.seMarier(eve);	
		
		System.out.println(adam);
		System.out.println(eve);
		
		System.out.println("mariage de eve et adam : " + eve.getMariage());
		
	}

}
