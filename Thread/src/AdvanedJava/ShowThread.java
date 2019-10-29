package AdvanedJava;

public class ShowThread extends Thread {

	private String name;
	
	public ShowThread(String name) {
		this.name= name;
	}

	public void run() {
		
		for(int i=1; i<=40 ; i++) {
			System.out.print(name + " ");
			if (i%10==0)  System.out.println();
			try {
				sleep(100);
				// sleep함수에 예외처리 해주기
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}

}
