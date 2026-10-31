package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * 2026/06/09,10
 * map
 * 
 */
public class Sample42_14 {
	public static void main(String[] args) {
		
		IntStream stream1 = IntStream.of(0, 1, 2, 3, 4).map(i -> i * 2);
		stream1.forEach(i -> System.out.print(i + " "));
		System.out.println("\n");
		
		String text = "Thank You";
		Stream<Integer> stream2 = Arrays.stream(text.split(" ")).map(s -> s.length());
		stream2.forEach(System.out::println);
		System.out.println();
		
		List<String> words = Arrays.asList("JAVA", "IS", "COOL");
		Stream<String> stream3 = words.stream()
				.filter(s -> s.length() > 3)
				.map(word -> word.toLowerCase());
		stream3.forEach(System.out::println);
		
		
		
		System.out.println("-----");
		
		// ラムダ式
		IntStream.of(0, 1, 2, 3, 4)
				.map(i -> i * 2)
				.forEach(i -> System.out.print(i + " "));
		
		System.out.println();
		
		// 無名クラス
		IntStream.of(0, 1, 2, 3, 4)
				.map(new IntUnaryOperator() {
					@Override
					public int applyAsInt(int i) {
						return i * 2;
					};
				})
				.forEach(new IntConsumer() {
					@Override
					public void accept(int i) {
						System.out.print(i + " ");
					}
				});
		
		System.out.println();
		
		// ローカルクラス
		class LocalIntUnaryOperator implements IntUnaryOperator {
			@Override
			public int applyAsInt(int i) {
				return i * 2;
			}
		}
		class LocalIntConsumer implements IntConsumer {
			@Override
			public void accept(int i) {
				System.out.print(i + " ");
			}
		}
		IntStream.of(0, 1, 2, 3, 4)
				.map(new LocalIntUnaryOperator())
				.forEach(new LocalIntConsumer());
		
		System.out.println();
		
		
		
		// ラムダ式
		Arrays.stream(text.split(" "))
				.map(s -> s.length())
				.forEach(System.out::println);
		System.out.println();
		
		// 無名クラス
		Arrays.stream(text.split(" "))
				.map(new Function<String, Integer>() {
					@Override
					public Integer apply(String s) {
						return s.length();
					}
				})
				.forEach(System.out::println);
		System.out.println();
		
		
		
	}
}

