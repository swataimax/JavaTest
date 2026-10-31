package streamAPI;

import java.util.Comparator;
import java.util.stream.Stream;

/*
 * sorted
 */
public class Sample42_18 {
	public static void main(String[] args) {
		Stream.of("red", "blue", "yellow")
				.sorted()
				.forEach(x -> System.out.print(x + " "));
		
		System.out.println();
		
		Stream.of("red", "blue", "yellow")
				.sorted(Comparator.reverseOrder())
				.forEach(x -> System.out.print(x + " "));
	}
}
