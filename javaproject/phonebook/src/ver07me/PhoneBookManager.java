package ver07me;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

import ver03.Util;

public class PhoneBookManager implements Util {
	
	List<PhoneInfo> pBook;
	
	// 생성자 : 싱글톤 처리 -> 외부에서 인스턴스 생성을 금지 
	private PhoneBookManager(int num){
		pBook = new ArrayList<PhoneInfo>();
		load();
	}
	
	// 내부에서 인스턴스 생성 
	private static PhoneBookManager manager = new PhoneBookManager(100);
	
	// 외부에서 참조변수를 받을 수 있는 메서드  //getinstance는 하나의 인스턴스만 가지고 공유해서 쓴다.
	//생성자를 private로 선언해 다른 클래스에서 해당 클래스의 인스턴스를 new로 생성하지 못하게 하고, getinstance함수를 통해서만 인스턴스를 갖도록 한다.
	public static PhoneBookManager getInstance() {
		return manager;
	}
	
	// 정보 저장
	//   1. 배열에 저장 메서드 다형성을 이용해서 하나의 메서드로 정의  addInfor(상위클래스타입의 매개변수)
	//   2. 사용자에게 받은 데이터를 인스턴스 생성 메서드
	//      입력의 구분 -> 구분에 따라 인스턴스 생성도 구분 -> addInfor()메서드를 이용해서 정보 저장
	
	// 배열에 전화번호 정보를 저장하는 메서드
	private void addInfor(PhoneInfo info) {
		//pBook[cnt++] = info;
		
		//List에 정보 저장
		pBook.add(info);
	}
	
	// 전화번호 정보를 인스턴스 생성하고 배열에 저장
	public void insertInfo() {
		
		int select =0;
		
		while(true) {
			System.out.println("어떤 정보를 입력하시겠습니까?");
			System.out.println(Menu.UNIV+". 대학");
			System.out.println(Menu.COM+". 회사");
			System.out.println(Menu.CAFE+". 동호회");
			
			
			try {
			
				select = SC.nextInt();
				
				//
				
				if( !(select>0 && select<4) ) {
					BadInputException e = new BadInputException(String.valueOf(select));
					throw e;
				}
			} catch (InputMismatchException | BadInputException e) {
				System.out.println("잘못된 메뉴입력입니다. 다시 선택해주세요");
				SC.nextLine();
				continue;
			}
			break;
		}
		
		SC.nextLine();
		
		System.out.println("정보 입력을 시작합니다.");
		System.out.println("이름 >> ");
		String name = SC.nextLine();
		System.out.println("전화번호 >> ");
		String pNum = SC.nextLine();
		System.out.println("주소 >> ");
		String addr = SC.nextLine();
		System.out.println("이메일 >> ");
		String email = SC.nextLine();

		switch(select) {
		
		case Menu.UNIV :
			// 추가 정보 받고 -> 인스턴스 생성 -> 배열에 저장
			// 전공, 학년
			System.out.println("전공 >> ");
			String major = SC.nextLine();
			System.out.println("학년 >> ");
			int grade = SC.nextInt();
			addInfor(new univPhoneInfo(name, pNum, addr, email, major, grade));
			
			break;
		case Menu.COM :
			// 추가 정보 받고 -> 인스턴스 생성 -> 배열에 저장
			// 회사이름
			System.out.println("회사 이름 >> ");
			String company = SC.nextLine();
			
			addInfor(new CompanyPhoneInfo(name, pNum, addr, email, company));
			
			break;
		case Menu.CAFE :
			System.out.println("동호회 이름 >> ");
			String cafeName = SC.nextLine();
			System.out.println("닉네임 >> ");
			String nickName = SC.nextLine();
			
			addInfor(new cafePhoneInfo(name, pNum, addr, email, cafeName, nickName));
			
			break;
		}
		
		System.out.println("입력하신 정보가 저장되었습니다. (저장 개수: "+pBook.size()+")");
		
	}
	
	
	// 정보 검색
	// 배열의 index 를 찾는 메서드
	// List의 index 찾기
	private int searchIndex(String name) {
		int index = -1;	// 정보가 없을 때
		for(int i=0; i<pBook.size() ; i++) {
			// 이름으로 비교
			if(pBook.get(i).getName().equals(name)) {   // pBook.get(i) List의 요소 참조
				index = i;
			}
		}
		return index;
	}
	
	// 해당 index의 참조변수로 정보 출력 : 사용자가 입력한 이름으로 검색
	public void searchInfor() {
		
		if(pBook.size()==0) {
			System.out.println("입력된 정보가 없습니다.");
			return;
		}
		
		SC.nextLine();
		System.out.println("검색하실 이름을 입력해주세요.");
		String name = SC.nextLine();
		
		int index = searchIndex(name);
		
		if(index<0) {
			System.out.println("검색하신 이름 "+name+"의 정보가 존재하지 않습니다.");
			System.out.println("메뉴로 돌아갑니다.");
		} else {
			System.out.println("검색 결과 =============");
			pBook.get(index).showInfor();
		}
	}

	
	
	// 사용자에게 이름을 입력 받고 이름으로 검색 한 후 정보 삭제
	public void deleteInfor() {
		
		if(pBook.size()==0) {
			System.out.println("삭제할 정보가 없습니다.");
			return;
		}
		
		SC.nextLine();
		
		System.out.println("삭제하고자 하는 정보의 이름을 입력해주세요. ");
		String name = SC.nextLine();
		
		int index = searchIndex(name);
		
		if(index<0) {
			System.out.println("찾으시는 이름 "+name+"의 정보가 존재하지 않습니다.");
			System.out.println("메뉴로 이동합니다.");
		} else {
			// List 의 요소 삭제는 인덱스의 시프트도 이루어진다.
			pBook.remove(index);
			System.out.println("요청신 이름의 정보를 삭제했습니다.");
		}
		
	}
	
	
	
	
	// 전체 정보를 출력하는 메서드
	public void showAllInfor() {
		
		if(pBook.size()==0) {
			System.out.println("입력된 정보가 없습니다.");
			return;
		}
		
		System.out.println("전체 정보를출력 합니다. ======================");
		for(int i=0; i<pBook.size() ; i++) {
			pBook.get(i).showInfor();
			System.out.println("--------------------");
		}
	}
	
	
	//List:pBook에 저장되어 있는 인스턴스들 저장
	public void save() {
		if(pBook.size()==0) {
			System.out.println("저장된 데이터가 없어 파일이 저장되지 않습니다.");
			return;
		}
	//인스턴스 저장용 출력 스트림	
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("phonebookme.ser"));	
		out.writeObject(pBook);
		out.close();
		System.out.println("저장되었습니다.");
		} catch (IOException e) {
			System.out.println("저장과정에서 오류가 발생했습니다. 다시 시도하세요. "+e.getMessage());
		}
	}
	//프로그램으로 파일의 저장 데이터 로드
		void load() {
			File file = new File("phonebookme.ser");
			if(file.exists()==false){
		System.out.println("파일이 존재하지 않습니다.");
		return;
	}
			
	try {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("phonebookme.ser"));
		pBook = (List<PhoneInfo>) in.readObject();
		System.out.println("데이터 로드 완료");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("데이터 로드 과정에서 오류 발생!");
		}

	
	
      catch (FileNotFoundException e) {
		e.printStackTrace();
		System.out.println("데이터 로드 과정에서 오류 발생!");
	} catch (IOException e) {
		e.printStackTrace();
		System.out.println("데이터 로드 과정에서 오류 발생!");
	}
	
	
	
	
	
}
}