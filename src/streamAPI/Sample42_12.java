package streamAPI;

import java.util.function.IntConsumer;

/*
 * 2026/09/10
 * （参考）文字
 */
public class Sample42_12 {
	public static void main(String[] args) {
		String text = "Hello World";
		text.chars().forEach(c -> System.out.print((char) c));
		
		
		
		System.out.println("-----");
		
		// ラムダ式
		text.chars()
				.forEach(c -> System.out.print((char) c));
		
		System.out.println();
		
		// 無名クラス
		text.chars()
				.forEach(new IntConsumer() {
					@Override
					public void accept(int c) {
						System.out.print((char) c);
					}
				});
		System.out.println();
		
	}
}
/*
 * 文字列の並びを扱うCharSequenceインターフェースにストリームを返すメソッドが2つある
 *  charsメソッド
 */
