package quiz;

import java.util.Random;

public class MistakeQuiz extends Quiz {
	
	MistakeQuiz() {	//コンストラクタ
		createQuestion();
	}
	
	@Override
	void createQuestion() {
		String[] correct = {"氷","問","島","緑","塊"};
		String[] mistake = {"水","間","鳥","縁","魂"};
		Random rnd = new Random();
		int qID = rnd.nextInt(correct.length);
		int answerID = rnd.nextInt(10);
		this.question = "";
		
		for (int i = 0; i < 10; i++) {
			if (i != answerID) {
				this.question += correct[qID];
			} else {
				this.question += mistake[qID];
			}
		}
		this.question += " : この中で違う文字は何文字目？";
		this.answer = (answerID + 1) + "文字目";
	}
	
	@Override
	public String getHint() {
		return "全体を通して見て違和感のあるところに注目しましょう";
	}
	
}
