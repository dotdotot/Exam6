package Exam;

import java.util.Scanner;
import java.util.StringTokenizer;

// 문자열을 입력받아 해당 문자열의 어절 개수를 출력해주는 문제

public class Exam2 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			String text = scan.nextLine();
			StringTokenizer st = new StringTokenizer(text, " ");

			if (text.equals("exit")) {
				System.out.println("종료합니다..");
				break;
			} else {
				int n = st.countTokens();
				System.out.println("어절 개수는 " + n);
			}
		}

	}
}
