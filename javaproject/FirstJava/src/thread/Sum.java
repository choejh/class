//1027쓰래드 3-1, 5-0
package thread;

public class Sum {

	int num;
	
	Sum() {
		num=0;
	}
	//동시접근 막기
	synchronized void addNum(int n) {
		num+=n;
	}
	
	int getNum() {
		return num;	
	}
	
}
