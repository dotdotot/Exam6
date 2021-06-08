package S;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Java210527_2 {
	public static void main(String args[]) {
		byte b[] = new byte[6]; // 비어 있는 byte 배열
		try {
			int n = 0, c;
			FileInputStream file = new FileInputStream("C:\\Users\\PCU\\Desktop\\hello.txt");
			while ((c = file.read()) != -1) {
				b[n] = (byte) c;
				n++;
			}
			System.out.println("파일에서 읽은 배열을 출력합니다.");
			for (int i = 0; i < b.length; i++) {
				System.out.println(b[i] + " ");
			}
		} catch (IOException i) {

		}
	}
}
