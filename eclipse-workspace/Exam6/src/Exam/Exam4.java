package Exam;

import java.util.Scanner;
import java.util.StringTokenizer;

// 1 + 2 + 3 + 4 처럼 더하는 문자열을 입력받고 
// 해당 문자열을 +를 기준으로 자르고 정수형으로 변환하여 총합 출력

public class Exam4 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		String text = scan.nextLine(); //문자열을 줄바꿈이 나올때까지 입력받아 text에 저장
		StringTokenizer s = new StringTokenizer(text, "+"); // text를 + 를 기준으로 잘라 s에 저장
		while (s.hasMoreTokens()) {// 토큰이 없으면 종료
			String stringNum = s.nextToken(); // +를 기준으로 자른 토큰을 stringNum에 저장 (토큰은 제일 앞에있는 것을 꺼내옴)
			stringNum = stringNum.trim(); // 앞 뒤 문자열 공백을 자름
			int num = Integer.parseInt(stringNum); // 저장된 문자열을 정수로 변환하여 num에 저장
			sum += num; 
		}

		System.out.println("총합 : " + sum);
	}
}
