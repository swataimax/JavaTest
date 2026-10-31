package lambdaExpression;

import java.util.function.Function;

/*
 * 2025/09/23
 * 2026/06/07
 * インスタンスメソッド参照（オブジェクトが指定できない場合）
 * 
 */
public class TestInstanceMethod2 {
public static void main(String[] args) {
		
		// ラムダ式
		Function<String, String> f1 = text -> text.trim();
		System.out.println(f1.apply(" abc "));
		
		// インスタンスメソッド参照
		Function<String, String> f2 = String::trim;
		System.out.println(f2.apply(" abc "));
		
		// 無名クラス
		Function<String, String> f3 = new Function<String, String>() {
			@Override
			public String apply(String text) {
				return text.trim();
			}
		};
		System.out.println(f3.apply(" abc "));
		
		// ローカルクラス
		class LocalFunction implements Function<String, String> {
			@Override
			public String apply(String text) {
				return text.trim();
			}
		}
		LocalFunction f4 = new LocalFunction();
		System.out.println(f4.apply(" abc "));
		
		
	}
}
