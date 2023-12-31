package Chap_04;

import java.util.Scanner;

public class Test37_1 {
	public static void main(String[] args) {
//		int[] score = { 90, 85, 78, 100, 98};
		
		Scanner sc = new Scanner(System.in);    // Scanner 사용법 공부

		// System.in : 키보드를 직접 제어하고 키 입력을 받는 표준 입력 스트림 객체, 키 값을 바이트(문자x) 로 리턴
		// System.in 을 사용할 때 문제점 : 키 값을 바이트 데이터로 넘겨주므로 응용 프로그램이 문자 정보로 변환해야함
		// Scanner 클래스에서 키보드에 입력된 키를 문자나 정수, 실수, 문자열 등 사용자가 원하는 타입으로 변환시켜준다.
		// Scanner : 응용 프로그램이 키 입력을 쉽게 받을 수 있도록 자바 패키지에서 제공하는 클래스

		
		int [] score = new int[5];
		
		
		
		for (int i = 0; i < score.length; i++) {
			System.out.println("점수(" + (i+1) + "/" + score.length + ") : ");
			score[i] = sc.nextInt();
		}
		
		
		int sum = 0;       // 총점
		double avg = 0.0;  // 평균
		int max = 0;       //최댓값 : 최대값 구할때는 비교했을 때 제일 작은 수 
		int min = 999;     //최솟값 : 최솟값 구할때는 비교했을 때 제일 큰 수
 		
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
			if(max < score[i])
				max = score[i];
			if(min > score[i])
				min = score[i];
		}
		
		avg = sum / score.length;
		System.out.println("총  점 : " + sum);
		System.out.println("평  균 : " + avg);
		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : " + min);
	
	}
}