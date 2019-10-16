// 5. 밑변과 높이를 Triangle 클래스의 맴버변수에 저장하고 삼각형의 넓이를 출력하는 함수와 밑변과 높이의 값을 변경하는 함수를 만들어 정상적으로 작동하도록 코드를 작성하시오.
package Question;

public class Triangle {
	
	// Triangle 클래스 맴버 변수
	int base;
	int height;
	
	// Triangle 클래스 생성자
	public Triangle(int base, int height) {
		
		this.base = base;
		this.height = height;
	}
	
	// 넓이 출력 함수
	public void area() {
		
		int total = (base * height) / 2;
		System.out.println("입력하신 삼각형의 넓이는 : " + total + "cm 입니다.");
	}
	
	// 밑변, 높이 변경 함수
	public void change(int base, int height) {
		
		this.base  = base;
		this.height = height;
		System.out.println("입력하신 값으로 밑변과 높이를 변경하였습니다.");
	}
	
}

// Triangle_Test 
class Triangle_Test {
	
	public static void main(String[] args) {
		
		Triangle triangle = new Triangle(15,30);
		triangle.area();
		
		triangle.change(5, 20);
		triangle.area();
	}
}
