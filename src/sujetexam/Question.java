package sujetexam;

import java.util.ArrayList;

public class Question {
	private String question;
	private int difficult;
	private ArrayList<Reponse> listReponseQuestion;

	
	
	public ArrayList<Reponse> getListReponseQuestion() {
		return listReponseQuestion;
	}

	public void setListReponseQuestion(ArrayList<Reponse> listReponseQuestion) {
		this.listReponseQuestion = listReponseQuestion;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public int getDifficult() {
		return difficult;
	}

	public void setDifficult(int difficult) {
		this.difficult = difficult;
	}

	public Question() {
		// TODO Auto-generated constructor stub
	}
	public Question (String question,int difficult,ArrayList<Reponse> listReponse) {
		
		this.question=question;
		this.difficult=difficult;
		this.listReponseQuestion=listReponse;
		
	}

}
