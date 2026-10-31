//2025/04/26
package test;

abstract class Figure {
	abstract void area();
	abstract void around();
	
	void measure() {
		area();
		around();
		System.out.println();
	}
}

class Square extends Figure {
	double side;
	double height;
	
	Square(double side) {
		this.side = this.height = side;
	}
	Square(double side, double height) {
		this.side = side;
		this.height = height;
	}
	void area() {
		System.out.println("四角形の面積：" + (side * height));
	}
	void around() {
		System.out.println("四角形の外周：" + (2 * (side + height)));
	}
}

class Circle extends Figure {
	final double pi = 3.14;
	double radius;
	
	Circle(double radius) {
		this.radius = radius;
	}
	void area() {
		System.out.println("円の面積：" + (radius * radius * pi));
	}
	void around() {
		System.out.println("円の外周：" + (2 * radius * pi));
	}
}

public class SizeFigure {
	public static void main(String[] args) {
		Figure f1 = new Square(2.5);
		Figure f2 = new Square(2.3, 3.7);
		Figure f3 = new Circle(3.6);
		
		f1.measure();
		f2.measure();
		f3.measure();
		
		System.out.println();
		System.out.println();
		
		Figure[] fs = {new Square(2.5), new Square(2.3, 3.7), new Circle(3.6)};
		for (Figure f : fs) {
			f.measure();
		}
	}
}
