package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*
 * 2026/06/09
 * Collectionのストリーム
 * 
 */
public class Sample42_02 {

	public static void main(String[] args) {
		List<String> words = Arrays.asList(
				"blue", "cyan", "gray", "green", "magenta",
				"orange", "pink", "red", "white", "yellow");
		System.out.println(words);
		
		
		// ラムダ式
		List<String> longWords = words
				.stream() 						// ストリーム生成
				.filter(w -> w.length() >= 5) 	// 中間操作(長さ5以上を選択)
				.collect(Collectors.toList()); 	// 終端操作(Listに格納)
		System.out.println(longWords);
		
		
		// 無名クラス
		List<String> longWords2 = words
				.stream() 						// ストリーム生成
				.filter(new Predicate<String>() {
					@Override
					public boolean test(String w) {
						return w.length() >= 5;
					};
				}) 								// 中間操作(長さ5以上を選択)
				.collect(Collectors.toList()); 	// 終端操作(Listに格納)
		System.out.println(longWords2);
		
		// ローカルクラス
		class LocalPredicate implements Predicate<String> {
			@Override
			public boolean test(String w) {
				return w.length() >= 5;
			}
		}
		List<String> longWords3 = words
				.stream() 						// ストリーム生成
				.filter(new LocalPredicate())	// 中間操作(長さ5以上を選択)
				.collect(Collectors.toList()); 	// 終端操作(Listに格納)
		System.out.println(longWords3);
		
		
	}
}
