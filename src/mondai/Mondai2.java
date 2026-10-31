package mondai;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mondai2 {
	public static void main(String[] args) {
		
		Car carA = new Car(1, "11-11", "■");
		Car carB = new Car2fold(2, "22-22", "□");
		Car carC = new Car3fold(3, "33-33", "▲");
		Car carD = new Car4fold(4, "44-44", "◆");
		Car carE = new CarReverse(5, "55-55", "★");
		
//		carA.info();
//		carB.info();
//		carC.info();
//		carD.info();
//		carE.info();
		
//		System.out.println(Car.currentCount());
		Car.showXAxis();
		carA.showMe();
		carA.move(5);
		carA.showMe();
		carA.move(-2);
		carA.showMe();
		
		List<Car> cars = new ArrayList<>();
		cars.add(carA);
		cars.add(carB);
		cars.add(carC);
		cars.add(carD);
		cars.add(carE);
//		System.out.println(cars);
		
		Car.showXAxis();
		for (Car car : cars) {
			car.setX(10);
		}
		Car.showAll(cars);
		
		System.out.println();
		
		Car.showXAxis();
		for (Car car : cars) {
			car.move(3);
		}
		Car.showAll(cars);
		
		carA.setX(20);
		Car.showXAxis();
		for (int i = 0; i < 50; i++) {
			carA.randomMove();
			carA.showMe();
		}
		
		carB.setX(20);
		Car.showXAxis();
		for (int i = 0; i < 50; i++) {
			carB.randomMove();
			carB.showMe();
		}
		
	}

}


class Car {
	// 定数
	public static final int MAX = 50;		// 最大値
	public static final int MIN = 0;		// 最小値
	public static final int X0 = 0;		// 初期値
	
	// インスタンス変数
	protected int id;
	protected String no;		// ナンバープレート
	protected String icon;		// アイコン
	protected int x = X0;		// X座標
	
	// クラス変数
	private static int count;	// 台数
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	// コンストラクタ
	Car(int id, String no, String icon) {
		this.id = id;
		this.no = no;
		this.icon = icon;
		count++;
	}
	
	// インスタンスメソッド
	void info() {
		System.out.println("id: " + id);
		System.out.println("no: " + no);
		System.out.println("icon: " + icon);
		System.out.println("x: " + x);
	}
	
//	void moveForward(int dx) {
//		if (dx > 0) {
//			this.x += dx;
//		}
//		if (x > MAX) {
//			x = MAX;
//		}
//	}
//	
//	void moveBackward(int dx) {
//		if (dx > 0) {
//			this.x -= dx;
//		}
//		if (x < MIN) {
//			x = MIN;
//		}
//	}
	
	void move(int dx) {
		this.x += dx;
		if (x > MAX) {
			x = MAX;
		} else if (x < MIN) {
			x = MIN;
		}
	}
	
	void randomMove() {
		Random rnd = new Random();
		int dx = rnd.nextInt(11) - 5;
//		System.out.println(dx);
		move(dx);
	}
	
	void showMe() {
//		showXAxis();
		showCar(this.no, this.icon, this.x);
//		System.out.println();
	}
	
	static void showCar(String no, String icon, int x) {
		System.out.print(no + ":");
		for (int i = MIN; i <= x - 1; i++) {
			System.out.print("  ");
		}
		System.out.println(icon);
	}
	
	static void showXAxis() {
		System.out.print("no    ");
		for (int i = MIN; i <= MAX; i++) {
			if (0 <= i && i <= 9) {
				System.out.print(i + " ");
			} else {
				System.out.print(i);
			}
		}
		System.out.print("  X");
		System.out.println();
		System.out.print("--------");
		for (int i = MIN; i <= MAX; i++) {
			System.out.print("--");
		}
		System.out.println(">");
	}
	
	// クラスメソッド
	static int currentCount() {
		return count;
	}
	
	static void showAll(List<Car> cars) {
//		showXAxis();
		for (Car car : cars) {
			showCar(car.no, car.icon, car.x);
		}
//		System.out.println();
	}
	
}

class Car2fold extends Car {
	// コンストラクタ
	Car2fold(int id, String no, String icon) {
		super(id, no, icon);
	}
	
	@Override
	void move(int dx) {
		super.move(dx * 2);
	}
}

class Car3fold extends Car {
	// コンストラクタ
	Car3fold(int id, String no, String icon) {
		super(id, no, icon);
	}
	
	@Override
	void move(int dx) {
		super.move(dx * 3);
	}
}

class Car4fold extends Car {
	// コンストラクタ
	Car4fold(int id, String no, String icon) {
		super(id, no, icon);
	}
	
	@Override
	void move(int dx) {
		super.move(dx * 4);
	}
}

class CarReverse extends Car {
	// コンストラクタ
	CarReverse(int id, String no, String icon) {
		super(id, no, icon);
	}
	
	@Override
	void move(int dx) {
		super.move(-dx);
	}
}


