package Chap_02;
public class Test13 {
	public static void main(String[] args) {
		byte a = 0b00010001;
		byte b = 0b00100010;
		
		int c = a & b; // 0
		System.out.println(Integer.toBinaryString(c));
		
		int d = a | b; // 110011
		System.out.println(Integer.toBinaryString(d));
		
		int e = a ^ b; // 110011
		System.out.println(Integer.toBinaryString(e));
		
		
		int f = 12;
		int g = (~f)+1; // -12  ~물결표 는 비트 NOT연산자. 이진표현에서 모든 비트를 반전시킴.
		System.out.println(g);
		
		int h = f << 1; // 24 왼쪽 시프트 연산 : 이진표현을 왼쪽으로 1비트 시프트.
		int i = g >> 1; // 6  오른쪽 시프트 연산
		System.out.println(h);
		System.out.println(i);
	}
}