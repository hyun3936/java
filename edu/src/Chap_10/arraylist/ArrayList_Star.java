package Chap_10.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;	// Scanner 클래스 호출


public class ArrayList_Star {  // ArrayList를 활용해 별만들기
	public static void main(String[] args) {
		
		// Scanner 객체로 생성해서 반복값 입력
		Scanner sc = new Scanner(System.in); // Scanner 객체 생성
//		int repeat = 5; // 테스트로 5로 일단 설정해서 작업

		System.out.print("갯수를 입력해주세요 : ");
		int repeat = sc.nextInt(); // 진법; 스캐너는 next--, 스캐너로 입력받은값을 r으로 받음.
		

		//ArrayList 객체 생성
		List<String> star = new ArrayList<>();

		// 저장할 문자열을 생성해서 ArrayList에 저장
		

			// repeat 횟수만큼 반복 (for loop)
		
//		for (int i = 0; i < repeat; i++){
//			star.add("*".repeat(repeat));	
//		}
//		
	
		for (int i = 0; i <= repeat; i++){
			StringBuffer s = new StringBuffer();
			for (int j = 0; j < i; j++) {
				s.append("*");
			}	
			star.add(s.toString());
		}
		

		// ArrayList저장된 문자열을 출력
		for (int i = 0; i < star.size(); i++) {
			System.out.println(star.get(i));
		}
		System.out.println("-".repeat(30));
		star.forEach(s->System.out.println(s));
	}

}
