package Chap_06;

public class ThisTest {
	int i = 1;
	
	public void first() {
		int i = 2;
		int j = 3;
		this.i = i + j;  // 단순히 i면 지역변수i 이지만, this.i는 현재 메소드가 속한 인스턴스 주소값이 저장.
		
		second(4);
	}
	
	public void second(int i) {
		int j = 5;
		this.i = i + j;
	}
	
	public static void main(String[] args) {
		ThisTest exam = new ThisTest();
		exam.first(); //F5:Step into debug
	}
}
