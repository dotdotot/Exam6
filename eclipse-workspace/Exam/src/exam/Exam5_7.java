package exam;

abstract class Calculator { // 추상 클래스 Calculator 선언
	public abstract int add(int a, int b); // 두 정수의 합을 리턴하는 멤버 메소드

	public abstract int subtract(int a, int b); // 두 정수의 차를 리턴하는 멤버 메소드

	public abstract double average(int[] a); // 정수 배열의 평균을 리턴하는 멤버 메소드
}

class GoodCale extends Calculator { // 추상 클래스 Calculator를 상속받아 구현하는 GoodCale 클래스
	public int add(int a, int b) { // 수퍼 클래스에 정의된 add 메소드를 구현함
		return a + b; // 두 정수의 합을 리턴
	}

	public int subtract(int a, int b) { // 수퍼 클래스에 정의된 subtract 메소드를 구현함
		return a - b;
	}

	public double average(int[] a) { // 수퍼 클래스에 정의된 average 메소드를 구현함
		double sum = 0; // 실수형 변수 sum 생성과 동시에 0으로 초기화
		for (int i = 0; i < a.length; i++) { // 배열의 길이만큼 반복하는 반복문
			sum += a[i]; // 정수형 배열 a의 index i번째 값을 sum에 더함
		}
		return sum / a.length; // 정수형 배열 a에 값들의 총합인 실수형 변수 sum을 정수형 배열 a의 길이로 나눠 평균을 리턴
	}
}

public class Exam5_7 {
	public static void main(String[] args) {
		GoodCale c = new GoodCale(); // GoodCale 클래스 레퍼런스 선언과 동시에 인스턴스 생성
		System.out.println(c.add(2, 3)); // 2 + 3을 출력
		System.out.println(c.subtract(2, 3)); // 2 - 3을 출력
		System.out.println(c.average(new int[] { 2, 3, 4 })); // (2 + 3 + 4) / 3을 출력
	}
}
