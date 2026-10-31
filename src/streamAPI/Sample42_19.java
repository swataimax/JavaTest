package streamAPI;

import java.util.stream.IntStream;

/*
 * limit, skip
 */
public class Sample42_19 {
	public static void main(String[] args) {
		IntStream.iterate(0, i -> i + 2)
				.limit(10L)		// 要素数を10に制限
				.forEach(x -> System.out.print(x + " "));
		
		System.out.println();
		
		IntStream.range(0, 20)
				.skip(15L)		// 先頭から15要素をスキップ
				.forEach(x -> System.out.print(x + " "));
	}
}
