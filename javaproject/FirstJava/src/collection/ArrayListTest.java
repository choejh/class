package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		
	// List<E> : ���� ���� ���� (�ݺ��� �̿� ����) , �ߺ� ���� ��� 
	// �ν��Ͻ� ������ �������� �ϴ� Ŭ����
	// List �ν��Ͻ� ����
	//ArrayList<Integer> list = new ArrayList<Integer>() ;
//	List<Integer> list =new ArrayList<Integer>();
	//��� �ᵵ ���� == > ������ 
	List<Integer> list = new ArrayList(); //�� ���������� ������ Ȯ�� ��
		
		
	// ������ ���� : �������� ����
	// add(<T>)
	list.add(new Integer(11));
	list.add(new Integer(22));	
	list.add(new Integer(33));
	list.add(55);	//Auto Boxing
	list.add(44);	
	
	// List�� ��� ����
	// <T> get()
	System.out.println("list �� ù ��° ����� �� : " + list.get(0));

	// List ����� ����
	// size()
	System.out.println("List ����� ����: "+list.size());
	
	//�ݺ����� �̿��� ��� ��� ����
	for(int i=0; i<list.size(); i++) {
		System.out.println(list.get(i));
	}
	System.out.println("---------------");
	for(Integer i : list) {
		System.out.println(i);
	}
	System.out.println("ù ��° ��� ���� ----------");
	//list ����� ���� 
	//remove(index��)
	//ù ��° ��Ҹ� ����
	list.remove(0);
	
	for(int i: list) {
		System.out.println(i);
	}
	
	

	}

}
