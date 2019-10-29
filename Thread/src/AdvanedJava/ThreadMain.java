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
		
		System.out.println("1~ ���� �� : " + inc.getNum());
		// ���ü� ������ Ǯ�� ���Ͽ� public synchronized void increment() �� ���� 
	
	//
	}

	private static void runnableThread() {
		AdderThread at1 = new AdderThread(1, 50);
		AdderThread at2 = new AdderThread(51, 100);
		
		Thread tr1 = new Thread(at1); 	// Runnable �� ���� ��� �־��ָ� ��
		Thread tr2 = new Thread(at2); 
	
		tr1.start();
		tr2.start();
		
		try {
			tr1.join();
			tr2.join();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("1-100 �� > " + ( at1.getNum()+at2.getNum() ) );
		//�׳� �̷��� �ϸ� �ð��������� �ٸ��� ���� ������ ���� ������ ������(= ��� �� ������ ) 
		// �̸� �����ϱ� ���Ͽ� join() �� ���ش�
		
		//book - 695p ��������
		// 705p ������ �����ֱ�
	}

	private static void extendsThread() {
		ShowThread st1 = new ShowThread("����Ʈ");
		ShowThread st2 = new ShowThread("�������ι�");
		
//		st1.run();
		st1.start();
//		st2.run();
		st2.start();
	}
}

