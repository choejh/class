package first;

public class ArrayTest2 {

	public static void main(String[] args) {
		
		//2���� �迭�� ����: �ڷ���[][] �迭�� �̸�
		int[][] arr = null;
		
		// 2���� �迭�� ���� : new �ڷ���[���][����] 
		arr = new int[3][4];
		
		// 2���� �迭�� ����: �迭�̸�[���� index][���� index] , index�� 0���� ����
		arr[0][0] = 10; //������ ����
		System.out.println("arr[0][0]=> " + arr[0][0]);
		arr[1][3] = 13;
		System.out.println("arr[1][3]=> " + arr[1][3]);
		
		// 2���� �迭�� 1���� �迭�� ������ �迭�̴�
		System.out.println(arr.length); //3 -> 1���� �迭�� �����ϴ� �ּҰ� 3�� 
										//arr�� length���� 2���� �迭�� ���� ������
										//2���� �迭 arr�� length ���� 1���� �迭�� ������ ������.
		
		System.out.println(arr[0].length);//4 arr[0]�� ù��° 1���� �迭�� ����Ű�� �ּҰ��� �����ϴ� �����̴�.
		System.out.println(arr[1].length);//4 arr[0]�� �ι�° 1���� �迭�� ����Ű�� �ּҰ��� �����ϴ� �����̴�.
		System.out.println(arr[2].length);//4 arr[0]�� ����° 1���� �迭�� ����Ű�� �ּҰ��� �����ϴ� �����̴�.
		
		System.out.println("2���� �迭�� ��� ��� ========================");
		// for �ݺ����� �̿��ؼ� 2���� �迭�� ��� ��Ҹ� ����	
		showData(arr);
//		for(int i=0; i<arr.length; i++) {	// 0, 1, 2
//			for(int j=0; j<arr[i].length; j++) {	// 0, 1, 2, 3
//				System.out.print(arr[i][j]+"\t");
//			}
//			System.out.println();
//		}
		
		System.out.println("2���� �迭�� ��� ��� ������ ����======");
		// ��ü ��ҿ� ���� ����
		for(int i = 0; i <arr.length ; i++) { //0,1,2
			for(int j = 0; j<arr[i].length;j++) { //0,1,2,3
				arr[i][j] = i+j;
			}
		}
		System.out.println("2���� �迭�� ��� ��� ������ ���=====");
		showData(arr); //�ذ� ����
		
		//for �ݺ����� �̿��ؼ� 2���� �迭�� ��� ��� ����
		for(int i = 0; i <arr.length ; i++) { //0,1,2
			for(int j = 0; j<arr[i].length;j++) { //0,1,2,3
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	
		//�����迭
		int[][] arr2 = new int[3][];
		arr2[0] = new int[3];
		arr2[1] = new int[5];
		arr2[2] = new int[2];
		
		//�迭�� ��� ���
		System.out.println("���� �迭�� ��� ���==============");
		showData(arr2);
		
		String[][] place = new String[6][];
		place[0] = new String[2];
		place[1] = new String[4];
		place[2] = new String[3];
		place[3] = new String[3];
		place[4] = new String[3];
		place[5] = new String[3];
		System.out.println("�ڸ���ġ ======================");
		showData(place);
		
		int[][] arr3 = {
				{1,2},
				{3,4,5},
				{6,7,8,9},
		};
		System.out.println("2���� �迭�� ���α���(1���� �迭�� ����) : " +arr3.length);
		for(int i = 0; i<arr3.length ; i++) {
			System.out.println("arr3["+i+"].length: " + arr3[i].length);
		}
		
	//for-each ���� : �迭�� ���� �������� ������ �ƴ� �ϰ� ������ �����϶� ����� �� �ִ�.
		System.out.println("arr4====");
	int sum=0;
	int[] arr4 = {1,2,3,4,5};
	for(int n : arr4) {
	//	System.out.println(n);
		sum+=n;
	}
	System.out.println("�迭 arr4�� ��ҵ��� �� "+sum);
	
	//for-each������ ���� ���� -> �迭���� ������ ���� �ʴ´�.
	for(int n : arr4) {
		n++;
		System.out.println(n);
	}
	
	System.out.println("=====================");
	System.out.println();
	for(int n:arr4) {
		System.out.println(n);
	}
		
	}
	
	//������ 2���� �迭�� ���� �޾�
	//��� ����� ���� ����ϴ� �޼���,
	//��ȯ�ϴ� �����ʹ� ����.
	
	static void showData(String[][] arr) {
		System.out.println("2���� �迭�� ��� ��� ������ ���=====");
		//for �ݺ����� �̿��ؼ� 2���� �迭�� ��� ��� ����
		for(int i = 0; i <arr.length ; i++) { //0,1,2
			for(int j = 0; j<arr[i].length;j++) { //0,1,2,3
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}	
	
	static void showData(int[][] arr) {
		System.out.println("2���� �迭�� ��� ��� ������ ���=====");
		//for �ݺ����� �̿��ؼ� 2���� �迭�� ��� ��� ����
		for(int i = 0; i <arr.length ; i++) { //0,1,2
			for(int j = 0; j<arr[i].length;j++) { //0,1,2,3
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
		
}
