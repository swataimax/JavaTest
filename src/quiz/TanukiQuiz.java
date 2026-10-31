package quiz;

import java.util.Random;

public class TanukiQuiz extends Quiz {
	
	TanukiQuiz() {	//コンストラクタ
		createQuestion();
	}
	
	@Override
	void createQuestion() {
		String[] answerWord = {"おはよう","おやすみ","おいしい","おかしい"};
		Random rnd = new Random();
		int qID = rnd.nextInt(answerWord.length);
		this.question = answerWord[qID];
		
		for (int i = 0; i < 3; i++) {
			int cPos = rnd.nextInt(question.length());
			String firstHalf = this.question.substring(0, cPos);
			String secondHalf = this.question.substring(cPos);
			this.question = firstHalf + "た" + secondHalf;
		}
		this.question += " : このたぬきことばは？";
		this.answer = "たをぬくと : " + answerWord[qID];
	}
	
	@Override
	public String getHint() {
		return "おちついて「た」をとばしてよみましょう";
	}
}
