package first;

public class ArrayBubbleSort {

	public static void main(String[] args) {
	//���� ������ 10���� �����ϴ� �迭 ����
	int[] number = new int[10];
	
	//���� ���� 0~9������ ���ڸ� �迭�� �� ��ҿ� ��������..
	for(int i= 0; i<number.length; i++) {
		number[i] = (int)(Math.random()*10);
		System.out.print(number[i]+" ");
	}
	System.out.println("=============================");
	
	for (int i = 0; i < number.length; i++) {

		boolean changed = false; // �ڸ������� �߻� �ߴ��� üũ

		// �ڸ��� �ٲ�ó��
		for(int j=0 ; j<number.length-1-i; j++) {
			
			// ���� �ε����� ���� ������ �ε����� ���� ���ϰ�,
			if(number[j]>number[j+1]) {
				// ���� ���� ũ�� �ڸ� ����
				int temp = number[j];
				number[j] = number[j+1];
				number[j+1] = temp;
				
				changed = true;
			}
			
		}

		if (!changed) {
			break;
		}

		for (int k : number) {
			System.out.print(k + " ");
		}
		
		System.out.println();
	}

}

	
	
	
	
	}

