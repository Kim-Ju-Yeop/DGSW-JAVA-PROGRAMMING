import java.util.Scanner;
public class PerfectNum {
	public static void main(String[] args) {
		
	     int num, i,sum; 
	     
	     Scanner sc = new Scanner(System.in);
	     System.out.println("���Է� �ϼ���");
	     num=sc.nextInt();
	     
	     System.out.print(num+"�� ����� : "+1+", ");
	     
	     sum=1;
	     for(i = 2; i < num; i++){
	        if(num%i == 0){		 
	        	System.out.print(i+", ");	
	        	sum+=i;
	        }
	     }     
		 System.out.print(num+" �Դϴ�!");	
		 System.out.println("\n");
		 
		// �Ʒ��� ���������� Ȯ���ϴ� �ڵ��Դϴ�.
		 if(sum == num)
			 System.out.println(num+"�� �������Դϴ�!");
		 else
			 System.out.println(num+"�� �������� �ƴմϴ�!");
		 }
	
}

