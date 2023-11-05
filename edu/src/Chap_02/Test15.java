package Chap_02;
public class Test15 {
	public static void main(String[] args) {
		char c = 'F';
		String gender = (c == 'F') ? "여자" : "남자"; // 삼항연산자  조건식 ? 참 : 거짓
		System.out.println(gender);
	}
}