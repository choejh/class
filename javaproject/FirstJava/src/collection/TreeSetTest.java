package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {

		//TreeSet : Ʈ�������� �����ϴ� �ڷᱸ��, 2�� Ʈ��
		//TreeSet �ν��Ͻ��� ����
		TreeSet<Integer> tSet = new TreeSet<Integer>();
		
		tSet.add(1);
		tSet.add(5);
		tSet.add(2);		
		tSet.add(4);
		tSet.add(3);
		tSet.add(2);
	
		System.out.println("TreeSet ����� ����:"+tSet.size());		
	
		
		Iterator<Integer> itr = tSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		
		
		
	}
		
}
