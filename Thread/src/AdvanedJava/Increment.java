package AdvanedJava;

public class Increment {
	int num= 0;
	public synchronized void increment() {
		num++;
	}
	// synchronized �ο�� ����� , ������������� �ɾ��ִ� �� 
	
	
	public int getNum() {
		return num ;
	}
}
