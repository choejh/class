package homework;
import java.util.Scanner;

public class array1014 {
	//��������
	int arr[];
	int cnt;
	int min=arr[0];
	int max=arr[0];
	//�޼ҵ� �����
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
	

	
//	static void arrData (int data){
//	Scanner sc = new Scanner(System.in);
//	int data = sc.nextInt();
//	}
	
	
	public static void main(String[] args) {
//		���� 1.
//		int�� 1���� �迭�� �Ű������� ���� �޾Ƽ� �迭�� ����� �ִ밪,
//		�׸��� �ּҰ��� ���ؼ� ��ȯ�ϴ� �޼ҵ带 ������ ���·� ���� ����.
//		public static int miniValue(int[] arr) { . . . . } // �ּҰ� ��ȯ
//		public static int maxValue(int[] arr) { . . . . } // �ִ밪 ��ȯ
//		���� �� �żҵ�� ���ڷ� ���޵Ǵ� �迭�� ���̿� ������� �����ϵ��� ����.
//		�� �żҵ� ������ Ȯ�����ϱ� ���� main �޼ҵ� ����.
//		int�� �迭�� ä���� ������ ���α׷� ����ڷκ��� �Է� �ް�, �迭�� ���̴�
//		���Ƿ� ����

		
		
	}

}
