package lambdaExpression;

import java.util.function.IntFunction;

/*
 * 2025/09/23
 * ・ローカルクラス
 * ・無名クラス
 * ・ラムダ式
 * の書き換え練習
 * 
 */
public class TestCalc {

	public static void main(String[] args) {
		
		// ローカルクラス
		class LocalCalc implements Calc {
			@Override
			public int calc(int x) {
				return x * x;
			}
		}
		LocalCalc c1 = new LocalCalc();
		System.out.println(c1.calc(2));
		
		// 無名クラス
		Calc c2 = new Calc() {
			@Override
			public int calc(int x) {
				return x * x;
			}
		};
		System.out.println(c2.calc(2));
		
		// ラムダ式
		Calc c3 = (int x) -> {
			return x * x;
		};
		System.out.println(c3.calc(2));
		
		// ラムダ式の省略形
		Calc c31 = (int x) -> {return x * x;};
		Calc c32 = (x) -> {return x * x;};
		Calc c33 = x -> {return x * x;};
		Calc c34 = x -> x * x;
		System.out.println(c31.calc(2));
		System.out.println(c32.calc(2));
		System.out.println(c33.calc(2));
		System.out.println(c34.calc(2));
		
		
		
		System.out.println("-----");
		
		
		
		// ローカルクラス
		class LocalCalc2 implements Calc {
			@Override
			public int calc(int x) {
				return x * x;
			}
		}
		System.out.println(new LocalCalc2().calc(2));
		
		// 無名クラス
		System.out.println((new Calc() {
			@Override
			public int calc(int x) {
				return x * x;
			}
		}).calc(2));
		
		// ラムダ式
//		System.out.println(
//				(int x) -> {
//					return x * x;
//				}).calc(2));
//		
//		System.out.println((x -> x*x).calc(2));
		
		
		
		System.out.println("-----");
		
		
		
		// IntFunction
		// ローカルクラス
		class LocalIntFunction implements IntFunction<Integer> {
			@Override
			public Integer apply(int x) {
				return x * x;
			}
		}
		LocalIntFunction f1 = new LocalIntFunction();
		System.out.println(f1.apply(2));
		
		// 無名クラス
		IntFunction<Integer> f2 = new IntFunction<>() {
			@Override
			public Integer apply(int x) {
				return x * x;
			}
		};
		System.out.println(f2.apply(2));
		
		// ラムダ式
		IntFunction<Integer> f3 = (int x) -> {
			return x * x;
		};
		System.out.println(f3.apply(2));
		
		// ラムダ式の省略形
		IntFunction<Integer> f31 = (int x) -> {return x * x;};
		IntFunction<Integer> f32 = (x) -> {return x * x;};
		IntFunction<Integer> f33 = x -> {return x * x;};
		IntFunction<Integer> f34 = x -> x * x;
		System.out.println(f31.apply(2));
		System.out.println(f32.apply(2));
		System.out.println(f33.apply(2));
		System.out.println(f34.apply(2));
		
	}

}
