package first;

public class ExamStringTest {

	public static void main(String[] args) {
//�������
	String str = "ABCDEFGHIJKLMN";
	int numOfStr = str.length();
	int index = numOfStr-1;	//�迭�̳� ���ڿ��� ��ġ index�� 0~n-1
	
	String result = "";
	StringBuffer sb = new StringBuffer();
	
	//String Ŭ������ charAt() �޼��带 �̿��ؼ� �������� ���
	for(int i=index; i>=0; i-- ) {
		//result +=str.charAt(i); //result = result + String(1��)
		sb.append(str.charAt(i));
	}
		System.out.println(str);
		System.out.println(new String(sb));
		System.out.println("==========");
		//StringBuffer Ŭ���� �̿�
		sb = new StringBuffer(str).reverse();	//"ABCDEFGHIJKLMN"
		System.out.println(sb);
		
		sb = sb.reverse();

		System.out.println(new String(sb));
		System.out.println("����2");
//string���� ���� ����
		str = "990929-1010123";
		sb = new StringBuffer(); //16�� ���� ���� 
		
		System.out.println(str);
		//String charAt() �̿�
		for(int i=0; i<str.length();i++) {
			//'-'�� �ƴѰ��, '0'~'9' => ���ڿ��� �߰�
			char c = str.charAt(i);
			if(c>'0'&&c<='9') {
				sb.append(c); //�߰����ش�.
			}
		}
		
		System.out.println(sb);
		// String replace()
		result = str.replace("-", ""); //�������� ��������
		System.out.println(result);
		
	
	
	
	
	}

}
