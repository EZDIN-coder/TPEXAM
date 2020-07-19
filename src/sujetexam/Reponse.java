package sujetexam;

public class Reponse {
	private String enonce;
	private boolean verite;
	

	public String getEnonce() {
		return enonce;
	}


	public void setEnonce(String enonce) {
		this.enonce = enonce;
	}


	public boolean isVerite() {
		return verite;
	}


	public void setVerite(boolean verite) {
		this.verite = verite;
	}


	public Reponse() {
		// TODO Auto-generated constructor stub
	}
	
	public Reponse(String enonce,boolean verite) {
		this.enonce=enonce;
		this.verite=verite;
	}

}
