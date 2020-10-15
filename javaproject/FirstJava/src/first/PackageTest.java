package first;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PackageTest {

	public static void main(String[] args) {
	
		//java.util.Date today = new java.util.Date (); //인스턴스 만들기다
		//System.out.println(today);
		Date today = new Date();
		
		SimpleDateFormat date = null;
		//yyyy -> 년도
		//MM -> 월
		//dd -> 일
		//hh -> 시간
		//mm -> 분
		//ss -> 초 
		//a -> 오전 / 오후
		//2020.10.15 10:56
		date = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss"); //내가 정하는 포맷 
		
		String now = date.format(today);
		System.out.println(now);
	
	}

}
