package lambdaExpression;

/*
 * 2025/09/23
 * ・ローカルクラス
 * ・無名クラス
 * ・ラムダ式
 * の書き換え練習
 * 
 */
public class TestBird {

	public static void main(String[] args) {
		
		// ローカルクラス
		class LocalBird implements Bird {
			@Override
			public void sing() {
				System.out.println("ちゅんちゅん");
			}
		}
		Bird bird1 = new LocalBird();
		bird1.sing();
		
		// 無名クラス
		Bird bird2 = new Bird() {
			@Override
			public void sing() {
				System.out.println("チュンチュン");
			}
		};
		bird2.sing();
		
		// ラムダ式
		Bird bird3 = () -> {
			System.out.println("ホーホケキョ");
		};
		bird3.sing();
		
		// ラムダ式の省略形
		Bird bird32 = () -> System.out.println("ホーホケキョ");
		bird32.sing();
		
		
		
		System.out.println("-----");
		
		
		
		// ローカルクラス
		class LocalBird2 implements Bird {
			@Override
			public void sing() {
				System.out.println("ちゅんちゅん");
			}
		}
		(new LocalBird2()).sing();
		
		// 無名クラス
		(new Bird() {
			@Override
			public void sing() {
				System.out.println("チュンチュン");
			}
		}).sing();
		
		// ラムダ式
//		(() -> {
//			System.out.println("ホーホケキョ");
//		}).sing();
		
		// ラムダ式の省略形
//		(() -> {System.out.println("ホーホケキョ");}).sing();
//		
//		(() -> System.out.println("ホーホケキョ")).sing();
		
		
		
		System.out.println("-----");
		
		
		
		// ローカルクラス
		class LocalBird3 implements Bird {
			@Override
			public void sing() {
				System.out.println("ちゅんちゅん");
			}
		}
		action(new LocalBird3());
		
		// 無名クラス
		action(new Bird() {
			@Override
			public void sing() {
				System.out.println("チュンチュン");
			}
		});
		
		// ラムダ式
		action(() -> {
			System.out.println("ホーホケキョ");
		});
		
		// ラムダ式の省略形
		action(() -> {System.out.println("ホーホケキョ");});
		
		action(() -> System.out.println("ホーホケキョ"));
		
		
		
		System.out.println("-----");
		
		
		// Runnableインターフェース
		// ローカルクラス
		class LocalRunnable implements Runnable {
			@Override
			public void run() {
				System.out.println("ちゅんちゅん");
			}
		}
		LocalRunnable bird4 = new LocalRunnable();
		bird4.run();
		
		// 無名クラス
		Runnable bird5 = new Runnable() {
			@Override
			public void run() {
				System.out.println("チュンチュン");
			}
		};
		bird5.run();
		
		// ラムダ式
		Runnable bird6 = () -> {
			System.out.println("ホーホケキョ");
		};
		bird6.run();
		
		// ラムダ式の省略形
		Runnable bird62 = () -> System.out.println("ホーホケキョ");
		bird62.run();
		
		
		
		System.out.println("-----");
		
		
		
		// ローカルクラス
		class LocalRunnable2 implements Runnable {
			@Override
			public void run() {
				System.out.println("ちゅんちゅん");
			}
		}
		(new LocalRunnable2()).run();
		
		// 無名クラス
		(new Runnable() {
			@Override
			public void run() {
				System.out.println("チュンチュン");
			}
		}).run();
		
		// ラムダ式
//		(() -> {
//			System.out.println("ホーホケキョ");
//		}).run();
		
		// ラムダ式の省略形
//		(() -> System.out.println("ホーホケキョ")).run();
		
	}
	
	static void action(Bird bird) {
		bird.sing();
	}

}
