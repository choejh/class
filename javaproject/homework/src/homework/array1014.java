package homework;
import java.util.Scanner;
public class array1014 {
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	//문제1	
	//변수선언
	int arr[] = new int[10];
	
	//입력받기
	System.out.println("정수 10개를 입력하시오");
	for(int i=0;i<10;i++) {
		System.out.println("정수를 입력하세요");
		arr[i] = sc.nextInt();
	}	
	
	System.out.println(maxValue(arr));
	System.out.println(minValue(arr));

//문제2
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

	int[][] arr3 = {
			{7,8,9},
			{1,2,3},
			{4,5,6}
	};
		
	}
	
	


//문제 1)

//최대값	
public static int maxValue(int[] arr) {
	int max = arr[0];
	for(int i=1;i<arr.length;i++) {
		if( max<arr[i]) {
			max=arr[i];
		}
	}
	
	return max;
}
	
//최소값
public static int minValue(int[] arr) {
	int min = arr[0];
	for(int i=1;i<arr.length;i++) {
		if(min>arr[i]) {
			min=arr[i];
		}
	}
	return min;
}	
	

//문제2)

public static void addOneDArr(int[][] arr, int add) {
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			arr[i][j] = arr[i][j] + add;

		}
	}
}
	
	
////문제3)
//public static void changeArr (int[][] arr) {
//	int temp= new int[1];
//		temp[0]=arr[0];
//	for(int i=1;i<arr.length-1;i++ ) {
//		if(arr.length-1=i) {
//			arr[i]=temp[0];
//		}
//		arr[i]=arr[i+1];
//	}
//	}
//	i[0] 1 --> temp로
//	i[1] 2 --> 
//	i[2] 4
//	i[3] 6
//	arr.length= 4
//	마지막 i는 = 3
//	
//	[0] = [1]
//	[1] = 2
//	3 = 4
//	
//	
	
	
}




