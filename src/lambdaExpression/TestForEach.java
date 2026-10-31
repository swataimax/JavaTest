package lambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*
 * 2025/09/23
 * 2026/06/07
 * forEachの引数はConsumerインターフェースなので、
 * ラムダ式を引数にできる
 * ということは、無名クラス、ローカルクラスでも書き直せる
 * 
 */
public class TestForEach {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("a", "b", "c");
		
		
		list.forEach(s -> System.out.println(s));
		
		list.forEach(System.out::println);
		
		
		
		System.out.println("-----");
		
		// ラムダ式
		list.forEach(s -> System.out.println(s));
		
		System.out.println("---");
		
		// 無名クラス
		list.forEach(new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.println(s);
			}
		});
		
		System.out.println("---");
		
		// ローカルクラス
		class LocalConsumer implements Consumer<String> {
			@Override
			public void accept(String s) {
				System.out.println(s);
			}
		}
		list.forEach(new LocalConsumer());
		
		System.out.println("---");
		
	}

}


//default void forEach(Consumer<? super T> action) {
//	Objects.requireNonNull(action);
//	for (T t : this) {
//	action.accept(t);
//}



/*
 * 
 * インターフェース名 メソッド名 		説明
 * 
 * Function<T, R> 	R apply(T t) 		引数あり、戻り値あり
 * Consumer<T> 	void accept(T t) 	引数あり、戻り値なし
 * Supplier<T> 	T get() 			引数なし、戻り値あり
 * Predicate<T> 	boolean test(T t) 	引数あり、戻り値boolean
 * Runnable		void run()			引数なし、戻り値なし
 * 
 * 
 */
