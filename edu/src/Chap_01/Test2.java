package Chap_01;

public class Test2 {
	public static void main(String[] args) {
		double a = 3.14f; //코드에서 실수 3.14는 double로 해석 : default로해석
		byte num1 = 1;
		short num2 = 20;
		long num3 = 300;
		long depositAmount = 2147483648L;
		depositAmount = 50000;
		boolean isMarried = true;
		char gender = 'F';
		gender = 'M';
		String greet = "Good Morning";// greet가 참조변수이다.
		//sysout Ctrl + spacebar
		System.out.println(depositAmount + "\n" + isMarried + "\t" + gender);
	}
}