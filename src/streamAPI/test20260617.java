package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test20260617 {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("JAVA", "IS", "COOL");
		Stream<String> stream = words.stream()
				.filter(s -> s.length() > 3)
				.map(word -> word.toLowerCase());
		stream.forEach(System.out::println);
		
		
		List<String> words2 = Arrays.asList("1", "2", "3");
		Stream<Integer> stream2 = words2.stream()
				.map(s -> Integer.parseInt(s));
		stream2.forEach(System.out::println);
		
		Object[] arrObj = words2.stream()
				.map(s -> Integer.parseInt(s))
				.toArray();
		
		List<Integer> list = words2.stream()
				.map(s -> Integer.parseInt(s))
				.collect(Collectors.toList());
		System.out.println(list);
		
		Integer[] arr = words2.stream()
				.map(s -> Integer.parseInt(s))
//				.collect(Collectors.toList())
				.toArray(i -> new Integer[i]);
		System.out.println(Arrays.toString(arr));
		
		
	}

}
