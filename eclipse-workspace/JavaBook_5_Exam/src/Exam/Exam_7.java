package Exam;

interface Shapee {
	final double PI = 3.14;

	void draw();

	double getArea();

	default public void redraw() {
		System.out.println("--- 다시 그립니다 ---");
		draw();
	}
}

class Circlee implements Shapee {
	private int radius;

	public Circlee(int radius) {
		this.radius = radius;
	}

	public void draw() {
		System.out.println("반지름 " + radius + " ");
	}

	public double getArea() {
		return PI * radius * radius;
	}
}

public class Exam_7 {
	public static void main(String args[]) {
		Shapee coin = new Circlee(10); // 반지름이 10인 코인 생성
		coin.redraw();
		System.out.println("코인의 면적은 " + coin.getArea());
	}
}
