package first;

public class method1005 {

	public static void main(String[] args) {

		
/*	#�޼���
 		��ü�� ������ �Լ�
 		�Լ�: Ư�� �����͸� �ް� ó���� �� ������� ��ȯ�ϴ� ���
 		�ڹ�: ��ü ����
 		�ڹ�: �Լ���� ǥ��x �޼��带 ���� ����.
		
		�޼��� �̸�: main
		�޼��� �߰�ȣ ���� �����ϴ� ������� ������ �Ʒ��� ������ ����
		
		class: ������ ���� ��ġ
		
		�ż����:�۾��� �����ϱ� ���� ���ɹ��� ����
		� ���� �Է¹޾Ƽ� ó���ϰ� �� ����� �����ش�.
		1) ���� �ް� 2) ó���ϰ� 3) ��ȯ�Ѵ�. --> 1,3�� �����̴�. 
		�޼����� ����:
		�ݺ� �ڵ带 ���̰� �ڵ� ������ �����ϴ�.
		�ݺ������� ����Ǵ� ���� ������ �޼���� �ۼ��Ѵ�.
		�ϳ��� �޼���� �ϳ��� ��ɸ� �����ϵ��� �ۼ��ϴ� ���� ����.
		���õ� ���� ������ �޼���� �ۼ�.

//		ex)	���ڵΰ��� �ް� ���ϱ� ���� �����ȯ
 		int int	  int+int	 int
 		
		����Ÿ��  �޼����̸� (Ÿ�� ������, Ÿ�� ������, ...)
		int			   	����1		����2
						int n1	int n2
 		n1+n2
 		return n1+n2 (����Ÿ�԰� ���ƾ��Ѵ�.)
 		
// 		int add(int a, int b)
 		{
 			int result = a+b;
 			return result;
 		}
 		
 		
 //		void power() {	//��ȯ���� ���� ��� ����Ÿ�� ��� void�� ����Ѵ�.
 			power = !power;
 		}
 		  		
 */
	//���� �޼ҵ� ���
		
		MyMath my = new MyMath(); //�޸𸮿� �ø���.
		System.out.println(my.add(1,5));
		
		my.sayHello();
		my.plus(10, 20);
		
		System.out.println(my.check());	
		
		my.div(10, 2);
		my.div(10, 0); //error
		
		
		
		
		
//		static void hiEveryone() {
//			System.out.println("�ȳ��ϼ���");
//	}
	
/*	#�޼��� ����
 		- �޼��� ����{} ���� �������� ��
 		- �޼��� ����{} ���� �� return���� ��������
 		-- return���� ������ �ּ�ȭ�ϴ� ���� ����.
 		-- ��ȯ���� �ִ� �޼���� ��� ��쿡 return���� �־�� �Ѵ�.
 			int max(int a, int b){
 			if(a>b)
 				return a;
 			else
 				return b;
 			}
 			
 		-- return�� ���� ��ȯ, �޼����� ���� �� ������ �ǹ̸� ����
 */

/*	#�޼��� �����ε�
 		�޼ҵ� �����ε��̶� ������ �̸��� �޼ҵ带 ���̻� ���ÿ� �����ϴ� ��
 		�޼ҵ� �Ű����� ����(����or�ڷ���)�� �ٸ��� �޼ҵ� �����ε� ����
 		�����ε� �� �޼ҵ� ȣ��� �����ϴ� ���ڸ� ���ؼ� ���е�
		�Ű������� ���� ����Ÿ���� �ٸ� ��� �����ε� ����x
		
		system.out.println(true );
		# �����ε��� ��
		int add(int a, int b)
		int add(int x, int y)
		���� ��ʴ� �����ε��� �ƴϴ�. 
		long add(int a, long b)
		long add(long a, int b) �� �����ε��̴�.
		
	#�ڹ��� �̸� ��Ģ
		Ŭ����: �빮�ڷ� ����, �� �̻��� �ܾ ������ �ϳ��� �̸� ���� �� �� �ܾ�� �빮�ڷ� ���� 
		class PersonName
		�ν���Ʈ ����, �޼ҵ� �̸� : �ҹ��ڷ� ����. ���̻��� �ܾ ������ �ϳ��� �̸� ���� �� ���ܾ�� �빮�ڷ� ���� 
		int addYourMoney(int money)
		int yourAge
		��� �̸�: ���� �빮��, ���̻��� �ܾ ������ �ϳ��� �̸� ������ �δܾ� ���̿� _����.
		final int COLOR=7
		final int COLOR RAINBOW=7
		
*/		
	}

}