package tp2Humain;

public class Mariage {
	
	public Mariage(String date, String lieu, String typeContrat,
			Humain temoin1, Humain temoin2) {
		this.date = date;
		this.lieu = lieu;
		this.typeContrat = typeContrat;
		this.temoin1 = temoin1;
		this.temoin2 = temoin2;
	}
	private String date, lieu, typeContrat;
	private Humain temoin1, temoin2;
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	public String getTypeContrat() {
		return typeContrat;
	}
	public void setTypeContrat(String typeContrat) {
		this.typeContrat = typeContrat;
	}
	public Humain getTemoin1() {
		return temoin1;
	}
	public void setTemoin1(Humain temoin1) {
		this.temoin1 = temoin1;
	}
	public Humain getTemoin2() {
		return temoin2;
	}
	public void setTemoin2(Humain temoin2) {
		this.temoin2 = temoin2;
	}
	@Override
	public String toString() {
		return "Mariage [date=" + date + ", lieu=" + lieu + ", typeContrat="
				+ typeContrat + ", temoin1=" + temoin1 + ", temoin2=" + temoin2
				+ "]";
	}
	

}
