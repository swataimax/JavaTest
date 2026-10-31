package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/*
 * 配列から生成
 * 
 */
public class Sample42_04 {

	public static void main(String[] args) {
		String[] array = { "0", "1", "2", "3", "4", "5", "6" };
		Consumer<String> c = s -> System.out.print(s + " ");
		
		// すべての要素からストリームを生成
		Stream<String> stream1 = Arrays.stream(array);
		stream1.forEach(c);
		
		System.out.println();
		
		// インデックス2から4まで(5未満)のストリームを生成
		Stream<String> stream2 = Arrays.stream(array, 2, 5);
		stream2.forEach(c);
		
		System.out.println();
		
		int[] intStream = { 1, 2, 3, 4, 5 };
		IntStream is = Arrays.stream(intStream);
		
		System.out.println(is.sum()); // 合計を表示
		
		long[] longArray = { 6L, 7L, 8L, 9L };
		LongStream ls = Arrays.stream(longArray);
		
		System.out.println(ls.average().getAsDouble()); // 平均を表示
		// averageメソッドの戻り値はOptionalDouble型なので、
		// getAsDoubleメソッドでdouble型で値を取得している
		
		
		
		System.out.println("-----");
		
		String[] array01 = {"abc", "def", "ghi"};
		System.out.println(Arrays.toString(array01));
		
//		List<String> list02 = List.of("abc", "def", "ghi");
		List<String> list02 = Arrays.asList("abc", "def", "ghi");
		System.out.println(list02);
		
		Stream<String> stream011 = Arrays.stream(array01);
		Stream<String> stream012 = Stream.of(array01);
		stream011.forEach(c);
		System.out.println();
		stream012.forEach(c);
		System.out.println();
		
		Stream<String> stream02 = list02.stream();
		stream02.forEach(c);
		System.out.println();
		
		
	}
}

/*
 * ・配列からストリームを生成
 * 
 * 配列     → ストリーム
 * String[] → Stream<String>
 * array    → Arrays.stream(array)
 *             Stream.of(array)			引数は可変長引数、配列
 * 
 * int[]    → IntStream
 * array    → Arrays.stream(array)
 *             IntStream.of(array)
 * 
 * long[]   → LongStream
 * array    → Arrays.stream(array)
 *             LongStream.of(array)
 * 
 * double[] → DoubleStream
 * array    → Arrays.stream(array)
 *             DoubleStream.of(array)
 * 
 * 
 * ・リストからストリームを生成（コレクションから生成する場合も同じ）
 * 
 * リスト       → ストリーム
 * List<String> → Stream<String>
 * list         → list.stream()
 * 
 * List<Integer>→ Stream<Integer>
 * list         → list.stream()
 * 
 * 
 */



/*
 * ・配列
 * String[] array = {"abc", "def", "ghi"};
 * 
 * 
 * ・リスト
 * List<String> list = List.of("abc", "def", "ghi");
 * List<String> list = Arrays.asList("abc", "def", "ghi");
 * 
 * 
 * ・配列   → リスト
 * String[] → List<String>
 * array    → Arrays.asList(array)
 * 
 * ・リスト     → 配列
 * List<String> → String[]
 * list         → list.toArray(new String[list.size()])
 * 
 * 
 * ・List ⇔ 配列の相互変換は toArray と asList で
 * 
 * 
 * 
 * ・Listを出力 : System.out.println(list)
 * ・配列を出力 : System.out.println(Arrays.toString(array))
 * 
 * 
 */
