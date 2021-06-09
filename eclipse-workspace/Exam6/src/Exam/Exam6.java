package Exam;

import java.util.Scanner;

// 컴퓨터와 가위바위보

public class Exam6 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("가위(1), 바위(2), 보(3), 끝내기(4)>>");
			int num = scan.nextInt();
			int computerNum = (int) (Math.random() * 3) + 1;
			if (num == 1) {
				if (computerNum == 1) {
					System.out.println("비겼습니다..");
				} else if (computerNum == 2) {
					System.out.println("졌습니다..");
				} else if (computerNum == 3) {
					System.out.println("이겼습니다..");
				}
			} else if (num == 2) {
				if (computerNum == 1) {
					System.out.println("이겼습니다..");
				} else if (computerNum == 2) {
					System.out.println("비겼습니다..");
				} else if (computerNum == 3) {
					System.out.println("졌습니다..");
				}
			} else if (num == 3) {
				if (computerNum == 1) {
					System.out.println("졌습니다..");
				} else if (computerNum == 2) {
					System.out.println("이겼습니다..");
				} else if (computerNum == 3) {
					System.out.println("비겼습니다..");
				}
			} else if (num == 4) {
				System.out.println("게임을 종료합니다..");
				break;
			}
		}
	}
}
