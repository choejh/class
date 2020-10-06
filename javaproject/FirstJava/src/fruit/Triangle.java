package fruit;

public class Triangle {

	//삼각형 넓이 = 밑변x높이/2
	//내풀이법
	int mit =0;
	int height =0;
	
	int Tri(int mit, int height) {
	
		int result = mit*height/2;
		System.out.println("삼각형의 넓이= "+result);
		return result;
	}
	//선생님 방식
	
	float width; //삼각형의 밑변
	float height2; //삼각형의 높이
	
	//메서드 : 변수의 값을 변경하는 메서드, 삼각형의 넓이를 구하고 결과를 반환하는 메서드
	//변수의 값을 변경하는 메서드
	
	void setData(float w,float h) {
		width = w;
		height2=h;
	}
	//삼각형의 넓이를 구하고 결과를 반환하는 메서드 : 밑변*높이/2 => 결과는 실수 타입으로
	float area() {
		float resultt = 0.0f;
		resultt = width * height2 /2;
		return resultt;
	}

	
//	float area() {
//		return width * height / 2;
//	}								나중엔 이렇게
	
	public static void main(String[] args) {
		
		Triangle t = new Triangle();
		
		//밑변과 높이 값을 설정
		t.setData(10, 3);
		
		// 넓이를 구하고 변수에 담는다.
		float resultt =t.area();
		
		System.out.println(resultt);
		
	}
	
}
