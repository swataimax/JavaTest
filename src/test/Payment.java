//205/04/26
//伝票を作る
package test;

class Drink {
	String name;
	int price;
	int count;
	
	Drink(String name, int price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
	}
	
	int getTotalPrice() {
		return count * price;
	}
	
	static void printTitle() {
		System.out.println("商品名\t\t単価\t数量\t金額");
	}
	
	void printData() {
		System.out.println(name + "\t" + price + "\t\t" + count + "\t\t" + getTotalPrice());
	}
}

class Alcohol extends Drink {
	float alcper; // アルコール度数
	Alcohol(String name, int price, int count, float alcper) {
		super(name, price, count);
		this.alcper = alcper;
	}
	
	static void printTitle() {
		System.out.println("商品名[度数%]\t単価\t数量\t金額");
	}
	
	void printData() {
		System.out.println(name + "(" + alcper + ")\t" + price + "\t\t" + count + "\t\t" + getTotalPrice());
	}
		
}

public class Payment {
	public static void main(String[] args) {
		Drink coffee = new Drink("コーヒー", 200, 3);
		Drink oolongtea = new Drink("ウーロン茶", 150, 2);
		Alcohol wine = new Alcohol("ワイン", 300, 2, 15.0f);
		
		Drink.printTitle();
		coffee.printData();
		oolongtea.printData();
		System.out.println();
		
		Alcohol.printTitle();
		wine.printData();
		
		int sum = coffee.getTotalPrice()
				+ oolongtea.getTotalPrice() + wine.getTotalPrice();
		System.out.println("\n***合計金額" + sum + "円***");
		
		
		
		System.out.println();
		System.out.println();
		
		Drink[] drinks = new Drink[3];
		drinks[0] = new Drink("コーヒー", 200, 3);
		drinks[1] = new Drink("ウーロン茶", 150, 2);
		drinks[2] = new Alcohol("ワイン", 300, 2, 15.0f);
		
		sum = 0;
		for (Drink d : drinks) {
			d.printData();
			sum += d.getTotalPrice();
		}
		System.out.println(sum);
		
		
		
		System.out.println();
		System.out.println();
		
		Drink[] ds = {new Drink("co", 200, 3), new Drink("oo", 150, 2), new Alcohol("wi", 300, 2, 15.0f)};
		sum = 0;
		for (Drink d : ds) {
			d.printData();
			sum += d.getTotalPrice();
		}
		System.out.println(sum);
		
	}
	

}
