import static org.junit.Assert.*;

import org.junit.Test;

public class MUR_test {

	@Test
	public void test() {
		assertEquals("Joel", mul(3));
		assertEquals("Sarah", mul(5));
		assertEquals("Joel Sarah", mul(15));
		
	}

	public String mul(int num) {

//		if (num%3==0) return "Joel";
//		if (num%5==0) return "Sarah";
//		if (num%15==0) return "Joel Sarah";
//		
//		
//		return null;
		
		
		String str=null;
		
		if (num%3==0 && num%5==0) {
			str="Joel Sarah";
		}
		else if(num%3==0) {
			str="Joel";
		}
		else if (num%5==0) {
			str="Sarah";
		}
		else {
			str=null;
		}
		
		return str;
		
	}
	
	
	
	
	
}
