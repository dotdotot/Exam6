package exam;

class Weapon { // Weapon 클래스 생성
	protected int fire() { // 정수를 반환하는 메소드 생성
		return 1; // 무기는 기본적으로 1명을 살상함
	}
}

class Cannon extends Weapon { // Weapon 클래스를 상속받는 Cannon 클래스 생성
	protected int fire() { // 수퍼 클래스에 정의된 fire() 함수를 오버라이딩해서 재정의
		return 10; // 대포는 한 번에 10명을 살상
	}
}

public class Exam5_6 {
	public static void main(String[] args) {
		Weapon weapon; // Weapon 클래스의 레퍼런스 선언
		weapon = new Weapon(); // Weapon 클래스의 인스턴스 생성
		System.out.println("기본 무기의 살상 능력은 " + weapon.fire());
		weapon = new Cannon(); // Weapon 클래스를 상속 받은 Cannon 클래스의 인스턴스 생성
		System.out.println("대포의 살상 능력은 " + weapon.fire());
	}
}
