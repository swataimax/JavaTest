package streamAPI;

import java.util.function.IntConsumer;
import java.util.stream.IntStream;

/*
 * ストリームのファクトリーメソッド
 * range, rangeClosed
 * ・rangeメソッド：終了値を含まない
 * ・rangeClosedメソッド：終了値を含む
 * 
 */
public class Sample42_07 {
	public static void main(String[] args) {
		IntConsumer ic = i -> System.out.print(i + " ");

		// 0から9までのストリームを生成
		IntStream stream1 = IntStream.range(0, 10);
		stream1.forEach(ic);

		System.out.println();

		// 0から10までのストリームを生成
		IntStream stream2 = IntStream.rangeClosed(0, 10);
		stream2.forEach(ic);
		
		
		
		System.out.println();
		
		
		
		System.out.println("-----");

		IntStream.range(0, 5)
				.forEach(i -> System.out.println(i));

		IntStream.range(0, 5)
				.forEach(i -> System.out.println("こんにちは"));

		IntStream.range(0, 5)
				.forEach(i -> System.out.println("x[" + i + "]"));

	}
}
