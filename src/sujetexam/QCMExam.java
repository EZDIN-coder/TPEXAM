package sujetexam;

import java.util.ArrayList;
import java.util.Scanner;

public class QCMExam {

	private ArrayList<Question> QCMlistQuestions;
	private int QcmDifficult;
	
	
	
	private ArrayList<Question> getQCMlistQuestions() {
		return QCMlistQuestions;
	}



	private void setQCMlistQuestions(ArrayList<Question> qCMlistQuestions) {
		QCMlistQuestions = qCMlistQuestions;
	}



	private int getQcmDifficult() {
		return QcmDifficult;
	}



	private void setQcmDifficult(int qcmDifficult) {
		QcmDifficult = qcmDifficult;
	}



	public QCMExam() {
		// TODO Auto-generated constructor stub
	}
	public QCMExam(ArrayList<Question> QCMlists) {
		this.QCMlistQuestions= QCMlists;
	}
	
	public int calculateQCMDifficulty(ArrayList<Question> QCMList) {
		
		int difficulty = 0;
		for (Question myquestion : QCMList) {

			 difficulty+=myquestion.getDifficult();
		
		}
		return difficulty/QCMList.size();
				
	}
		
	public static void main(String args []) {
		
		ArrayList<Question> examQuestions= new ArrayList<Question>();		
		ArrayList <Reponse> reponseQuestion1= new ArrayList<Reponse>();
		ArrayList <Reponse> reponseQuestion2= new ArrayList<Reponse>();
		
		Reponse reponse1Q1=new Reponse("Reponse1",true);
		Reponse reponse2Q1=new Reponse("Reponse2",false);
		Reponse reponse3Q1=new Reponse("Reponse3",false);
		Reponse reponse4Q1=new Reponse("Reponse4",false);
		
		
		reponseQuestion1.add(reponse1Q1);
		reponseQuestion1.add(reponse2Q1);
		reponseQuestion1.add(reponse3Q1);
		reponseQuestion1.add(reponse4Q1);
		
		
		Reponse reponse1Q2=new Reponse("Reponse1",false);
		Reponse reponse2Q2=new Reponse("Reponse2",false);
		Reponse reponse3Q2=new Reponse("Reponse3",true);
		Reponse reponse4Q2=new Reponse("Reponse4",true);
		
		reponseQuestion2.add(reponse1Q2);
		reponseQuestion2.add(reponse2Q2);
		reponseQuestion2.add(reponse3Q2);
		reponseQuestion2.add(reponse4Q2);
		
		Question question1= new Question("Question 1", 60, reponseQuestion1);
		Question question2= new Question("Question 2", 70, reponseQuestion2);
		
		examQuestions.add(question1);
		examQuestions.add(question2);
		
		
		QCMExam exam=new QCMExam(examQuestions);
		exam.setQcmDifficult(exam.calculateQCMDifficulty(examQuestions));
		
		System.out.println("Examen getQcmDifficult  >>>>  " +exam.getQcmDifficult());
		System.out.println("**********************************QCM**************************");
		System.out.println("L'examen comporte "+exam.getQCMlistQuestions().size() + "  Questions");
		
		//traitement de la question 1
		
		System.out.println("La question est :"+exam.getQCMlistQuestions().get(0).getQuestion());
		System.out.println(" la difficulté de Cette question et "+exam.getQCMlistQuestions().get(0).getDifficult()+" et elle comporte "+exam.getQCMlistQuestions().get(0).getListReponseQuestion().size()+"  reponses");
		System.out.println("Reponse 1 : "+exam.getQCMlistQuestions().get(0).getListReponseQuestion().get(0).getEnonce());
		System.out.println(" Veuiller repondre par true or false pour cette reponse");
		Scanner sc =new Scanner(System.in);
		
		// traitement réponse 1 de la question 1
		boolean reponse1Q11=sc.nextBoolean();
		if (reponse1Q11 == exam.getQCMlistQuestions().get(0).getListReponseQuestion().get(0).isVerite()) {
			System.out.println(" Bravoo bonne réponse ");
		}else {
			System.out.println(" Désolée mauvaise réponse ");
		}
		
		// traitement réponse 2 de la question 1
		System.out.println("Reponse 2 : "+exam.getQCMlistQuestions().get(0).getListReponseQuestion().get(1).getEnonce());
		boolean reponse2Q11=sc.nextBoolean();
		if (reponse2Q11 == exam.getQCMlistQuestions().get(0).getListReponseQuestion().get(1).isVerite()) {
			System.out.println(" Bravoo bonne réponse ");
		}else {
			System.out.println(" Désolée mauvaise réponse ");
		}
		
		// traitement réponse 3 de la question 1
		// traitement réponse 4 de la question 1
		
		//traitement de la question 2
		
		System.out.println("La question est :"+exam.getQCMlistQuestions().get(1).getQuestion());
		System.out.println(" la difficulté de Cette question et "+exam.getQCMlistQuestions().get(1).getDifficult()+" et elle comporte "+exam.getQCMlistQuestions().get(0).getListReponseQuestion().size()+"  reponses");
		System.out.println("Reponse 1 : "+exam.getQCMlistQuestions().get(0).getListReponseQuestion().get(0).getEnonce());
		System.out.println(" Veuiller repondre par true or false pour cette reponse");
		Scanner sc1 =new Scanner(System.in);
		
		//traitement de la réponse 1 de la question 2
		
		boolean reponse1Q21=sc.nextBoolean();
		if (reponse1Q21 == exam.getQCMlistQuestions().get(1).getListReponseQuestion().get(0).isVerite()) {
			System.out.println(" Bravoo bonne réponse ");
		}else {
			System.out.println(" Désolée mauvaise réponse ");
		}
		//traitement de la réponse 2 de la question 2
		
		System.out.println("Reponse 2 : "+exam.getQCMlistQuestions().get(1).getListReponseQuestion().get(1).getEnonce());
		System.out.println(" Veuiller repondre par true or false pour cette reponse");
		boolean reponse2Q21=sc.nextBoolean();
		if (reponse2Q21 == exam.getQCMlistQuestions().get(1).getListReponseQuestion().get(1).isVerite()) {
			System.out.println(" Bravoo bonne réponse ");
		}else {
			System.out.println(" Désolée mauvaise réponse ");
		}
	}
	

}
