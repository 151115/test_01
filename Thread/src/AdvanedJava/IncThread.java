package AdvanedJava;

public class IncThread extends Thread {
	
	Increment inc;
	
	public IncThread(Increment inc) {
		this.inc = inc;
	}
	
	public void run() {
		for (int i = 0 ; i < 100 ; i++) {		
			for (int k =0 ; k<100 ; k++) 
				inc.increment();
			
		}
	}

}
