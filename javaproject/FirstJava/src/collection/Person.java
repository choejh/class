package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Person implements Comparable<Person>{
	
	String name;
	int age;
	
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	public String toString() {
		return name+"("+age+")";
	}
	
	@Override
	public int compareTo(Person o) {
		//���1
//		if(age>o.age) {
//			return 1; //�����ȯ: ���޹��� ��ü�� ���� ���� ��
//		
//		} else if(age<o.age)
//		return -1; //���� ��ȯ: ���޹��� ��ü�� ���� Ŭ ��
//		} else {
//			return 0;
//		}
		
		//���2��
		//return age-o.age;
		return o.age-age;
		
	}
		
		public static void main(String[] args) {
			
			TreeSet<Person> tSet = new TreeSet<Person>();
			
			tSet.add(new Person("son",29));
			tSet.add(new Person("Park",40));
			tSet.add(new Person("Lee",20));
			
			Iterator<Person> itr = tSet.iterator();
			
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			
		}
		
		
}
