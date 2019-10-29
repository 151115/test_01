package IO;
import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

public class CopyTimeTest {

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}

	@Test
	public void testFast() {
		String src = "c:\\tmp\\org.dll";
		String des = "c:\\tmp\\cpy.dll";
		
		try {
			IOMain.fastCopy(src, des);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Test
	public void testSlow() {

		String src = "c:\\tmp\\org.dll";
		String des = "c:\\tmp\\cpy.dll";
		
		try {
			IOMain.slowCopy(src, des);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
}
