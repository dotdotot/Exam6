package Exam;

interface AdderInterFace {
	int add(int x, int y); // return x + y

	int add(int n); // 1부터 n까지 합 리턴
}

class MyAdder implements AdderInterFace {
	public int add(int x, int y) {
		return x + y;
	}

	public int add(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}
}

public class Exam_2 {
	public static void main(String args[]) {
		MyAdder adder = new MyAdder();
		System.out.println(adder.add(5, 10));
		System.out.println(adder.add(10));
	}
}
