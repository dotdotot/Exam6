package Exam;

// 랜덤 정수 1~3을 3번 입력받아 모두 같으면 성공 출력 후 종료

public class Exam3 {
	public static void main(String args[]) {
		while (true) {
			// 랜덤 정수 1~3을 입력받고 문자열로 변환
			String a = Integer.toString((int) (Math.random() * 3 + 1));
			String b = Integer.toString((int) (Math.random() * 3 + 1));
			String c = Integer.toString((int) (Math.random() * 3 + 1));

			System.out.println(a + '\t' + b + '\t' + c);
			if (a.equals(b) && b.equals(c)) {
				System.out.println("성공!");
				break;
			}
		}
	}
}
