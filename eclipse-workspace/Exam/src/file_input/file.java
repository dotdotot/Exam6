package file_input;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class file {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		// 문자 읽기
		FileInputStream file = null;
		InputStreamReader in = null;
		try {
			file = new FileInputStream("C:\\Users\\PCU\\Desktop\\hello.txt");
			in = new InputStreamReader(file, "UTF-8");
			int c;
			while ((c = in.read()) != -1) {
				System.out.print((char) c);
			}
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}

		// 문자 쓰기
		FileWriter fout = null;
		try {
			fout = new FileWriter("C:\\Users\\PCU\\Desktop\\hello.txt");
			while (true) {
				String text = scan.nextLine();
				if (text.length() == 0)
					break;
				fout.write(text, 0, text.length());
				fout.write("\r\n", 0, 2);
			}
			fout.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}
}
