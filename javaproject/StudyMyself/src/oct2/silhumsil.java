package oct2;

class silhumsil{ 
	public static void main(String[] args) {
		
		
	//���� ������ 10���� �����ϴ� �迭 ����
	int[] number = new int[10];
	
	//���� ���� 0~9������ ���ڸ� �迭�� �� ��ҿ� ��������..
	
	for(int i=0;i<number.length;i++) {
		number[i] = (int)(Math.random()*10);
		System.out.print(number[i]+" ");
	}

	System.out.println("=============================");
	//�ڸ��ٲ��� �߻��ߴ��� üũ
	for (int i = 0; i<number.length; i++) { //���� 10����
		boolean changed = false; 
	//�ڸ��� �ٲ�ó��	
			for(int j=0; j<number.length-1-i; j++) { 
				if(number[j]>number[j+1]) {
					int temp = number[j];
					number[j]=number[j+1];
					number[j+1]=temp;
					
					changed= true;
				}
				
			}
		
			if(!changed) {		//j�� �ѹ��� �������� .. ���⼭ ���ذ� �ȵ�.. ����
				break;
			}
			
		for(int k: number) {
			System.out.print(k + " ");
		}
		System.out.println();
	}
	}
}
