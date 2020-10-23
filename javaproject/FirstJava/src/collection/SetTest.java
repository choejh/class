package collection;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest {

	public static void main(String[] args) {
		
		//Set : ����, ������� �������� �ʴ´�. ����Ǵ� ���� �ߺ��� ������� �ʴ´�.
		//HashSet �ν��Ͻ� ���� : �ν��Ͻ��� �����ϱ� ���� ������� ����
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("First");
		set.add("Second");
		set.add("Third");
		set.add("First");	//������� �ʴ´�.
		
		System.out.println("set ����� ����: " + set.size()); //�ߺ� ���� �ȵ�
		
		// set<e> �� �����ϴ� ������ ������ �ʱ� ������ 
		// �ϰ� ó���� ���ؼ��� Iterator<E> �ν��Ͻ��� �̿��ؼ� ó�� 
		// Collection<E> iterator() �޼��� -> Iterator<E>�� ��ȯ�Ѵ�.
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
