package homework;
import java.util.Scanner;
public class array1014 {
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
/*
	//����1	
	//��������
	int arr[] = new int[10];
	
	//�Է¹ޱ�
	System.out.println("���� 10���� �Է��Ͻÿ�");
	for(int i=0;i<10;i++) {
		System.out.println("������ �Է��ϼ���");
		arr[i] = sc.nextInt();
	}	
	
	System.out.println(maxValue(arr));
	System.out.println(minValue(arr));
*/
//����2
	int add=7;
	int[][] arr2 = {
			{1,2,3},
			{4,5,6},
			{7,8,9}
			
	};
	
	
	addOneDArr(arr2, add);
	
	for(int i =0; i<arr2.length;i++) {
		for(int j=0; j <arr2[i].length; j++){
			System.out.println(arr2[i][j]);
		}
		System.out.println();
	}

	
//����3
	
	 int [][] arr4 = {
			 {1,2,3},
			 {4,5,6},
			 {7,8,9}
	 };
		for(int i =0; i<arr4.length;i++) {
			for(int j=0; j <arr4[i].length; j++){
				System.out.print(arr4[i][j]+" ");
			}
			System.out.println();
		}
	 changeArr(arr4);
	 
		for(int i =0; i<arr4.length;i++) {
			for(int j=0; j <arr4[i].length; j++){
				System.out.print(arr4[i][j]+" ");
			}
			System.out.println();
		}
	 
	 
	}
	
	


//���� 1)

//�ִ밪	
public static int maxValue(int[] arr) {
	int max = arr[0];
	for(int i=1;i<arr.length;i++) {
		if( max<arr[i]) {
			max=arr[i];
		}
	}
	
	return max;
}
	
//�ּҰ�
public static int minValue(int[] arr) {
	int min = arr[0];
	for(int i=1;i<arr.length;i++) {
		if(min>arr[i]) {
			min=arr[i];
		}
	}
	return min;
}	
	

//����2)

public static void addOneDArr(int[][] arr, int add) {
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			arr[i][j] = arr[i][j] + add;

		}
	}
}
	
	
//����3)
public static void changeArr (int[][] arr) {
	int temp[]= new int[1];
		temp = arr[arr.length-1];
	for(int i=arr.length-2;i<=0;i-- ) {
			arr[i+1]=arr[i];
		}
		
	}



}
	



