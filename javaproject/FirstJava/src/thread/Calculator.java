//1027 ����ȭ�� �˸�
package thread;

public class Calculator {

	int opPlusCnt=0;
	int opMinCnt=0;
	
	public int add(int n1, int n2) {
		synchronized (this) {
			opPlusCnt++;
		}
		return n1+n2;
	}
	
	 public int min(int n1, int n2) {
		synchronized (obj) {
			opMinCnt++;
		}
		return n1-n2;
	}
	
	 //���ο� ����ȭ Ű 
	Object obj = new Object();
	
	 
	 
	 
	 
}
