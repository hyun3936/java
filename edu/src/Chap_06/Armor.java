package Chap_06; // 객체지향 구현

public class Armor { // 게터와 세터
	
	private String name;
	private int height;
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {  // void 여서 return 반환값 없음.
		this.name = name;
	}
	
	
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {  // void 여서 return 반환값 없음.
		this.height = height;
	}
}
