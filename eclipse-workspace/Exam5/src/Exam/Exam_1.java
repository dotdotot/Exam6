package Exam;

class Circle {
	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}
}

class NamedCircle extends Circle {
	private String circleName;

	public NamedCircle(int radius, String name) {
		super(radius);
		circleName = name;
	}
	public void show() {
		System.out.println(circleName + ", ¹ÝÁö¸§ = " + getRadius());
	}
}

public class Exam_1 {
	public static void main(String args[]) {
		NamedCircle w = new NamedCircle(5, "waffle");
		w.show();
	}
}
