package over_riding;

// 메소드 오버라이딩 확인.
class People {
	int age;
	public void show() {
		System.out.println("저는 People입니다.");
	}
}

class Kim extends People {
	public void show() { // 슈퍼 클래스의 함수를를 서브 클래스에서 새롭게 정의함 , 메소드 오버라이딩
		System.out.println("저는 People을 상속받은 Kim입니다.");
	}
}

public class over_riding {
	public static void main(String[] args) {
		Kim k = new Kim();
		k.show();
		// 실행했을 때 보면 확인할 수 있겠지만 show()라는 메소드가 새롭게 정의되어서 사용됨
		// 수퍼 클래스의 선언된 메소드를, 각 서브 클래스들의 자신만의 내용으로 새롭게 구현이 가능함
		
		// 상속을 통해서 '하나의 인터페이스(같은 이름을 가진 메소드)에 서로 다른 내용 구현'이라는 객체의 다형성 실현
		// Line 클래스에서 draw()는 선을 그리고
		// circle 클래스에서 draw()는 원을 그리고
		// rect 클래스에서 draw()는 사각형을 그림
		
		// 오버로딩과 오버 라이딩의 차이점
		// 오버로딩은 컴파일러가 여러개의 함수중에서 하나를 선택함 
		// 컴파일 하는 단계에서 어느것을 사용할지 이미 결정 , 객체 자체가 프로그램 실행중 new를 통해 객체가 만들어지기 때문에
		// 오버라이딩같은 경우 실행시간의 다형성이 실현됨
	}
}
