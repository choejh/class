package first;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PackageTest {

	public static void main(String[] args) {
	
		//java.util.Date today = new java.util.Date (); //�ν��Ͻ� ������
		//System.out.println(today);
		Date today = new Date();
		
		SimpleDateFormat date = null;
		//yyyy -> �⵵
		//MM -> ��
		//dd -> ��
		//hh -> �ð�
		//mm -> ��
		//ss -> �� 
		//a -> ���� / ����
		//2020.10.15 10:56
		date = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss"); //���� ���ϴ� ���� 
		
		String now = date.format(today);
		System.out.println(now);
	
	}

}
