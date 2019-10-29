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

		// 내가
//		String src = "c:\\tmp\\ex01.xlsx";
//		String des = "c:\\tmp\\cpy.xlsx";
//		
//		fastCopy(src, des);
		
		
//		//팀장님
//		InputStream in = new FileInputStream("c:\\tmp\\org.txt");
//		OutputStream out = new FileOutputStream("c:\\tmp\\cpy.txt");
//		String src = "c:\\tmp\\org.dll";
//		String des = "c:\\tmp\\cpy.dll";
//		
//		slowCopy(src, des);
//		fastCopy(src, des);

		
		String filepath = "c:\\tmp\\hello.txt";
		BufferedWriter b_out = new BufferedWriter(new FileWriter(filepath));
		b_out.write("새롱누 파일 ");
		b_out.newLine();
		b_out.write("내용 추가시에는  BufferedWriter 의  객체.print 이용");
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
		System.out.println("복사된 바이트 크기 " + copyByte);
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
		System.out.println("복사된 바이트 크기 " + copyByte);
	}

//	내
//	
//	private static void fastCopy(String src, String des) throws FileNotFoundException, IOException {
//		InputStream in = new FileInputStream(src);
//		// 파일이 없을 수 도 있어서 트라이캐치 or IOE어쩌고 상속받는다
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
//		System.out.println("복사된 : " + copyByte);
//	}
}
