//2025/04/26
//Javaの絵本（武蔵境図書館）
package test;

public class Sample1 {
	public static void main(String[] args) {
		
		// printf
		System.out.printf("%4d",25);
		System.out.println();
		
		System.out.printf("%04d",25);
		System.out.println();
		
		System.out.printf("% 4d",25);
		System.out.println();
		
		// String
		String a = "abc";
		String b = "abc";
		String c = "efg";
		System.out.println(a == b);
		System.out.println(a.equals(b));
		System.out.println(a == c);
		System.out.println(a.equals(c));
		
		// a.compareTo(b) 同じなら0、a<bなら負の数、a>bなら正の数を返す
		System.out.println(a.compareTo(b));
		System.out.println(a.compareTo(c));
		System.out.println(c.compareTo(a));
		
		// 閏年の判定
		int y = 2025;
		if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0 ) {
			System.out.println(y + "は閏年");
		} else {
			System.out.println(y + "は閏年でない");
		}		
		y = 2000;
		if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0 ) {
			System.out.println(y + "は閏年");
		} else {
			System.out.println(y + "は閏年でない");
		}		

	}

}
