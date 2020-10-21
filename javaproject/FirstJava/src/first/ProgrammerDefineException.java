//1021 ��Ʈ A
package first;

import java.util.Scanner;

public class ProgrammerDefineException {

	public static void main(String[] args)  {

		System.out.println("���̸� �Է��ϼ���.");	
		try {
		int age = readAge();
		System.out.println("���̴� " + age + " �Դϴ�.");
		} catch (AgeInputException e) {
			System.out.println(e); //e.toString()
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("���α׷��� �����մϴ�.");
	}
	
	
	
	
	
	public static int readAge() throws AgeInputException {
	// throws AgeInputException 
	// readAge() �޼��� ������ �߻��ϴ� �����߿�
	// AgeInputException Ÿ���� ���ܰ� �߻��ϸ�
	// readAge() �޼��带 ȣ���� ������ ���� �������� ����
		
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		//������ ������ ���� ���� �߻�
		if(age<0) {
			//������ new�� �̿��� �߻���Ű���� ���� Ŭ������ ��ü�� �������
			AgeInputException ae = new AgeInputException(age);
			
			//Ű���� throw�� �̿��ؼ� ���ܸ� �߻���Ų��.
			throw ae;
		}
		
		return age;
		
	}

}
