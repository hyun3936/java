package Chap_01;

public class Test5 {

	public static void main(String[] args) {
		int A1 = 10;
		int A2 = -A1; // -10
		System.out.println("A2 : " + A2);
		A2 += 10; //A2 = A2 + 10; 와 같다
		System.out.println("A2 : " + A2);
		A1++; // A1 = A1 + 1 같다
		System.out.println("A1 : " + A1);
		
		int A3 = A1++ + A2++; // ++이 뒤에 있으면 : A3변수에 대입 이 끝나고 난뒤, A1과 A2 각각 +1씩 함.
		// ++이 앞에있는지 뒤에 있는지 잘 구분하자
		
		System.out.println("A3 : " + A3);
		System.out.println("A1 = " + A1 + "  A2 = " + A2);
		System.out.println(A1 == A2); // 논리연산자
		char gender = 'M';
		int balance = 100;
		
		System.out.println(gender != 'F' & balance++ > 10);
		
		
		
	}

}

