// 문제 2 맴버변수 height, weight 을 private 접근 제어자로 선언을 하고 사용자로 부터 값을 입력받아라.
// 만약 height 의 길이가 100 이상 200 미만이 아닐 경우 오류 표시를 해주어라, weight 의 무게가 0 이하일 때 오류 표시를 해주어라.
// 그 후 공식에 맞게 정상, 과체중, 비만이 표시되도록 코딩을 하여라

public class Obesity {
	
	// 맴버변수 private 선언
	private int height;
	private int weight;
	
	// standardBodyW 매소드
	public double standardBodyW() {
		if(height < 150) {
			return height - 100;
		} else if(height >= 150 && height < 160) {
			return (height - 150) / 2 + 50;
		} else {
			return (height - 100) * 0.9;
		}
	}
	
	// dgree 매소드
	public double dgree(double normal_weight) {
		return (weight - normal_weight) * 100 / normal_weight;
	}
	
	// rating 매소드
	public String rating(double rate) {
		if(rate <= 10) {
			return "정상";
		}else if(rate > 10 && rate <= 20 ) {
			return "과체중";
		} else {
			return "비만";
		}
	}
	
	// getter, setter 함수
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
}
