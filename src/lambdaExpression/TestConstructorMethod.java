package lambdaExpression;

import java.util.Random;
import java.util.function.Supplier;

/*
 * 2025/09/23
 * 2026/06/07
 * コンストラクタ参照
 * 
 */
public class TestConstructorMethod {
	public static void main(String[] args) {
		
		// ラムダ式
		Supplier<Random> sp1 = () -> new Random();
		Random rnd1 = sp1.get();
		System.out.println(rnd1.nextInt(10));
		
		// コンストラクタ参照
		Supplier<Random> sp2 = Random::new;
		Random rnd2 = sp2.get();
		System.out.println(rnd2.nextInt(10));
		
		// 無名クラス
		Supplier<Random> sp3 = new Supplier<Random>() {
			@Override
			public Random get() {
				return new Random();
			}
		};
		Random rnd3 = sp3.get();
		System.out.println(rnd3.nextInt(10));
		
		// ローカルクラス
		class LocalSupplier implements Supplier<Random> {
			@Override
			public Random get() {
				return new Random();
			}
		};
		LocalSupplier sp4 = new LocalSupplier();
		Random rnd4 = sp4.get();
		System.out.println(rnd4.nextInt(10));
		
		
	}
}
