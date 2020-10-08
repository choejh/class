package first;

public class BlockTest {
	
	static int[] arr = new int[10];
	
	static {
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10)+1; // (int)(1.0<=r<11.0) ->0~9+1 -> 1~10����
		}
		System.out.println("�迭�� ����� �ʱ�ȭ �۾� �Ϸ�");
	}
	
	//Ŭ���� �ʱ�ȭ ��� : �ڵ尡 �ε�� �� ����� ���� �ڵ尡 ���� 
	static {
		System.out.println("static { 123 }");
	}
	
	//�ν��Ͻ� �ʱ�ȭ ��� : �ν��Ͻ��� ������ �� ����� �ڵ尡 ����, ������ ���� �켱�Ѵ�.
	{
		System.out.println("{ }");
	}
	
	BlockTest() {
		System.out.println("������");
	}
	
	public static void main(String[] args) {
		
		System.out.println("BlockTest �ν��Ͻ� ����");
		BlockTest bt1 = new BlockTest();
		
		System.out.println("BlockTest �ν��Ͻ� ����");
		BlockTest bt2 = new BlockTest();
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr["+i+"]"+arr[i]);

		}
		
	}

}
