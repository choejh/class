package oct2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class arraylianxi {

	public static void main(String[] args) {
		
	List<Integer> list = new ArrayList<Integer>();
	list.add(new Integer(11));
	list.add(new Integer(22));
	list.add(new Integer(33));
	list.add(44);
	list.add(55);
	
	System.out.println(list.get(0));
	System.out.println(list.size());
	
	for(int i=0; i<list.size();i++ ) {
		System.out.println(list.get(i));
	}

	for(Integer i: list) {
		System.out.println(i);
	}
		System.out.println("=========================");
		
		
	HashMap<Integer, String> map = new HashMap<Integer, String>();
	map.put(new Integer(1), "�Ϲ�");
	map.put(2, "�̹�");
	map.put(3, "���");
	
	System.out.println("1�� �л��� �̸�: " + map.get(1));
	System.out.println("2�� �л��� �̸�: " + map.get(new Integer(2)));
	System.out.println("3�� �л��� �̸�: " + map.get(3));
	

	System.out.println("=========================");
	
	Set<Integer> set = map.keySet();
	Iterator<Integer> itr = set.iterator();
	
	while(itr.hasNext()) {
		int key = itr.next();
		System.out.println(key+"�� �л��� �̸��� "+ map.get(key));

	}
	
	ArrayList<String> list1 = new ArrayList<String>();
	list1.add("first");
	list1.add("Second");
	list1.add("Third");
	list1.add("Forth");
	
	System.out.println("������");
	
	Iterator<String> itrr = list1.iterator();
	
	while(itrr.hasNext()) {
		String str = itrr.next();
		System.out.println(str);
		if(str.compareTo("Third")==0) {
			itrr.remove();
		}
	}
	itrr = list1.iterator();
	while(itrr.hasNext()) {
		System.out.println(itrr.next());
	}
	
	
	
	
	
	
	}
	
	}
