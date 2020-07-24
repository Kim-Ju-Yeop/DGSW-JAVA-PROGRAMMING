class Worker{
	private String name; 
	private int hourPay; //시급
	private int workHour; //근무시간

	public Worker(String name, int workHour) {
		this.name=name;
		setWorkHour(workHour);
	}
	
	int getpay() {
		return hourPay * workHour;
	}
	
	// Getter
	public String getName() {
		return name;
	}
	public int getHourPay() {
		return hourPay;
	}
	public int getWorkHour() {
		return workHour;
	}

	// Setter
	public void setHourPay(int hourPay) {
		if(this.hourPay < hourPay) {
			this.hourPay = hourPay;	
		}
	}
	public void setWorkHour(int workHour) {
		this.workHour = workHour;
		
		if(workHour < 4 && workHour > 0) {
			this.hourPay = 10000;
		} else if(workHour >= 4) {
			this.hourPay = 13000;
		} else {
			this.workHour = 0;
		}
	}
}

class HourWorker extends Worker{
	private int workDay;
	
	public HourWorker(String name,  int workHour, int workDay) {
		super(name, workHour);
		this.workDay = workDay;
	}
	
	int getpay() {
		return super.getpay()* workDay;
	}
	
	public String toString() {
		String str1="이름 :"+this.getName()+" 월급 : "+ this.getpay();
		return str1;
	}

	
	// Getter
	public int getWorkDay() {
		return workDay;
	}
	
	// Setter
	public void setWorkDay(int workDay) {	
		if(workDay >= 0) {
			this.workDay = workDay;
		}
	}
}	

class MonthWorker extends Worker{
	public MonthWorker(String name,  int workHour) {
		super(name,workHour);
	}
	
	int getpay() {
		 return super.getpay() * 20;
	}
	
	public String toString() {
		String str1="이름 :"+this.getName()+" 월급 : "+ this.getpay();
		return str1;
	}	
}

public class WorkerExam {
	public static void main(String[] args) {
		MonthWorker yoongyesang = new MonthWorker("Yoongyesang",8);
 		System.out.println(yoongyesang);
		HourWorker annDenny =new  HourWorker("annDenny", 3, 5);
		System.out.println(annDenny);
	}
}
