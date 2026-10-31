package quiz;

import java.util.Random;

public class CalcQuiz {
	// フィールド
	String question;
	String answer;
	
	// ソース→getter及びsetterの作成
	
	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	// コンストラクタ
	CalcQuiz() {
		createQuestion();
	}
	
	void createQuestion() {
		Random rnd = new Random();
		int a = rnd.nextInt(100);
		int b = rnd.nextInt(100);
		this.question = a + "x" + b + "= ?";
		this.answer = Integer.toString(a * b);
	}
	
}
