package homework;
import java.util.Scanner;
public class array1014 {
	Scanner sc = new Scanner(System.in);
	
	//��������
	int arr[]= new int[100]; //���̰� 100�� �迭 
	int cnt;	//����� ����
	int min=arr[0];
	int max=arr[0];
	
	
	//�����͸� �Է¹ޱ�
	void insertData() {
		System.out.println("������ ������ �Է��Ͻÿ�.");
		int data = sc.nextInt();
		arr[cnt]=data;
		cnt++;
	}
	
	
	//�ִ밪 ��ȯ
	int maxiValue() {
		for(int i=0; i<arr.length;i++) {
			if (max>arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	
	//�ּҰ� ��ȯ
	int miniValue() {
		for(int i=0; i<arr.length;i++) {
			if (min<arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
//		���� 1.
//		int�� 1���� �迭�� �Ű������� ���� �޾Ƽ� �迭�� ����� �ִ밪,
//		�׸��� �ּҰ��� ���ؼ� ��ȯ�ϴ� �޼ҵ带 ������ ���·� ���� ����.
//		public static int miniValue(int[] arr) { . . . . } // �ּҰ� ��ȯ
//		public static int maxValue(int[] arr) { . . . . } // �ִ밪 ��ȯ
//		���� �� �żҵ�� ���ڷ� ���޵Ǵ� �迭�� ���̿� ������� �����ϵ��� ����.
//		�� �żҵ� ������ Ȯ�����ϱ� ���� main �޼ҵ� ����.
//		int�� �迭�� ä���� ������ ���α׷� ����ڷκ��� �Է� �ް�, �迭�� ���̴�
//		���Ƿ� ����

	 array1014 a = new array1014();
		
		
		while(true) {
			
			System.out.println("������ �迭�� �Է��Ͻðڽ��ϱ�?");
			System.out.println("1.�׷���. 2.�ƴϴ�.");
			System.out.println("========================");
			
			char insertMenu = sc.nextLine().charAt(0);
			
			switch(insertMenu) {
				case '1':
					a.insertData();
					break;
				case '2':
					System.out.println("���α׷��� �����մϴ�.");
					System.exit(0);
					break;
			}
		
	}
	//	System.out.println(a.arr);
		

}
	
}
