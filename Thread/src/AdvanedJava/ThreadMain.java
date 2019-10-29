package AdvanedJava;

public class ThreadMain {
	public static void main(String[] args) {
		
		
//		extendsThread();
//		runnableThread();
//		synchronizedThread();
		
		
		
		
	}

	private static void synchronizedThread() {
		Increment inc = new Increment();
		IncThread it1 = new IncThread(inc);
		IncThread it2 = new IncThread(inc);
		
		it1.start();
		it2.start();

		try {
			it1.join();
			it2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("1~ 까지 합 : " + inc.getNum());
		// 동시성 오류를 풀기 위하여 public synchronized void increment() 로 변경 
	
	//
	}

	private static void runnableThread() {
		AdderThread at1 = new AdderThread(1, 50);
		AdderThread at2 = new AdderThread(51, 100);
		
		Thread tr1 = new Thread(at1); 	// Runnable 을 돌릴 얘는 넣어주면 됨
		Thread tr2 = new Thread(at2); 
	
		tr1.start();
		tr2.start();
		
		try {
			tr1.join();
			tr2.join();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("1-100 합 > " + ( at1.getNum()+at2.getNum() ) );
		//그냥 이렇게 하면 시간차때문에 다른거 실행 끝나기 전에 메인이 끝난다(= 출력 이 끝난다 ) 
		// 이를 방지하기 위하여 join() 을 써준다
		
		//book - 695p 스레드상속
		// 705p 스레드 생명주기
	}

	private static void extendsThread() {
		ShowThread st1 = new ShowThread("엑시트");
		ShowThread st2 = new ShowThread("나랏말싸미");
		
//		st1.run();
		st1.start();
//		st2.run();
		st2.start();
	}
}

