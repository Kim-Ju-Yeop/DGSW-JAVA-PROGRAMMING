// 4. BackAccountPO 클래스를 사용해서 입금, 출금, 잔액 확인 매서드를 생성 후 BackAccountPO_test 클래스를 사용해서 각각의 인스턴스를 생성한 후 BackAccountPO 매서드와 맴버변수를 사용하는 코드를 작성하시오
package Example;

public class BankAccountPO {
	
	// BackAccountPO 클래스의 맴버변수
	int balance;
	String name;

	// 매개변수 생성자
	public BankAccountPO(String name) {
		
		this.name = name;
	}
	
	// 입금 함수
	public int deposit(int amount) {
		
		System.out.println(name + "님이 " + amount + "을(를) 입금하셨습니다.");
		balance += amount;
		return balance;
	}
	
	// 출금 함수
	public int withdraw(int amount) {
		
		System.out.println(name + "님이"+ amount + "을(를) 출금하셨습니다.");
		balance -= amount;
		return balance;
	}
	
	// 잔액 확인 함수
	public int checkMyBalance() {
		
		System.out.println(name + "님의 " + "현재 남으신 잔액은 : " + balance + "입니다.");
		return balance;
	}
		
}

class BankAccountPO_test {

	public static void main(String[] args) {
		
		// BankAccountPO 클래스를 참조해서 juyeop, jinu 인스턴스를 생성하였으며 매개변수로 각 인스턴스의 이름을 전달하고있습니다.
		BankAccountPO juyeop = new BankAccountPO("김주엽");
		BankAccountPO jinu = new BankAccountPO("최진우");
		
		// 입금 함수 호출
		juyeop.deposit(5000);
		jinu.deposit(3000);	
		
		System.out.println();
		
		// 잔액 확인 함수 호출
		juyeop.checkMyBalance();
		jinu.checkMyBalance();
		
		System.out.println();
		
		// 출금 함수 호출
		juyeop.withdraw(2000);
		jinu.withdraw(1000);
		
		System.out.println();
		
		// 잔액 확인 함수 호출
		juyeop.checkMyBalance();
		jinu.checkMyBalance();
	}
}

