package mondai;

import java.util.function.Consumer;

//2025/09/10
public class Mondai1 {

	public static void main(String[] args) {
		
		System.out.println("1------------------------------------------");
		
		int[] aimax0 = {
				0,0,1,0,0,1,0,1,0,0,0,1,0,0,1,0,0,1,0,1,0,-1,
				0,1,1,1,0,1,0,1,1,0,1,1,0,1,1,1,0,0,1,0,0,-1,
				0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,-1};
		for (int i = 0; i< aimax0.length; i++) {
			if (aimax0[i] == 0) {
				System.out.print("□");
			} else if (aimax0[i] > 0) {
				System.out.print("■");
			} else if (aimax0[i] < 0) {
				System.out.println();
			}
		}
		
		System.out.println("2------------------------------------------");
		
		int[][] aimax2 = {
				{0,0,1,0,0,1,0,1,0,0,0,1,0,0,1,0,0,1,0,1,0},
				{0,1,1,1,0,1,0,1,1,0,1,1,0,1,1,1,0,0,1,0,0},
				{0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0}
		};
		for (int i = 0; i < aimax2.length; i++) {
			for (int j = 0; j < aimax2[i].length; j++) {
				if (aimax2[i][j] == 0) {
					System.out.print("□");
				} else if (aimax2[i][j] == 1) {
					System.out.print("■");
				} else {
					System.out.print("　");
				}
			}
			System.out.println();
		}
		
		System.out.println("2-2-----------------------------------------");
		
		for (int i = 0; i < aimax2.length; i++) {
			for (int j = 0; j < aimax2[i].length; j++) {
				System.out.print(("" + aimax2[i][j]).replace("0", "□").replace("1", "■"));
			}
			System.out.println();
		}
		
		System.out.println("3------------------------------------------");
		
		String[][] s = new String[aimax2.length][aimax2[0].length];
		for (int i = 0; i < aimax2.length; i++) {
			for (int j = 0; j < aimax2[i].length; j++) {
				s[i][j] = "□";
				if (aimax2[i][j] == 0) {
					continue;
				}
				s[i][j] = "■";
			}
		}
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length; j++) {
				System.out.print(s[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("3-2-----------------------------------------");
		
		String[][] s2 = new String[aimax2.length][aimax2[0].length];
		for (int i = 0; i < aimax2.length; i++) {
			for (int j = 0; j < aimax2[i].length; j++) {
				if (j > 10) {
					break;
				}
				if (aimax2[i][j] == 0) {
					s2[i][j] = "□";
				} else if (aimax2[i][j] == 1) {
					s2[i][j] = "■";
				}
			}
		}
		for (int i = 0; i < aimax2.length; i++) {
			for (int j = 0; j < aimax2[i].length; j++) {
				if (j <= 10) {
					continue;
				}
				if (aimax2[i][j] == 0) {
					s2[i][j] = "□";
				} else if (aimax2[i][j] == 1) {
					s2[i][j] = "■";
				}
			}
		}
		for (int i = 0; i < s2.length; i++) {
			for (int j = 0; j < s2[i].length; j++) {
				System.out.print(s2[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("3-3-----------------------------------------");
		
		String[][] s3 = new String[aimax2.length][aimax2[0].length];
		label1:
		for (int i = 0; i < aimax2.length; i++) {
			for (int j = 0; j < aimax2[i].length; j++) {
				if (i > 0 && j > 10) {
					break label1;
				}
				if (aimax2[i][j] == 0) {
					s3[i][j] = "□";
				} else if (aimax2[i][j] == 1) {
					s3[i][j] = "■";
				}
			}
		}
		label2:
		for (int i = 0; i < aimax2.length; i++) {
			label3:
			for (int j = 0; j < aimax2[i].length; j++) {
				if (i == 0) {
					continue label2;
				}
				if (i == 1 && j <= 10) {
					continue label3;
				}
				if (aimax2[i][j] == 0) {
					s3[i][j] = "□";
				} else if (aimax2[i][j] == 1) {
					s3[i][j] = "■";
				}
			}
		}
		for (int i = 0; i < s3.length; i++) {
			for (int j = 0; j < s3[i].length; j++) {
				System.out.print(s3[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("4------------------------------------------");
		
		int[][] aimax3 = {
				{2,5,7,11,14,17,19,-1},
				{1,2,3,5,7,8,10,11,13,14,15,18,-1},
				{1,3,5,7,9,11,13,15,17,19,-1}
		};
		String[][] ss = new String[3][21];
		int k;
//		System.out.println(ss.length);
//		System.out.println(ss[1].length);
		for (int i = 0; i < ss.length; i++) {
			k = 0;
			for (int j = 0; j < ss[i].length; j++) {
//				System.out.println("i=" + i + ", j=" + j + ", k=" + k + ", aimax3[i][k]=" + aimax3[i][k]);
				ss[i][j] = "□";
				if (j == aimax3[i][k]) {
					ss[i][j] = "■";
					k++;
					continue;
				}
			}
		}
		for (int i = 0; i < ss.length; i++) {
			for (int j = 0; j < ss[i].length; j++) {
				System.out.print(ss[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("5------------------------------------------");
		
		String[] sss = new String[3];
		for (int i = 0; i < sss.length; i++) {
			sss[i] = "";
		}
		for (int j = 0; j < 21; j++) {
			switch (j) {
			case 2,5,7,11,14,17,19:
				sss[0] += "■";
				break;
			default:
				sss[0] += "□";
			}
		}
		for (int j = 0; j < 21; j++) {
			switch (j) {
			case 1,2,3,5,7,8,10,11,13,14,15,18:
				sss[1] += "■";
				break;
			default:
				sss[1] += "□";
			}
		}
		for (int j = 0; j < 21; j++) {
			switch (j) {
			case 1,3,5,7,9,11,13,15,17,19:
				sss[2] += "■";
				break;
			default:
				sss[2] += "□";
			}
		}
		for (int i = 0; i < sss.length; i++) {
			System.out.println(sss[i]);
		}
		
		System.out.println("5-2-----------------------------------------");
		
		for (int j = 0; j < 21; j++) {
			switch (j) {
			case 2,5,7,11,14,17,19:
				System.out.print("■");
				break;
			case 20:
				System.out.print("□\n");
				break;
			default:
				System.out.print("□");
			}
		}
		for (int j = 0; j < 21; j++) {
			switch (j) {
			case 1,2,3,5,7,8,10,11,13,14,15,18:
				System.out.print("■");
				break;
			case 20:
				System.out.print("□\n");
				break;
			default:
				System.out.print("□");
			}
		}
		for (int j = 0; j < 21; j++) {
			switch (j) {
			case 1,3,5,7,9,11,13,15,17,19:
				System.out.print("■");
				break;
			case 20:
				System.out.print("□\n");
				break;
			default:
				System.out.print("□");
			}
		}
		
		System.out.println("6------------------------------------------");
		
		int[][] aimax4 = {
				{2,2,1,3,2,2,1,-1},
				{1,0,0,1,1,0,1,0,1,0,0,2,-2},
				{1,1,1,1,1,1,1,1,1,1,-1}
		};
		
		for (int i = 0; i < aimax4.length; i++) {
			for (int j = 0; j < aimax4[i].length; j++) {
				if (aimax4[i][j] >= 0) {
					aimax4[i][j] *= 1;
					print("□", aimax4[i][j]);
					print("■", 1);
				} else {
					aimax4[i][j] *= -1;
					print("□", aimax4[i][j]);
					print("\n", 1);
				}
			}
		}
		
		
		System.out.println("7------------------------------------------");
		
		int[][] aimax = {
				{0,0,1,0,0,1,0,1,0,0,0,1,0,0,1,0,0,1,0,1,0},
				{0,1,1,1,0,1,0,1,1,0,1,1,0,1,1,1,0,0,1,0,0},
				{0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0}
		};
		
		// クラス
		Figure figure = new Figure(1, aimax);
		figure.print();
		
		System.out.println();
		
		// ローカルクラス
		class LocalFigure extends Figure {
			// コンストラクタ
			LocalFigure(int id, int[][] arr) {
				super(id, arr);
			}
			
			@Override
			public void print() {
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[i].length; j++) {
						System.out.print(("" + arr[i][j]).replace("0", "　").replace("1", "■"));
					}
					System.out.println();
				}
			}
		}
		LocalFigure localFigure = new LocalFigure(1, aimax);
		localFigure.print();
		
		System.out.println();
		
		// 無名クラス
		Figure anonymousFigure = new Figure(1, aimax) {
			@Override
			public void print() {
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[i].length; j++) {
						System.out.print(("" + arr[i][j]).replace("0", "　").replace("1", "■"));
					}
					System.out.println();
				}
			}
		};
		anonymousFigure.print();
		
		
		
		System.out.println("8------------------------------------------");
		// ラムダ式は関数型インターフェースが定義するメソッドの実装を行うための記法
		
		// ローカルクラス
		class LocalPrinter implements Printer {
			@Override
			public void print(int[][] arr) {
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[i].length; j++) {
						System.out.print(("" + arr[i][j]).replace("0", "□").replace("1", "■"));
					}
					System.out.println();
				}
			}
		}
		LocalPrinter localPrinter = new LocalPrinter();
		localPrinter.print(aimax);
		
		System.out.println();
		
		// 無名クラス(1)
		Printer anonymousPrinter = new Printer() {
			@Override
			public void print(int[][] arr) {
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[i].length; j++) {
						System.out.print(("" + arr[i][j]).replace("0", "□").replace("1", "■"));
					}
					System.out.println();
				}
			}
		};
		anonymousPrinter.print(aimax);
		
		System.out.println();
		
		// ラムダ式(1)
		Printer lambdaPrinter = (arr) -> {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(("" + arr[i][j]).replace("0", "□").replace("1", "■"));
				}
				System.out.println();
			}
		};
		lambdaPrinter.print(aimax);
		
		System.out.println();
		
		// ローカルクラス(2) 関数型インターフェースConsumer<T>
		class LocalConsumer implements Consumer<int[][]> {
			@Override
			public void accept(int[][] aimax) {
				for (int i = 0; i < aimax.length; i++) {
					for (int j = 0; j < aimax[i].length; j++) {
						System.out.print(("" + aimax[i][j]).replace("0", "２").replace("1", "■"));
					}
					System.out.println();
				}
			}
		}
		LocalConsumer localConsumer = new LocalConsumer();
		localConsumer.accept(aimax);
		
		System.out.println();
		
		// 無名クラス(2) 関数型インターフェースConsumer<T>
		Consumer<int[][]> anonymousConsumer = new Consumer<>() {
			@Override
			public void accept(int[][] arr) {
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[i].length; j++) {
						System.out.print(("" + arr[i][j]).replace("0", "２").replace("1", "■"));
					}
					System.out.println();
				}
			}
		};
		anonymousConsumer.accept(aimax);
		
		System.out.println();
		
		// ラムダ式(2) 関数型インターフェースConsumer<T>
		Consumer<int[][]> lambdaConsumer = arr -> {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(("" + arr[i][j]).replace("0", "２").replace("1", "■"));
				}
				System.out.println();
			}
		};
		lambdaConsumer.accept(aimax);
		
		
		
	}
	
	static void print(String str, int num) {
		if (num > 0) {
			for (int i = 0; i < num; i++) {
				System.out.print(str);
			}
		}
	}
	
	
	// 
	

}


/*
□□■□□■□■□□□■□□■□□■□■□
□■■■□■□■■□■■□■■■□□■□□
□■□■□■□■□■□■□■□■□■□■□

□□■□□■■■□■□■□□■□□■□■□
□■□■□□■□□■■■□■□■□■■■□
□■■■□□■□□■□■□■■■□□■□□
□■□■□□■□□■□■□■□■□■■■□
□■□■□■■■□■□■□■□■□■□■□

□□□■□□□□■■■□□■□□□■□□□■□□□■□□□■□
□□■□■□□□□■□□□■■□■■□□■□■□□□■□■□□
□■□□□■□□□■□□□■□■□■□■□□□■□□□■□□□
□■■■■■□□□■□□□■□□□■□■■■■■□□■□■□□
□■□□□■□□■■■□□■□□□■□■□□□■□■□□□■□


*/
