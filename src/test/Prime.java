//2025/04/26
package test;

public class Prime {
	public static void main(String[] args) {
		// 素数を探す
		int max = 100;
		boolean[] a = new boolean[max];
		
		for (int i = 0; i < max; i++) {
			a[i] = true;
		}
		for (int i = 2; i < max; i++) {
			if (a[i-1]) {
				for (int j = 2; i*j <= max; j++) {
					a[i*j-1] = false;
					//素数の倍数は素数ではない
				}
			}
		}
		for (int i = 1; i < max; i++) {
			if (a[i]) {
				System.out.println((i+1) + " ");
			}
		}
	}
}
