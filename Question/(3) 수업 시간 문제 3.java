// 3. Moniter 클래스에서 각각의 맴버변수를 생성 후 Moniter_test 클래스에서 Moniter 클래스의 맴버변수, 매서드를 사용하는 코드를 작성하시오
package Example;

public class Moniter {
	
	boolean power;	
	String name;
	int channel;
	
	public Moniter(String name) {
		this.name = name;
	}
	
	// power on/off 함수
	public void power() {
		
		this.power = !power;
		
		if(power == true) {
			
			System.out.println(name + " Monitor 를 켰습니다.");
		} else {
			
			System.out.println(name + " Monitor 를 종료하였습니다.");
		}
	}
	
	// channelUp 함수
	public void channelUp() {
		
		this.channel++;
		System.out.println("현재 " + name + "의 Moniter 채널은 " + channel + "입니다.");
	}
	
	// channelDown 함수
	public void channelDown() {
		
		this.channel--;
		System.out.println("현재 " + name + "의 Moniter 채널은 " + channel + "입니다.");
	}
	
	
}

class Moniter_test {

	public static void main(String[] args) {
		
		// Moniter 클래스를 참조해서 samsung, apple 인스턴스를 생성하였으며 각각 매개변수 Moniter 의 이름을 전달하고있습니다.
		Moniter samsung = new Moniter("samsung");
		Moniter apple = new Moniter("apple");
		
		samsung.power = false;
		apple.power = false;
		
		// power() 함수 (전원 on)
		samsung.power();
		apple.power();
		
		System.out.println();
		
		// samsung, apple 인스턴스의 channel 값을 설정하고있습니다.
		samsung.channel = 50;
		apple.channel = 100;
		
		// channelup 함수
		samsung.channelUp();
		apple.channelUp();
		
		System.out.println();
		
		// channelDown 함수
		samsung.channelDown();
		apple.channelDown();
		
		System.out.println();
			
		// power() 함수 (전원 off)
		samsung.power();
		apple.power();
		

	}
}

