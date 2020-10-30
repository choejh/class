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
	map.put(new Integer(1), "일번");
	map.put(2, "이번");
	map.put(3, "삼번");
	
	System.out.println("1번 학생의 이름: " + map.get(1));
	System.out.println("2번 학생의 이름: " + map.get(new Integer(2)));
	System.out.println("3번 학생의 이름: " + map.get(3));
	

	System.out.println("=========================");
	
	Set<Integer> set = map.keySet();
	Iterator<Integer> itr = set.iterator();
	
	while(itr.hasNext()) {
		int key = itr.next();
		System.out.println(key+"번 학생의 이름은 "+ map.get(key));

	}
	
	ArrayList<String> list1 = new ArrayList<String>();
	list1.add("first");
	list1.add("Second");
	list1.add("Third");
	list1.add("Forth");
	
	System.out.println("요소출력");
	
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
