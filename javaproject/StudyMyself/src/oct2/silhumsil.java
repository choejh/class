package oct2;

class silhumsil{ 
	public static int[] addAllArray(int[] ar,int addVal) { //메소드 
		for(int i=0; i<ar.length;i++) { // 배열에 값을 추가하는 메소드를 만들었다.
			ar[i]+=addVal;
	}
		return ar;
	}


	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int[] ref;
		ref = addAllArray(arr,7); //arr배열에 7씩 더한것이 ref배열
		if(arr==ref)
			System.out.println("동일 배열 참조");
		else	
			System.out.println("다른 배열 참조");
		
		for(int i=0; i<ref.length;i++) {
			System.out.print(arr[i]+" "); //arr과 ref가 같은 배열이다.
		}
		
	}
}