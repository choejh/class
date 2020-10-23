package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("First");
		list.add("Second");
		list.add("Third");
		list.add("Forth");
		
		//Iterator<E> �ν��Ͻ� ���� : iterator() �޼��� ȣ��
		System.out.println("��� ���");
		
		Iterator<String> itr = list.iterator();
		//hasNext(), next(), remove()
		
		while(itr.hasNext()){//���� ��� �ִ� ���� 
			String str = itr.next();
			System.out.println(str);
			if(str.compareTo("Third")==0) {
				itr.remove();
			}
		}
		System.out.println("��� ���� �� ����Ʈ ���");
		itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
