package S;

import java.io.*;

public class Java210527_3 {
	public static void main(String args[]) {
		File src = new File("C:\\Users\\PCU\\Desktop\\hello.txt");
		File dest = new File("C:\\Users\\PCU\\Desktop\\hello1.txt");
		int c;
		try {
			FileReader fr = new FileReader("src");
			FileWriter fw = new FileWriter("dest");
			while ((c = fr.read()) != -1) {
				fw.write((char) c);	
			}
			fr.close();
			fw.close();
			System.out.println("복사");
		} catch (IOException i) {
			System.out.println("파일 복사 오류");
		}
	}
}
