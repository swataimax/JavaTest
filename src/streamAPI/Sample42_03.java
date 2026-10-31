package streamAPI;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * 2026/06/09
 * ストリームの種類
 */
public class Sample42_03 {

	public static void main(String[] args) {
		// IntStreamからStreamへ変換
		IntStream a = IntStream.of(2, 1, 3); 	// ストリームを生成
		Stream<Integer> b = a.boxed();
		
//		b.forEach(x -> System.out.println(x)); 	// ラムダ式
	    b.forEach(System.out::println);    		// メソッド参照
		
		// StreamからIntStreamへ変換
		List<Integer> list = List.of(20, 10, 30);
		Stream<Integer> s = list.stream();
		IntStream is = s.mapToInt(c -> c);
		
		is.forEach(System.out::println);
		
		
		
		System.out.println("-----");
		
		// ラムダ式
		IntStream.of(2, 1, 3)
				.boxed()
				.forEach(x -> System.out.println(x));
		
		System.out.println("--");
		
		// メソッド参照（クラスメソッド参照）
		IntStream.of(2, 1, 3)
				.boxed()
				.forEach(System.out::println);
		
		System.out.println("--");
		
		// 無名クラス
		IntStream.of(2, 1, 3)
				.boxed()
				.forEach(new Consumer<Integer>() {
					@Override
					public void accept(Integer x) {
						System.out.println(x);
					}
				});
		
		System.out.println("--");
		
		// ローカルクラス
		class LocalConsumer implements Consumer<Integer> {
			@Override
			public void accept(Integer x) {
				System.out.println(x);
			}
		}
		IntStream.of(2, 1, 3)
				.boxed()
				.forEach(new LocalConsumer());
		
	}
}

/*
 * ・IntStreamとStream<Integer>の変換
 * 
 * IntStream → Stream<Integer>
 * s1        → s1.boxed()
 *              s1.mapToObj(e -> e)
 * 
 * 
 * Stream<Integer> → IntStream
 * s2              → s2.mapToInt(c -> c)
 * 
 * 
 */


