package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

/*
 * 2026/06/10
 * flatMap
 * 
 */
public class Sample42_16 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("a b c", "x y z");
		System.out.println(list);
		
		list.stream()
				.map(t -> Arrays.stream(t.split(" ")))
				.forEach(word -> word.forEach(System.out::print));
		
		System.out.println();
		
		// flatMapを使用した場合
		list.stream()
				.flatMap(t -> Arrays.stream(t.split(" ")))
				.forEach(System.out::print);
		System.out.println();
		
		
		
		System.out.println("-----");
		
		// ラムダ式
		list.stream()
				.map(t -> Arrays.stream(t.split(" ")))
				.forEach(word -> word.forEach(System.out::print));
		System.out.println();
		
		// 無名クラス
		list.stream()
				.map(new Function<String, Stream<String>>() {
					@Override
					public Stream<String> apply(String t) {
						return Arrays.stream(t.split(" "));
					}
				})
				.forEach(new Consumer<Stream<String>>() {
					@Override
					public void accept(Stream<String> word) {
						word.forEach(System.out::print);
					}
				});
		System.out.println();
		
		
		
		// ラムダ式
		list.stream()
				.flatMap(t -> Arrays.stream(t.split(" ")))
				.forEach(System.out::print);
		System.out.println();
		
		// 無名クラス
		list.stream()
				.flatMap(new Function<String, Stream<String>>() {
					@Override
					public Stream<String> apply(String t) {
						return Arrays.stream(t.split(" "));
					}
				})
				.forEach(System.out::print);
		System.out.println();
		
		
		
	}
}

/*
 * flatMapメソッドを使用すると
 * ストリームのストリームを1つのストリームまとめることができる
 * 入れ子となっているストリームを平坦化し、ストリームに変換できる
 */
