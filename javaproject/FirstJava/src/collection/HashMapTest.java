package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		
		//Map : key-value �������� �����ϴ� ��ü
		//HashMap<T, E>
		//���� : V get(K key)
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		//��� �߰� : put(T e)
		map.put(new Integer(1), "�Ϲ�");
		map.put(2, "�̹�");
		map.put(3, "���");
		
		//���� : V get(K key)
		
		System.out.println("1�� �л��� �̸� : " + map.get(1));
		System.out.println("2�� �л��� �̸� : " + map.get(new Integer(2)));
		System.out.println("3�� �л��� �̸� : " + map.get(3));
		
		
		//Set<Key Type>
		Set<Integer> set = map.keySet(); 
		Iterator<Integer> itr = set.iterator();
		
		while(itr.hasNext()) {
			int key = itr.next();
			System.out.println(key+"�� �л��� �̸��� "+ map.get(key));
			
			
			//key������ ������ �����س��� �ʿ��Ҷ����� �������� 
		}
		
	}

}
