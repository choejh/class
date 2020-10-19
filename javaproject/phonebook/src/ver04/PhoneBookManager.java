package ver04;

import java.util.Scanner;

import ver03.Util;

public class PhoneBookManager {
//전화번호를 저장하는 배열
	private PhoneInfor[] phoneInfor; //전화번호부 정보 저장 배열
	private int num; //저장된 정보의 개수 
	
//생성자로	초기화
	public PhoneBookManager (int num) {
		phoneInfor = new PhoneInfor[num];
		num = 0;
	}
	
//배열에 친구 정보를 저장하는 기능: 다형성을 이용한 매개변수 정의
	void addPhoneInfo(PhoneInfor p) {
		phoneInfor[num++] = p;
	}
	
//대학:1 회사:2 가족:3
void addPhone(int choice) {
		
		//사용자로부터 기본 정보를 입력받자 
		Scanner sc = new Scanner(System.in); // 컨트롤 쉬프트 o
		System.out.println("전화번호부 입력을 시작합니다.");
		System.out.println("이름을 입력해주세요 >> ");
		String name = sc.nextLine();
		System.out.println("전화번호를 입력해주세요>> ");
		String pNum = sc.nextLine();
		System.out.println("주소를 입력해주세요>> ");
		String addr = sc.nextLine();
		System.out.println("이메일를 입력해주세요>> ");
		String email = sc.nextLine();

		//인스턴스 생성
		if (choice==1) {
			addPhoneInfo(new PhoneInfor(name, pNum, addr, email));
		}
		
		else if (choice==2) {
		//대학 친구 데이터 받고 인스턴스 생성 -> 배열에 저장
			System.out.println("전공을 입력해주세요 >> ");
			String major = sc.nextLine();
			System.out.println("학년을 입력해주세요 >> ");
			String year = sc.nextLine();
			addPhoneInfo(new PhoneUniv(name, pNum, addr, email, major, year));
		}
		
		else if (choice==3){
		//회사 사람 데이터 받고 인스턴스생성 -> 배열에 저장
		System.out.println("회사정보를 입력해주세요 >> ");
		String Company = sc.nextLine();
		addPhoneInfo(new PhoneCompany(name, pNum, addr, email, Company));
		}
		
		else if (choice==4) {
		//가족의 데이터를 받고 인스턴스 생성 -> 배열에 저장	
			System.out.println("나이를 입력해주세요 >> ");
			String age = sc.nextLine();
			addPhoneInfo(new PhoneCompany(name, pNum, addr, email, age));
			System.out.println("입력이 완료되었습니다.\n");
		}	
		
}		
		//전체 정보를 출력하는 메서드 : showInfor() -> 배열 이용
		void showInfor() {
			System.out.println("전체 데이터를 출력합니다.==============");
			for(int i=0; i<num;i++) {
				phoneInfor[i].showInfor();
				System.out.println("------------------");
			}
		}
		
		

		
// 정보 검색

		void searchMember () { 
			if(num==0) {
				System.out.println("저장된 데이터 없습니다. 다시 메뉴로 이동합니다.");
				return;
			}
			//찾고자 하는 이름을 받는다.
			System.out.println("정보 검색을 시작합니다.");
			System.out.println("찾고자 하는 이름을 입력해주세요. : ");
			String name = Util.sc.nextLine();
			
			//이름을 요소 index 검색
			int index = searchIndex(name);
			
			if(index<0) {
			System.out.println("찾으시는 이름의 정보가 존재하지 않습니다.");
			} else {
				//정보출력
				phoneInfor[index].showInfor();
			}
		}
		//이름 문자열을 받아서, 
		//배열의 정보와 비교하고,
		//index를 찾아서 반환하는 메서드
		int searchIndex(String name) {
			int result= -1;
			
			//검색: index를 찾는다.
			for(int i=0; i<=num;i++) {
				if(phoneInfor[i].getName().equals(name)) {
					result=i;
					break;
				}
			}
			
			
			return result;
		}
		
	///////////////////////////////////////////////////
		
//정보 삭제

		void deleteMember() {
			
			if (num == 0) {
				System.out.println("등록된 정보가 없습니다.");
				return;
			}

			System.out.println("정보 삭제를 진행합니다.");
			System.out.println("삭제 하고자 하는 정보의 이름을 입력해주세요.");
			String name = Util.sc.nextLine();

			// 이름을 요소 index 검색
			int index = searchIndex(name);

			if (index < 0) {
				System.out.println("삭제 하고자 하는 정보가 존재하지 않습니다.");
			} else {

				for (int i = index; i < num - 1; i++) {
					phoneInfor[i] = phoneInfor[i + 1];
				}

				num--;

				System.out.println("정보를 삭제 했습니다.");
			}

		}
		
		
		
		
		
		
		
		
		
}

