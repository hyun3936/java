package Chap_05; // 객체지향 알기

public class Armor {  // 클래스를 기술한 것이다
	
	// 필드
	private String name;
	int height;
	int weihgt; // default => 
	public String color;
	protected boolean isFly;
	
	// 메소드
	void takeOff() {
//		System.out.println(name); // 접근하는 곳
	}
	void land() {}
	void shootLaser() {}
	void launchMissile() {}
	
	public static int f(int x) {
		int value;
		value = 2 * x * x + 4 * x + 5;
		return value;
	}
	
	// 함수, 즉 Method를 실행하는 부분
	public static void main(String[] args) {
		int y;
		y = f(2);
		System.out.println("y = " + y);
	 
	}
}
