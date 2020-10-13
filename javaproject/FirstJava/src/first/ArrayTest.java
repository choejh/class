package first;
//����Բ�
public class ArrayTest {

	public static void main(String[] args) {
		// �迭�� ���� : �ڷ���[] �迭�̸�
			// ������ �迭�� ����
			int[] arr = null; 
			
			// �迭�� ���� : �������� ���� ������ ����
			// new �ڷ���[����] : ���� ��ŭ�� ���ӵ� ������ �����ϰ� �������� �����.
			arr = new int[3];
			
			// �迭�� ���� : �Է�, �б�
			// �迭�̸�[index] : �迭�� ������ ���������� ��ġ�ϱ� ������ index ������ ����
			// index : 0     ����    ����� ����-1 ������ index�� ������.
			// ����� ������ �迭�̸�.length �ν��Ͻ� ������ ����ȴ�.
			
			arr[0] = 1;
			arr[1] = 2;
			arr[2] = 3;
			
			System.out.println("�迭 arr�� ����� ���� : " + arr.length);
			
			for(int i=0; i<arr.length; i++) {
				System.out.println(arr[i]);
			}
			
			//int sum = arr[0] + arr[1] + arr[2];
			int sum=0;
			
			for(int i=0; i<arr.length; i++) {
				sum += arr[i];
			}
			
			System.out.println("arr �迭 ��ҵ��� �� : " + sum);
			
			// ������ ���ÿ� �迭 ����� �ʱ�ȭ
			int[] arr2 = {1,2,3,4,5};
			System.out.println("�迭 arr2 �� ����� ���� : " + arr2.length);
			for(int i=0; i<arr2.length; i++) {
				System.out.println(arr2[i]);
			}
			
			int[] arr3 = null;
			arr3=arr2;
			arr3=arr;
			
			int[] arr4 = {1,2,3,4,5};  // ���� ������, �ּҰ� : 0x100
			int[] ref;
			ref = addAllArray(arr4, 7);   // addAllArray(0x100, 7) => 0x100 , ref = 0x100;
			if(arr4==ref) {
				System.out.println("���� �迭 ����");
			} else {
				System.out.println("�ٸ� �迭 ����");
			}
			
			for(int i=0; i<arr4.length; i++) {
				System.out.println(arr4[i]);
			}
			System.out.println("============================");
			for(int i=0; i<ref.length; i++) {
				System.out.println(ref[i]);
			}
			
			
			System.out.println("�ζ� ==================================");
			// �ζ� ��ȣ ���� ���α׷�
			// ���� ������ 1~45 ���� ���ڸ� �����ϴ� ���� 45�� ���� -> int Ÿ���� �迭 ����, ����
			int[] ball = new int[45];
			
			// �� ������ 1~45������ ���ڸ� �ߺ����� �ʰ� ����
			for(int i=0; i<ball.length; i++) { // i -> 0~44   index�� ���
				ball[i]=i+1;
			}
			
//				for(int i=0; i<ball.length; i++) {
//					System.out.println(ball[i]);
//				}
			
			// �� index�� ������ ���� ó�� : index=0 �� ���� ������(1~44) index�� ���� ���� �ٲ۴�
			
			int j=0; 	// ������ index
			int temp=0;	// �� ������ ���� �ٲٱ� ���� �ӽú���
			
			for(int i=0 ; i<10000; i++) {
				//������ index�� ���Ѵ� : 1~44
				j = (int)(Math.random()*44)+1; // 1~44
				temp = ball[0];
				ball[0] = ball[j];
				ball[j] = temp;
			}
			
			System.out.println("6�� ��ȣ ���� ==============");
			
			// �迭���� 0~5 ������ ���� ���� ���
			for(int i=0; i<6; i++) {
				System.out.print(ball[i]+"\t");
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

		}
		
		// int Ÿ���� �迭�� �ް�, ������ų �������� �޾Ƽ� 
		// �� �迭�� ��ҿ� ���� ������ ��ŭ ������Ű�� 
		// ���� ���� �迭�� ��ȯ 
		static int[] addAllArray(int[] ar, int addValue) {
			// int[] ar = 0x100, int addvalue=7
			for(int i=0; i<ar.length; i++) {
				ar[i] = ar[i]+addValue;
			}
			
			return ar;
		}
		
		// 

	}

