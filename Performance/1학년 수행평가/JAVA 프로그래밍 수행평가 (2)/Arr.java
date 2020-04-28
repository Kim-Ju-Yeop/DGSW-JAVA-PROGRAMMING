package array;

// 문제 
// int 형 배열 arr 을 크기 10으로 마들고 for 문을 사용하여 배열 arr 에 값을 1부터 10까지 값을 넣으세요.
// 그 후 Arrmethod 클래스를 생성해서 ood 매서드를 만든 후 for each 문을 사용하여 홀수인 값만 출력하세요.
public class Arr {
	public static void main(String[] args) {
		
		int[] arr = new int[10];
		
		int num = 1;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		
		Arrmethod arrmethod = new Arrmethod();
		
		arrmethod.odd(arr);
	}
}
