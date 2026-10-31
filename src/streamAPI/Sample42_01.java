package streamAPI;

import java.util.List;
import java.util.function.Consumer;

/*
 * 2026/06/09
 * 内部イテレータ
 * 
 * StreamAPIは配列やコレクションに対して内部イテレータで繰り返しを行うためのAPI
 *  
 */
public class Sample42_01 {
	public static void main(String[] args) {
		// 外部イテレータ
		List<String> items = List.of("a", "b", "c");
		for (String s : items) {
			System.out.print(s + " ");
		}
		
		System.out.println(); // 改行
		
		
		
		// 内部イテレータ
		
		// ラムダ式
		items.forEach(s -> System.out.print(s + " "));
		
		// 無名クラス
		items.forEach(new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.print(s + " ");
			}
		});
		
		// ローカルクラス
		class LocalConsumer implements Consumer<String> {
			@Override
			public void accept(String s) {
				System.out.print(s + " ");
			}
		}
		items.forEach(new LocalConsumer());
		
		// ラムダ式2
		Consumer<String> c1 = s -> System.out.print(s + " ");
		items.forEach(c1);
		
		// 無名クラス2
		Consumer<String> c2 = new Consumer<>() {
			@Override
			public void accept(String s) {
				System.out.print(s + " ");
			}
		};
		items.forEach(c2);
		
		// ローカルクラス2
		class LocalConsumer2 implements Consumer<String> {
			@Override
			public void accept(String s) {
				System.out.print(s + " ");
			}
		}
		LocalConsumer2 c3 = new LocalConsumer2();
		items.forEach(c3);
		
	}
}

/* 
 * IterableインターフェースのforEachメソッドは
 * 引数に処理内容を渡すと内部で繰り返し処理を行ってくれる。
 * このように内部で繰り返し処理を行い、外には繰り返しの表示が現れない繰り返しを内部イテレータという
 */

/*
 * StreamAPIは内部イテレータを実現するためのAPI
 */
