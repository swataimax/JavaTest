package streamAPI;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/*
 * ストリームのファクトリーメソッド
 * of
 * 
 */
public class Sample42_06 {
	public static void main(String[] args) {
		// 文字列a, b, cを要素の持つストリームを生成
		Stream<String> stream1 = Stream.of("a", "b", "c");
		stream1.forEach(s -> System.out.print(s + " "));
		System.out.println();

		// int型の値1, 2, 3を要素の持つストリームを生成
		IntStream stream2 = IntStream.of(1, 2, 3);
		System.out.println(stream2.max().getAsInt()); // 最大値
		
		// long型の値1L, 2L, 3Lを要素の持つストリームを生成
		LongStream stream3 = LongStream.of(1L, 2L, 3L);
		System.out.println(stream3.min().getAsLong()); // 最小値
		
		// 浮動小数点数0.1, 0.2, 0.3を要素の持つストリームを生成
		DoubleStream stream4 = DoubleStream.of(0.1, 0.2, 0.3);
		System.out.println(stream4.findFirst().getAsDouble()); // 先頭の要素
		
		
		
		System.out.println("-----");
		
		// Integer型のストリームを生成
		Stream<Integer> stream5 = Stream.of(1, 2, 3);
		stream5.forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		
	}
}