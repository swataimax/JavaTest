package lambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/*
 * 2025/09/23
 * 2026/06/07
 * インスタンスメソッド参照（オブジェクトが指定できる場合）
 * 
 */
public class TestInstanceMethod1 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		// ラムダ式
		Consumer<String> c1 = text -> list.add(text);
		c1.accept("abc");
		
		// インスタンスメソッド参照
		Consumer<String> c2 = list::add;
		c2.accept("def");
		
		// 無名クラス
		Consumer<String> c3 = new Consumer<String>() {
			@Override
			public void accept(String text) {
				list.add(text);
			}
		};
		c3.accept("ghi");
		
		// ローカルクラス
		class LocalConsumer implements Consumer<String> {
			@Override
			public void accept(String text) {
				list.add(text);
			}
		};
		LocalConsumer c4 = new LocalConsumer();
		c4.accept("klm");
		
		System.out.println(list);
		

	}

}
