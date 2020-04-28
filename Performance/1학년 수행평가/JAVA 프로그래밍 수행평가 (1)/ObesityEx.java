import java.util.Scanner;

public class ObesityEx {
	public static void main(String[] args) {
		
		int height;
		int weight;
		
		Obesity obesity = new Obesity();
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("키는?(기본단위cm) : ");
		height = scanner.nextInt();
		
		if(height < 100 || height > 200) {
			System.out.println("입력가능한 범위가 아닙니다.");
		} else {
			obesity.setHeight(height);
		}
		
		System.out.printf("몸무게는?(기본단위 kg) : ");
		weight = scanner.nextInt();
		
		if(weight <= 0) {
			System.out.println("입력가능한 범위가 아닙니다.");
		} else {
			obesity.setWeight(weight);
		}
		
		double num;
		num = obesity.standardBodyW();
		
		double num2;
		num2 = obesity.dgree(num);
		
		String end;
		end = obesity.rating(num2);
		
		System.out.println("당신의 비만도 수치는? : " + end);
		
	}
}
