package oct2;

class silhumsil{ 
	public static int[] addAllArray(int[] ar,int addVal) { //�޼ҵ� 
		for(int i=0; i<ar.length;i++) { // �迭�� ���� �߰��ϴ� �޼ҵ带 �������.
			ar[i]+=addVal;
	}
		return ar;
	}


	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int[] ref;
		ref = addAllArray(arr,7); //arr�迭�� 7�� ���Ѱ��� ref�迭
		if(arr==ref)
			System.out.println("���� �迭 ����");
		else	
			System.out.println("�ٸ� �迭 ����");
		
		for(int i=0; i<ref.length;i++) {
			System.out.print(arr[i]+" "); //arr�� ref�� ���� �迭�̴�.
		}
		
	}
}