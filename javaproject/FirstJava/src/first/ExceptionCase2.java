//1021
package first;

public class ExceptionCase2 {

	public static void main(String[] args) {
		
		try {
		int[] arr = new int[3]; //index -> 0~2
		//arr[10]=20;

		//int[] arr = new int[-10];
		
		Object obj = new int[10];
		//String str = (String)obj;
		
	String str1 = null;
		int len = str1.length();

			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		
		
		} catch(NegativeArraySizeException e) {
			System.out.println(e.getMessage());
		
		
		} catch(ClassCastException e) {
			System.out.println(e.getMessage());
		
		
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		//위에부터 아래로 내려간다. 예외가 발생해도 정상적으로 처리됨. 
		}
		
		System.out.println("메소드가 종료됩니다.");
		/////////////////////////////노답
	}

}
