package lambdaExpression;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * 2025/09/23
 * ・ローカルクラス
 * ・無名クラス
 * ・ラムダ式
 * の書き換え練習
 * 
 */
public class TestSort {
	
	public static void main(String[] args) {
		
//		List<Integer> list = new ArrayList<>();
//		list.add(2);
//		list.add(4);
//		list.add(5);
//		list.add(1);
//		list.add(3);
		
//		Integer[] array = {2,4,5,1,3};
//		List<Integer> list = Arrays.asList(array);
		
		List<Integer> list = Arrays.asList(2,4,5,1,3);
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list, Comparator.naturalOrder());
		System.out.println(list);
		Collections.sort(list, Comparator.reverseOrder());
		System.out.println(list);
		
		System.out.println("-----");
		
		// ローカルクラス
		class LocalComparator implements Comparator<Integer> {
			@Override
			public int compare(Integer x, Integer y) {
				return Integer.compare(x, y);
			}
		}
		Comparator<Integer> cmp1 = new LocalComparator();
		Collections.sort(list, cmp1);
		System.out.println(list);
		
		// 無名クラス
		Comparator<Integer> cmp2 = new Comparator<Integer>() {
			@Override
			public int compare(Integer x, Integer y) {
				return -Integer.compare(x, y);
			}
		};
		Collections.sort(list, cmp2);
		System.out.println(list);
		
		// ラムダ式
		Comparator<Integer> cmp3 = (Integer x, Integer y) -> {
			return +Integer.compare(x, y);
		};
		Collections.sort(list, cmp3);
		System.out.println(list);
		
		// ラムダ式の省略形
		Comparator<Integer> cmp4 = (x, y) -> -Integer.compare(x, y);
		Collections.sort(list, cmp4);
		System.out.println(list);
		
		
		
		System.out.println("-----");
		
		
		
		// 無名クラス
		Collections.sort(list, new Comparator<Integer>() {
			@Override
			public int compare(Integer x, Integer y) {
				return +Integer.compare(x, y);
			}
		});
		System.out.println(list);
		
		// ラムダ式
		Collections.sort(list, (Integer x, Integer y) -> {
				return -Integer.compare(x, y);
		});
		System.out.println(list);
		
		// ラムダ式の省略形
		Collections.sort(list, (Integer x, Integer y) -> {return +Integer.compare(x, y);});
		System.out.println(list);
		
		Collections.sort(list, (x, y) -> {return -Integer.compare(x, y);});
		System.out.println(list);
		
		Collections.sort(list, (x, y) -> +Integer.compare(x, y));
		System.out.println(list);
	
	}
}
