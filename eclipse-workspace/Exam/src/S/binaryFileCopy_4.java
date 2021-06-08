package S;

import java.io.*;

public class binaryFileCopy_4 {
	public static void main(String args[]) {
		File src = new File("C:\\Users\\PCU\\Desktop\\copy.jpg");
		File dest = new File("C:\\Users\\PCU\\Desktop\\copy1.jpg");
		int c;
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			while ((c = fi.read()) != -1)
				fo.write((byte) c);
			fi.close();
			fo.close();
			System.out.println("복사 완료");
		} catch (IOException i) {
			System.out.println("바이너리 파일 복사 오류");
		}
	}
}
