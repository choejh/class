package first;

public class ExamStringTest {

	public static void main(String[] args) {
//역순출력
	String str = "ABCDEFGHIJKLMN";
	int numOfStr = str.length();
	int index = numOfStr-1;	//배열이나 문자열의 위치 index는 0~n-1
	
	String result = "";
	StringBuffer sb = new StringBuffer();
	
	//String 클래스의 charAt() 메서드를 이용해서 역순으로 출력
	for(int i=index; i>=0; i-- ) {
		//result +=str.charAt(i); //result = result + String(1개)
		sb.append(str.charAt(i));
	}
		System.out.println(str);
		System.out.println(new String(sb));
		System.out.println("==========");
		//StringBuffer 클래스 이용
		sb = new StringBuffer(str).reverse();	//"ABCDEFGHIJKLMN"
		System.out.println(sb);
		
		sb = sb.reverse();

		System.out.println(new String(sb));
		System.out.println("문제2");
//string에서 문자 삭제
		str = "990929-1010123";
		sb = new StringBuffer(); //16개 문자 저장 
		
		System.out.println(str);
		//String charAt() 이용
		for(int i=0; i<str.length();i++) {
			//'-'가 아닌경우, '0'~'9' => 문자열을 추가
			char c = str.charAt(i);
			if(c>'0'&&c<='9') {
				sb.append(c); //추가해준다.
			}
		}
		
		System.out.println(sb);
		// String replace()
		result = str.replace("-", ""); //하이픈을 공백으로
		System.out.println(result);
		
	
	
	
	
	}

}
