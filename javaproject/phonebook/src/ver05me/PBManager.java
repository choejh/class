package ver05me;

import java.util.Scanner;

import ver03.Util;

public class PBManager implements Menu {
	
	Scanner sc = new Scanner(System.in);
//기본설정
	
	PhoneInfo[] pBook;
	int cnt;
	
	//생성자를 싱글톤 처리해서 외부에서 인스턴스 생성 금지	
	private PBManager (int num) {
		pBook = new PhoneInfo[num];
		cnt=0;		
	}
	private static PBManager manager = new PBManager(100);
	
	//?
	public static PBManager getInstance() {
		return manager;
	}
	
//저장
	//배열에 전화번호 저장
	private void addInfor(PhoneInfo info) {
		pBook[cnt++] = info;
	}
	
	//전화번호 정보 인스턴스 생성 배열 저장
	public void insertInfo() {
		System.out.println("입력하실 메뉴를 고르세요.");
		System.out.println(Menu.UNIV+".대학");
		System.out.println(Menu.COM+".회사");
		System.out.println(Menu.Cafe+".동호회");
		int select = sc.nextInt();
	//1~3외에 다른 번호를 선택한다면?	
	if(!(select>0 && select<4)) {
		System.out.println("메뉴 선택이 올바르지 않습니다.");
		System.out.println("초기 메뉴로 돌아갑니다.");
		return;
	}
	//공통정보 저장
		System.out.println("정보를 입력합니다.");
		sc.nextLine();
		System.out.println("이름: ");
		String name = sc.nextLine();
		System.out.println("전화번호: ");
		String pNum = sc.nextLine();
		System.out.println("주소: ");
		String addr = sc.nextLine();
		System.out.println("생일: ");
		String birth = sc.nextLine();
	//그룹별 정보 저장
	switch(select) {
	case Menu.UNIV:
		System.out.println("전공: ");
		String major = sc.nextLine();
		addInfor(new UnivPhoneInfo(name, birth, pNum, addr, major));
		break;
	
	case Menu.COM:
		System.out.println("회사이름: ");
		String company = sc.nextLine();
		addInfor(new CompanyPhoneInfo(name, birth, pNum, addr, company));
		break;
	case Menu.Cafe:
		System.out.println("동호회이름: ");
		String cafeName = sc.nextLine();
		addInfor(new cafePhoneInfo(name, birth, pNum, addr, cafeName));
		break;
	}
		System.out.println("정보 저장이 완료 되었습니다.");
	}
	
	
	
//출력
	public void showAllInfor() {
		if(cnt==0) {
			System.out.println("입력된 정보가 없습니다.");
			return;
		}
		System.out.println("전체 정보를 출력합니다.");
		for(int i=0; i<cnt; i++) {
			pBook[i].showPBook();
			System.out.println("=============");
		}
		
		
	}
//미니버젼 출력
	public void showBasic() {
		if(cnt==0) {
			System.out.println("입력된 정보가 없습니다");
			return;
		}
		System.out.println("기본 정보를 출력합니다.");
		for(int i=0; i<cnt; i++) {
			pBook[i].showPBookBasic();
			System.out.println("================");
		}
	}
	
//검색
	//배열의 index를 찾기
	public int searchIndex(String name) {
		int index = -1;
		for(int i =0; i<cnt; i++) {
			if(pBook[i].getName().equals(name)) {
				index = i;
			}
		}
		return index;
	}
	//index 정보 출력
	public void searchInfor() {
		System.out.println("검색할 이름을 입력하세요.");
		String name = sc.nextLine();
		int index = searchIndex(name);
		
		if(index<0) {
			System.out.println("'"+name+"'은 존재하지 않습니다.");
			System.out.println("메뉴로 돌아갑니다.");
		} else {
			System.out.println("검색결과======");
			pBook[index].showPBook();
		}
	
	
	
	}
	
	
	
//삭제
	public void deleteInfor() {
		if(cnt==0) {
			System.out.println("입력된 정보가 없습니다.");
			return;
		}
	System.out.println("삭제할 이름을 입력하세요.");	
	String name = sc.nextLine();
	int index = searchIndex(name);
	if(index<0) {
		System.out.println("'"+name+"'은 존재하지 않습니다.");
		System.out.println("메뉴로 돌아갑니다.");
	}else {
		for(int i=index; i<cnt-1; i++) {
			pBook[i]=pBook[i+1];
		}
		cnt--;
		System.out.println("'"+name+"'의 정보를 삭제했습니다.");
	}
	}
	
	
	
}
