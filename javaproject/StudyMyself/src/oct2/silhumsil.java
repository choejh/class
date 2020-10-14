package oct2;

class silhumsil{ 
	public static void main(String[] args) {
		
		
	//정수 데이터 10개를 저장하는 배열 생성
	int[] number = new int[10];
	
	//임의 숫자 0~9까지의 숫자를 배열의 각 요소에 저장하자..
	
	for(int i=0;i<number.length;i++) {
		number[i] = (int)(Math.random()*10);
		System.out.print(number[i]+" ");
	}

	System.out.println("=============================");
	//자리바뀜이 발생했는지 체크
	for (int i = 0; i<number.length; i++) { //뭔가 10번함
		boolean changed = false; 
	//자리를 바꿈처리	
			for(int j=0; j<number.length-1-i; j++) { 
				if(number[j]>number[j+1]) {
					int temp = number[j];
					number[j]=number[j+1];
					number[j+1]=temp;
					
					changed= true;
				}
				
			}
		
			if(!changed) {		//j가 한바퀴 돌았을때 .. 여기서 이해가 안됨.. 뭐냐
				break;
			}
			
		for(int k: number) {
			System.out.print(k + " ");
		}
		System.out.println();
	}
	}
}
