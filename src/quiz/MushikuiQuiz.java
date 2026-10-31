package quiz;

import java.util.Random;

public class MushikuiQuiz extends Quiz {
	
	MushikuiQuiz() {	//コンストラクタ
		createQuestion();
	}
	
	@Override
	void createQuestion() {
		Random rnd = new Random();
		int dan = rnd.nextInt(10);
		int qID = rnd.nextInt(10);
		this.question = "";
		
		for (int i = 0; i < 10; i++) {
			if (i == qID) {
				this.question += "[○]";
			} else {
				this.question += "[" + (dan * i) + "]";
			}
		}
		this.question += " : ○に入る数は何？";
		this.answer = "" + (dan * qID);
	}
	
	@Override
	public String getHint() {
		return "まずは九九の何の段か考えましょう";
	}
	
}
