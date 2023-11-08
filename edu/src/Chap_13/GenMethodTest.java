package Chap_13;  // 제너릭 메서드

public class GenMethodTest {
	
	static <T extends Number, V extends T> boolean isInclude(T num, V[] array) {
		
		for (int i = 0; i < array.length; i++) {
			if(array[i] == num)
				return true;
		}
		return false;
	}

	
	public static void main(String[] args) {
		Integer[] inum = {1, 2, 3, 4, 5};
		Double [] dnum = {1.0, 2.0, 3.0, 4.0, 5.0};
		String [] snum = {"one", "two", "three", "four", "five"};
		
		boolean b1 = isInclude(3, inum); // 정수버전으로 자동 타입 변경
		System.out.println("결과 : " + b1);
		
		boolean b2 = isInclude(5.0, dnum); // 더블버전.
		System.out.println("결과 : " + b2);
		
		
		// isInclude("one", snum);
		
		GenMethodTest.<Integer, Integer>isInclude(3, inum);
		GenMethodTest.<Double, Double>isInclude(5.0, dnum);
		// GenMethodTest.<String, String>isInclude("one", snum); // line5에 isInclude에서 Number라고 제한해놔서 str이라 안됨. 
	}
}