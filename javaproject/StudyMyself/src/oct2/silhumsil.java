package oct2;

import java.util.Scanner;

class silhumsil{ 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			System.out.println("�Է��Ͻ� �޴��� ������.");
			System.out.println(".����");
			System.out.println(".ȸ��");
			System.out.println(".��ȣȸ");
			int select = sc.nextInt();
			
		if(!(select>0 && select<4)) {
			System.out.println("�޴� ������ �ùٸ��� �ʽ��ϴ�.");
			System.out.println("�ʱ� �޴��� ���ư��ϴ�.");
			return;
	}
}
}	
