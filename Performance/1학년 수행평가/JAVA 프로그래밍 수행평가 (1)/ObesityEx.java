import java.util.Scanner;

public class ObesityEx {
	public static void main(String[] args) {
		
		int height;
		int weight;
		
		Obesity obesity = new Obesity();
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Ű��?(�⺻����cm) : ");
		height = scanner.nextInt();
		
		if(height < 100 || height > 200) {
			System.out.println("�Է°����� ������ �ƴմϴ�.");
		} else {
			obesity.setHeight(height);
		}
		
		System.out.printf("�����Դ�?(�⺻���� kg) : ");
		weight = scanner.nextInt();
		
		if(weight <= 0) {
			System.out.println("�Է°����� ������ �ƴմϴ�.");
		} else {
			obesity.setWeight(weight);
		}
		
		double num;
		num = obesity.standardBodyW();
		
		double num2;
		num2 = obesity.dgree(num);
		
		String end;
		end = obesity.rating(num2);
		
		System.out.println("����� �񸸵� ��ġ��? : " + end);
		
	}
}
