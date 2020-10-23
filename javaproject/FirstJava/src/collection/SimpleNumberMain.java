package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SimpleNumberMain {

	public static void main(String[] args) {
	
		// Set �ν��Ͻ� ���� 
		Set<SimpleNumber> set = new HashSet<SimpleNumber>();
		
		set.add(new SimpleNumber(10));
		set.add(new SimpleNumber(20));
		set.add(new SimpleNumber(10));
		
		System.out.println("set ����� ���� : " + set.size());
		
		Iterator<SimpleNumber> itr = set.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());	//��������x
		}
		
	}

}
