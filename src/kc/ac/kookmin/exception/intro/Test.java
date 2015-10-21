package kc.ac.kookmin.exception.intro;

import java.io.*;
import java.util.Scanner;

class AAA {
	public void readFile() {
		String path = AAA.class.getResource("").getPath();//���ϰ�ιޱ�
		String fname = path + "a.text";

		File f;

		try {
			// ���� ��ü ����
			f = new File(fname);

//			 //���Ͼ���
//			 FileWriter fileWriter = new FileWriter(f.toString(), true); //�̾��
//			 BufferedWriter writer = new BufferedWriter(fileWriter);
//			
//			 Scanner sc = new Scanner(System.in);
//			 String str;
//			
//			 System.out.print("a.text�� �߰��� �� �����: ");
//			 str = sc.next();
//			
//			 writer.newLine();
//			 writer.write(str);
//			 writer.close();

			// �����б�
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
