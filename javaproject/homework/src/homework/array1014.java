package homework;
import java.util.Scanner;
public class array1014 {
	Scanner sc = new Scanner(System.in);
	
	//변수선언
	int arr[]= new int[100]; //길이가 100인 배열 
	int cnt;	//저장된 갯수
	int min=arr[0];
	int max=arr[0];
	
	
	//데이터를 입력받기
	void insertData() {
		System.out.println("저장할 정수를 입력하시오.");
		int data = sc.nextInt();
		arr[cnt]=data;
		cnt++;
	}
	
	
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
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
//		문제 1.
//		int형 1차원 배열을 매개변수로 전달 받아서 배열에 저장된 최대값,
//		그리고 최소값을 구해서 반환하는 메소드를 다음의 형태로 각각 정의.
//		public static int miniValue(int[] arr) { . . . . } // 최소값 반환
//		public static int maxValue(int[] arr) { . . . . } // 최대값 반환
//		위의 두 매소드는 인자로 전달되는 배열의 길이에 상관없이 동작하도록 정의.
//		두 매소드 실행을 확인인하기 위한 main 메소드 정의.
//		int형 배열에 채워질 정수는 프로그램 사용자로부터 입력 받고, 배열의 길이는
//		임의로 결정

	 array1014 a = new array1014();
		
		
		while(true) {
			
			System.out.println("정수를 배열에 입력하시겠습니까?");
			System.out.println("1.그렇다. 2.아니다.");
			System.out.println("========================");
			
			char insertMenu = sc.nextLine().charAt(0);
			
			switch(insertMenu) {
				case '1':
					a.insertData();
					break;
				case '2':
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
					break;
			}
		
	}
	//	System.out.println(a.arr);
		

}
	
}
