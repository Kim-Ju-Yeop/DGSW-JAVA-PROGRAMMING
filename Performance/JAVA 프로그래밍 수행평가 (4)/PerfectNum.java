import java.util.Scanner;
public class PerfectNum {
	public static void main(String[] args) {
		
	     int num, i,sum; 
	     
	     Scanner sc = new Scanner(System.in);
	     System.out.println("값입력 하세요");
	     num=sc.nextInt();
	     
	     System.out.print(num+"의 약수는 : "+1+", ");
	     
	     sum=1;
	     for(i = 2; i < num; i++){
	        if(num%i == 0){		 
	        	System.out.print(i+", ");	
	        	sum+=i;
	        }
	     }     
		 System.out.print(num+" 입니다!");	
		 System.out.println("\n");
		 
		// 아래는 완전수인지 확인하는 코드입니다.
		 if(sum == num)
			 System.out.println(num+"은 완전수입니다!");
		 else
			 System.out.println(num+"은 완전수가 아닙니다!");
		 }
	
}

