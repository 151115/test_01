package AdvanedJava;

public class AdderThread  extends Sum implements Runnable {

	private int start , end;
	
	public AdderThread(int s, int e) {
		this.start = s;
		this.end = e;
	}

	@Override
	public void run() {
		
		for (int i= start ; i <=end ; i++) {
			addNum(i);
		}
		
	}
	

	
}
