package uloge;

public class Korisnik {
	
	private String user;
	private String pass;
	private Funkcija funkcija;
	
	public Korisnik(){}
	
	public Korisnik(String user, String pass, Funkcija funkcija){
		this.user = user;
		this.pass = pass;
		this.funkcija = funkcija;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public Funkcija getFunkcija() {
		return funkcija;
	}

	public void setFunkcija(Funkcija funkcija) {
		this.funkcija = funkcija;
	}
	
	

}
