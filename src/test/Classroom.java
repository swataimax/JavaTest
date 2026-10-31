//2025/04/26
//成績を表示するプログラム
package test;

class Test {
	String subject;
	int point;
	
	void setPoint(String subject, int point) {
		this.subject = subject;
		this.point = point;
	}
	
	String getPoint() {
		return subject + ": " + point;
	}
}

class Student {
	int id;
	String name;
	int subnum; //教科数
	Test[] test;
	
	Student(int id, String name, int subnum) {
		this.id = id;
		this.name = name;
		this.subnum = subnum;
		test = new Test[subnum];
		for (int i = 0; i < subnum; i++) {
			test[i] = new Test();
		}
	}
	
	String getName() {
		return id + ": " + name;
	}
	
	int getGrade() {
		int sum = 0;
		for (int i = 0; i < subnum; i++) {
			sum += test[i].point;
		}
		return sum;
	}
	
	int getGrade(int a) {
		int base = 100 * subnum / a;
		int rank = getGrade() / base + 1;
		return (rank > a) ? a : rank;
	}
	
	void printScore() {
		System.out.println(getName());
		for (int i = 0; i < subnum; i++) {
			System.out.print(test[i].getPoint() + " ");
		}
		System.out.println();
		System.out.println("総得点: " + getGrade());
		int rank = 5;
		System.out.println(rank + "段階評価: " + getGrade(rank));
	}
}

public class Classroom {
	public static void main(String[] args) {
		Student taro = new Student(12, "Taro", 3);
		taro.test[0].setPoint("国語", 95);
		taro.test[1].setPoint("数学", 83);
		taro.test[2].setPoint("英語", 76);
		taro.printScore();
		System.out.println();
		
		Student jiro = new Student(7, "Taro", 3);
		jiro.test[0].setPoint("国語", 66);
		jiro.test[1].setPoint("数学", 97);
		jiro.test[2].setPoint("英語", 92);
		jiro.printScore();
		System.out.println();
		
	}
}


