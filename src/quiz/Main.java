package quiz;

import java.util.Random;

// 2025/06/10 本で勉強
// 2025/06/23 家のPCで試す
public class Main {

	public static void main(String[] args) {
		/*
		CalcQuiz q = new CalcQuiz();
		
		System.out.println(q.getQuestion());
		System.out.println(q.getAnswer());
		
		System.out.println("----------");
		System.out.println("----------");
		
		int quizNum = 5;
		CalcQuiz[] quiz = new CalcQuiz[quizNum];	//配列
		for (int i = 0; i < quizNum; i++) {
			quiz[i] = new CalcQuiz();
		}
		
		for (int i = 0; i < quizNum; i++) {
			System.out.println("問" + i + " : " + quiz[i].getQuestion());
		}
		
		System.out.println("----------");
		
		for (int i = 0; i < quizNum; i++) {
			System.out.println("答" + i + " : " + quiz[i].getAnswer());
		}
		
		System.out.println("----------");
		System.out.println("----------");
		
		//MushikuiQuiz
		for (int i = 0; i < quizNum; i++) {
			quiz[i] = new MushikuiQuiz();
		}
		
		for (int i = 0; i < quizNum; i++) {
			System.out.println("問" + i + " : " + quiz[i].getQuestion());
		}
		
		System.out.println("----------");
		
		for (int i = 0; i < quizNum; i++) {
			System.out.println("答" + i + " : " + quiz[i].getAnswer());
		}
		
		System.out.println("----------");
		System.out.println("----------");
		
		//MistakeQuiz
		for (int i = 0; i < quizNum; i++) {
			quiz[i] = new MistakeQuiz();
		}
		
		for (int i = 0; i < quizNum; i++) {
			System.out.println("問" + i + " : " + quiz[i].getQuestion());
		}
		
		System.out.println("----------");
		
		for (int i = 0; i < quizNum; i++) {
			System.out.println("答" + i + " : " + quiz[i].getAnswer());
		}
		
		System.out.println("----------");
		System.out.println("----------");
		
		//TanukiQuiz
		for (int i = 0; i < quizNum; i++) {
			quiz[i] = new TanukiQuiz();
		}
		
		for (int i = 0; i < quizNum; i++) {
			System.out.println("問" + i + " : " + quiz[i].getQuestion());
		}
		
		System.out.println("----------");
		
		for (int i = 0; i < quizNum; i++) {
			System.out.println("答" + i + " : " + quiz[i].getAnswer());
		}
		
		System.out.println("----------");
		System.out.println("----------");
		
		*/
		
		Random rnd = new Random();
		int quizNum = 5;
		Quiz[] quiz = new Quiz[quizNum];	//配列
		for (int i = 0; i < quizNum; i++) {
			int qID = rnd.nextInt(3);
			if (qID == 0) {
				quiz[i] = new MushikuiQuiz();
			} else if (qID == 1) {
				quiz[i] = new MistakeQuiz();
			} else {
				quiz[i] = new TanukiQuiz();
			}
		}
		
		for (int i = 0; i < quizNum; i++) {
			System.out.println("問" + i + " : " + quiz[i].getQuestion());
		}
		
		System.out.println("----------");
		
		for (int i = 0; i < quizNum; i++) {
			System.out.println("ヒント" + i + " : " + quiz[i].getHint());
		}
		
		System.out.println("----------");
		
		for (int i = 0; i < quizNum; i++) {
			System.out.println("答" + i + " : " + quiz[i].getAnswer());
		}
		
		System.out.println("----------");
		System.out.println("----------");
		
		for (int i = 0; i < quizNum; i++) {
			System.out.println("----------");
			System.out.println("問" + i + " : " + quiz[i].getQuestion());
			System.out.println("ヒント" + i + " : " + quiz[i].getHint());
			System.out.println("答" + i + " : " + quiz[i].getAnswer());
			System.out.println("----------");
		}
		
	}

}
