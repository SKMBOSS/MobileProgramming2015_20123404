package kc.ac.kookmin.exception.intro;

import java.io.*;
import java.util.Scanner;

class AAA {
	public void readFile() {
		String path = AAA.class.getResource("").getPath();//파일경로받기
		String fname = path + "a.text";

		File f;

		try {
			// 파일 객체 생성
			f = new File(fname);

//			 //파일쓰기
//			 FileWriter fileWriter = new FileWriter(f.toString(), true); //이어쓰기
//			 BufferedWriter writer = new BufferedWriter(fileWriter);
//			
//			 Scanner sc = new Scanner(System.in);
//			 String str;
//			
//			 System.out.print("a.text에 추가할 거 써봐라: ");
//			 str = sc.next();
//			
//			 writer.newLine();
//			 writer.write(str);
//			 writer.close();

			// 파일읽기
			FileReader fileReader = new FileReader(f);
			BufferedReader reader = new BufferedReader(fileReader);

			String line = null;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		} finally {
			close();
		}

	}

	void close() {
		System.out.close();
	}
}

public class Test {
	public static void main(String[] args) {
		AAA a = new AAA();
		a.readFile();
	}

}
