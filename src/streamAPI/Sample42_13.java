package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

/*
 * 2026/06/10
 * filter
 */
public class Sample42_13 {
	public static void main(String[] args) {
		IntStream st = IntStream.range(0, 10).filter(i -> i % 2 == 0);
		st.forEach(s -> System.out.print(s + " "));
		
		
		List<String> list = Arrays.asList(
				"blue", "cyan", "gray", "green", "magenta",
				"orange", "pink", "red", "white", "yellow");
		list.stream().filter(s -> s.length() >= 5)
				.forEach(System.out::println);
		
		
		
		System.out.println();
		System.out.println("-----");
		
		// ラムダ式
		IntStream
				.range(0, 10)
				.filter(i -> i % 2 == 0)
				.forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		// 無名クラス
		IntStream
				.range(0, 10)
				.filter(new IntPredicate() {
					@Override
					public boolean test(int i) {
						return i % 2 == 0;
					}
				})
				.forEach(new IntConsumer() {
					@Override
					public void accept(int s) {
						System.out.print(s + " ");
					}
				});
		System.out.println();
		
		
		// ラムダ式
		Arrays.asList(
				"blue", "cyan", "gray", "green", "magenta",
				"orange", "pink", "red", "white", "yellow")
				.stream()
				.filter(s -> s.length() >= 5)
				.forEach(System.out::println);
		System.out.println();
		
		// 無名クラス
		Arrays.asList(
				"blue", "cyan", "gray", "green", "magenta",
				"orange", "pink", "red", "white", "yellow")
				.stream()
				.filter(new Predicate<String>() {
					@Override
					public boolean test(String s) {
						return s.length() >= 5;
					}
				})
				.forEach(new Consumer<String>() {
					@Override
					public void accept(String s) {
						System.out.println(s);
					}
				});
		System.out.println();
		
		
	}
}
