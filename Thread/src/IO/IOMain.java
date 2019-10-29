package IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOMain {
	public static void main(String[] args) throws IOException {

		// ����
//		String src = "c:\\tmp\\ex01.xlsx";
//		String des = "c:\\tmp\\cpy.xlsx";
//		
//		fastCopy(src, des);
		
		
//		//�����
//		InputStream in = new FileInputStream("c:\\tmp\\org.txt");
//		OutputStream out = new FileOutputStream("c:\\tmp\\cpy.txt");
//		String src = "c:\\tmp\\org.dll";
//		String des = "c:\\tmp\\cpy.dll";
//		
//		slowCopy(src, des);
//		fastCopy(src, des);

		
		String filepath = "c:\\tmp\\hello.txt";
		BufferedWriter b_out = new BufferedWriter(new FileWriter(filepath));
		b_out.write("���մ� ���� ");
		b_out.newLine();
		b_out.write("���� �߰��ÿ���  BufferedWriter ��  ��ü.print �̿�");
		b_out.close();
		
		
		BufferedReader b_in = new BufferedReader( new FileReader(filepath));
		StringBuilder sb = new StringBuilder();
		String str = "";
		
		
		while(true) {
			str = b_in.readLine();
			if (str == null) break;
			
			sb.append(str);
			sb.append("\r\n");
		}

	}
	public static void fastCopy(String src, String des) throws FileNotFoundException, IOException {
		InputStream in = new FileInputStream(src);
		OutputStream out = new FileOutputStream(des);
		
		int copyByte = 0;
		int bData;
		in.close();
		out.close();
		System.out.println("����� ����Ʈ ũ�� " + copyByte);
	}

	public static void slowCopy(String src, String des) throws FileNotFoundException, IOException {
		InputStream in = new FileInputStream(src);
		OutputStream out = new FileOutputStream(des);
		
		int copyByte = 0;
		int bData;
		
		while(true) {
			bData = in.read();
			if (bData == -1)
				break;
			out.write(bData);
			copyByte++;
		}
		in.close();
		out.close();
		System.out.println("����� ����Ʈ ũ�� " + copyByte);
	}

//	��
//	
//	private static void fastCopy(String src, String des) throws FileNotFoundException, IOException {
//		InputStream in = new FileInputStream(src);
//		// ������ ���� �� �� �־ Ʈ����ĳġ or IOE��¼�� ��ӹ޴´�
//		OutputStream out = new FileOutputStream(des);
//
//		int copyByte = 0;
//		int bData;
//
//		while (true) {
//
//			bData = in.read();
//			if (bData == -1)
//				break;
//			out.write(bData);
//			copyByte++;
//
//		}
//		in.close();
//		out.close();
//
//		System.out.println("����� : " + copyByte);
//	}
}
