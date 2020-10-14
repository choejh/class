package homework;
import java.util.Scanner;

public class array1014 {
	//변수선언
	int arr[];
	int cnt;
	int min=arr[0];
	int max=arr[0];
	//메소드 만들기
	//최대값 반환
	
	int maxiValue() {
		for(int i=0; i<arr.length;i++) {
			if (max>arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	
	//최소값 반환
	
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
//		문제 1.
//		int형 1차원 배열을 매개변수로 전달 받아서 배열에 저장된 최대값,
//		그리고 최소값을 구해서 반환하는 메소드를 다음의 형태로 각각 정의.
//		public static int miniValue(int[] arr) { . . . . } // 최소값 반환
//		public static int maxValue(int[] arr) { . . . . } // 최대값 반환
//		위의 두 매소드는 인자로 전달되는 배열의 길이에 상관없이 동작하도록 정의.
//		두 매소드 실행을 확인인하기 위한 main 메소드 정의.
//		int형 배열에 채워질 정수는 프로그램 사용자로부터 입력 받고, 배열의 길이는
//		임의로 결정

		
		
	}

}
