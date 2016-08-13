package uloge;

public class Poslanik extends Gradjanin {
	
	String user;
	String pass;
	
	public Poslanik(){}
	
	public Poslanik(String user, String pass){
		this.user = user;
		this.pass = pass;
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

	@Override
	public String toString() {
		return "Poslanik [user=" + user + ", pass=" + pass + "]";
	}
	
	

}
