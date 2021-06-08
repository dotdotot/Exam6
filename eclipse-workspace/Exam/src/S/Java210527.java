package S;

import java.io.FileOutputStream;
import java.io.IOException;

public class Java210527 {
	public static void main(String args[]) {
		byte b[] = { 7, 51, 3, 4, -1, 24 };

		try {
			FileOutputStream fout = new FileOutputStream("C:\\Users\\PCU\\Desktop\\hello.txt");
			for (int i = 0; i < b.length; i++) {
				fout.write(b);
			}
			fout.close();
		} catch (IOException i) {
			System.out.println("ÀúÀå");
		}
	}	
}
