package lambdaExpression;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

/*
 * 2025/09/23
 * 2026/06/07
 * クラスメソッド参照
 * 
 */
public class TestClassMethod {

	public static void main(String[] args) {
		
		// ラムダ式
		Consumer<String> con1 = text -> MyPrint.print(text);
		con1.accept("text1");
		
		// クラスメソッド参照
		Consumer<String> con2 = MyPrint::print;
		con2.accept("text2");
		
		// 無名クラス
		Consumer<String> con3 = new Consumer<>() {
			@Override
			public void accept(String text) {
				MyPrint.print(text);
			}
		};
		con3.accept("text3");
		
		// ローカルクラス
		class LocalConsumer implements Consumer<String> {
			@Override
			public void accept(String text) {
				MyPrint.print(text);
			}
		};
		LocalConsumer con4 = new LocalConsumer();
		con4.accept("text3");
		
		
		// ラムダ式
		BiConsumer<String, String> bicon1 = (a, b) -> MyPrint2.print(a, b);
		bicon1.accept("text11", "text12");
		
		// クラスメソッド参照
		BiConsumer<String, String> bicon2 = MyPrint2::print;
		bicon2.accept("text21", "text22");
		
		// 無名クラス
		BiConsumer<String, String> bicon3 = new BiConsumer<>() {
			@Override
			public void accept(String a, String b) {
				MyPrint2.print(a, b);
			}
		};
		bicon3.accept("text31", "text32");
		
		// ローカルクラス
		class LocalBiConsumer implements BiConsumer<String, String> {
			@Override
			public void accept(String a, String b) {
				MyPrint2.print(a, b);
			}
		};
		LocalBiConsumer bicon4 = new LocalBiConsumer();
		bicon4.accept("text41", "text42");
		
	}

}

class MyPrint {
	public static void print(String text) {
		System.out.println(text);
	}
}

class MyPrint2 {
	public static void print(String a, String b) {
		System.out.println(a + "-" + b);
	}
}
