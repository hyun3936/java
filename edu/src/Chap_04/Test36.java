package Chap_04;   // 알파벳 나열 (배열의 활용)

// import java.util.Iterator; // iterate 반복하다,  iterator '반복자'

public class Test36 {
	public static void main(String[] args) {
		// char 타입은 문자의 유니코드값을 저장하는 데이터 타입이다. 
		
		char letter ='A'; // 변수 letter 에는 'A'의 유니코드 값 65가 저장
		char[] alphabet = new char[26];
		
		
		// 반복문을 이용해서 문자 뽑을 때
		
		for(int i = 0; i < alphabet.length; i++) {
			alphabet[i] = (char)(letter + i); // type casting  정수 -> 문자    p.93
		}
		
		for(char c : alphabet) {    // for each 문 
			System.out.print(c + " ");
		}
	}

}
