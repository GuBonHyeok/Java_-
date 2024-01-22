package days14;

public class Tv {
	
	// 클래스 안의 모든 구성요소 : 멤버
	
	// 멤버변수(필드) : 속성. 클래스 변수는 초기화를 하지 않아도 각 자료형의 초기값으로 초기화 되어있다.
	public String color; 
	public boolean power = false;
	public int channel = 0;
	
	// 멤버함수(메서드) : 기능
	public void power() {
		power = !power; //전원 On <-> Off 왔다갔다 하는 것
	}
	
	// 채널△ 버튼 
	public void channelUp() {
		channel++;
	}
	
	// 채널▽ 버튼
	public void channelDown() {
		channel--;
	}
	
}
