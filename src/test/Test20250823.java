package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//20250823
//Randomのテスト
//shuffleを使う
public class Test20250823 {
	public static void main(String[] args) {

		// 1から10までの配列を作成
		Integer[] numsArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		List<Integer> numsList = Arrays.asList(numsArr);
		System.out.println(numsList);
		System.out.println(numsList.getClass());
		//		[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		//		class java.util.Arrays$ArrayList
		//		
		System.out.println();

		Collections.shuffle(numsList);
		System.out.println(numsList);
		System.out.println(numsList.getClass());
		//		[7, 2, 4, 8, 5, 3, 9, 1, 6, 10]
		//		class java.util.Arrays$ArrayList

		System.out.println(numsList.get(0));
		//		7
		System.out.println(numsList.indexOf(5));
		//		4

		System.out.println();

		String[] strsArr = { "abc", "def", "ghi" };
		List<String> strsList = Arrays.asList(strsArr);
		System.out.println(strsList);
		//		[abc, def, ghi]

		Collections.shuffle(strsList);
		System.out.println(strsList);
		//		[def, abc, ghi]

		System.out.println(strsList.indexOf("def"));
		//		0

	}
}
