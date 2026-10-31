package mondai;

@FunctionalInterface
public interface Printer {
	
	public abstract void print(int[][] arr);
	
}


// 抽象メソッド1つしか含まないインターフェースなので、関数型インターフェース
