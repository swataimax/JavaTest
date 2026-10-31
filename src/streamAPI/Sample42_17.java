package streamAPI;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * distinct
 */
public class Sample42_17 {
	public static void main(String[] args) {
		IntStream.of(0, 1, 2, 3, 2, 1, 0)
				.distinct()
				.forEach(x -> System.out.print(x + " "));
		
		System.out.println();
		
		Stream.of("a b c", "b c d", "x y z")
				.flatMap(w -> Stream.of(w.split(" ")))
				.distinct()
				.forEach(w -> System.out.print(w + " "));
	}
}
