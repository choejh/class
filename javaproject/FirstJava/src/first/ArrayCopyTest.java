package first;

public class ArrayCopyTest {

	public static void main(String[] args) {
		
		//����� ���� �迭 ����
		char[] abc = {'A','B','C','D'};
		char[] number = {'0','1','2','3','4','5','6','7','8','9'};
		
		System.out.println(abc);
		System.out.println(new String(number));
		
		//abc �迭�� number �迭�� �����ؼ� ����� �迭 ����
		char[] result = new char[abc.length+number.length];
		
		//Array Copy
		System.arraycopy(abc, 0, result, 0, abc.length); //���� 10���� ��������
		System.out.println(result);
		System.arraycopy(number, 0, result, abc.length, number.length);
		System.out.println(result);
		
		// abc�� number�� 0���� ����
		System.arraycopy(abc, 0, number, 0, abc.length);
		System.out.println("number: " + new String (number));
		
		//number index=6���� abc index = 0 3���� ����
		System.arraycopy(abc, 0, number, 6, 3);
		System.out.println("number: " + new String (number));
	}

}
