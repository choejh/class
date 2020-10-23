package basic;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		
		String strData ="11,22,33,44,55";
		StringTokenizer st = new StringTokenizer(strData, ",");
		System.out.println(st);
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		System.out.println("======================");
		String pNum = "Tel 82-010-9999-7777 soon";
		StringTokenizer st1 = new StringTokenizer(pNum); //아무것도 없을땐 공백을 기준으로 나뉨
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
		
		StringTokenizer st2 = new StringTokenizer(pNum," -"); //구분자 '-' ' ' 두가지
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		
		System.out.println("======================");
		
		
		StringTokenizer st3 = new StringTokenizer(pNum,"- ", true);
		
		while(st3.hasMoreTokens()) {
			System.out.println(st3.nextToken());
		}
		
		
	}

}
