package oct2;

public class lianxi {

	public static void main(String[] args) {
		
		//사용할 원본 배열 생성
		char[] abc = {'A','B','C','D'};
		char[] number = {'0','1','2','3','4','5','6','7','8','9'};
		
		System.out.println(abc);
		System.out.println(new String (number));
		
//		//abc 배열과 number 배열을 연결해서 사용할 배열 생성
		char[] result = new char[abc.length+number.length]; //자리만 만듦.
		
		//Array Copy
//		System.arraycopy(src, srcPos, dest, destPos, length);
//						 원본, 어디부터 , 복사대상, 복사어디부터, 
		System.arraycopy(abc, 0, result, 0, abc.length); //공백 10개가 합쳐졌다 //이해가 안가......
		System.out.println(result);

		System.arraycopy(number, 0, result, abc.length, number.length);
		System.out.println(result);
//		
//		// abc를 number에 0부터 복사
//		System.arraycopy(abc, 0, number, 0, abc.length);
//		System.out.println("number: " + new String (number));
//		
//		//number index=6부터 abc index = 0 3개를 복사
//		System.arraycopy(abc, 0, number, 6, 3);
//		System.out.println("number: " + new String (number));
	}

}
