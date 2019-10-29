package AdvanedJava;

public class Increment {
	int num= 0;
	public synchronized void increment() {
		num++;
	}
	// synchronized 싸우기 말라고 , 오류나지말라고 걸어주는 것 
	
	
	public int getNum() {
		return num ;
	}
}
