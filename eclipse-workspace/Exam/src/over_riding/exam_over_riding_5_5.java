package over_riding;

class Shape { // 도형의 수퍼 클래스
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape {
	public void draw() { // 메소드 오버라이딩
		System.out.println("Line");
	}
}

class Circle extends Shape {
	public void draw() {
		System.out.println("Circle");
	}
}

class Rect extends Shape {
	public void draw() {
		System.out.println("Rect");
	}
}

public class exam_over_riding_5_5 {
	// Shape p = line;
	static void paint(Shape p) { // shape을 상속받은 객체들이 매개 변수로 넘어올 수 있음
		p.draw();// p가 가리키는 객체에 오버라이딩된 darw() 호출
		// 동적 바인딩
	}

	public static void main(String[] args) {
		Line line = new Line();
		paint(line); // line의 draw()실행 "Line"출력
		
		paint(new Shape()); // Shape의 draw()실행 , "Shape"출력
		paint(new Line()); // 오버라이딩된 메소드 Line의 draw()실행
		paint(new Circle());// 오버라이딩된 메소드 Circle의 draw()실행
		paint(new Rect());// 오버라이딩된 메소드 Rect의 draw()실행
	}
}
