package IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferMain {

	public static void main(String[] args) throws IOException {

		//팀장님
		InputStream in = new FileInputStream("c:\\tmp\\org.txt");
		OutputStream out = new FileOutputStream("c:\\tmp\\cpy.txt");
		String src = "c:\\tmp\\org.dll";
		String des = "c:\\tmp\\cpy.dll";
		
//		slowCopy(src, des);
		fastCopy(src, des);


	}
	private static void fastCopy(String src, String des) throws FileNotFoundException, IOException {
		
		InputStream in = new FileInputStream(src);
		OutputStream out = new FileOutputStream(des);
		
		int copyByte = 0;
		int bData;
		int readLen;
		byte buf[] = new byte[1024];
		
		while(true) {
			
			readLen = in.read(buf);
			if (readLen==-1)
				break;
			out.write(buf,0, readLen);
			copyByte+=readLen;
			
		}
		
		in.close();
		out.close();
		System.out.println("복사된 바이트 크기 " + copyByte);
	}

	private static void slowCopy(String src, String des) throws FileNotFoundException, IOException {
		InputStream i = new FileInputStream(src);
		OutputStream o = new FileOutputStream(des);
		
//		//빨리 하는 법
		BufferedInputStream in = new BufferedInputStream(i);
		BufferedOutputStream out = new BufferedOutputStream(o);
		
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

}
