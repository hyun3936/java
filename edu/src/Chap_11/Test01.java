package Chap_11;

public class Test01 {
	public static void main(String[] args) {
		try { // try 바디속 내용을 예외가 발생해도 무시하고 지나감
		int arr[] = new int[3];
		arr[3] = 30;
		System.out.println("Ok");
	} catch(ArrayIndexOutOfBoundsException e) { // 그냥 Exception 해도 됨 (= 부모클래스).
		System.out.println("잘못된 배열의 인덱스 사용!");
	}
		// e.printStackTrace();  ==> 에러 뜰때 빨간 글씨 뜨는거 띄어줌.
	System.out.println("GOOD");
	}
}
