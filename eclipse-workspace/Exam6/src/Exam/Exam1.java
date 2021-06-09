package Exam;

class MyPoint {
	private int a, b;

	public MyPoint(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public String toString() {
		return getClass().getName() + "(" + a + "," + b + ")";
	}
}

public class Exam1 {
	public static void main(String args[]) {
		MyPoint a = new MyPoint(3, 20);
		System.out.println(a);
	}
}
