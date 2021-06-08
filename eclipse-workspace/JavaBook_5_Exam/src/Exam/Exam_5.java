package Exam;

import java.util.Scanner;

interface StackInterface {
	int length(); // 스택에 들어있는 문자열 개수 리턴

	String pop(); // 스택의 톱에 있는 문자열 팝

	boolean push(String ob); // 스탹의 톱에 문자열 ob 푸시 삽입
}

class Stack implements StackInterface {
	private String[] stack = new String[5];
	private int top = 0;

	public int length() {
		return top;
	}

	public String pop() {
		top -= 1;
		return stack[top];
	}

	public boolean push(String ob) {
		if (top == 5) {
			return false;
		} else {
			stack[top] = ob;
			top += 1;
			return true;
		}
	}

}

public class Exam_5 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		Stack stack = new Stack();

		System.out.print(">>");
		for (int i = 0; i < 5; i++) {
			String text = scan.next();
			stack.push(text);
		}

		for (int i = 0; i < 5; i++) {
			String text = stack.pop();
			System.out.print(text + " ");
		}
	}
}
