package Chap_04;

import java.util.Scanner;

public class Test32 {

//	public static void main(String[] args) {
//		int[] arr = new int [5];
//		arr[0] = 10; // arr의 0번지에 10 저장
//		arr[1] = 20; // arr의 0번지에 20 저장
//		arr[2] = 30; // arr의 0번지에 30 저장
//		arr[3] = 40; // arr의 0번지에 40 저장
//		arr[4] = 50; // arr의 0번지에 50 저장
//		
//		System.out.println(arr[0]);  // arr의 0번지 값 출력
//		System.out.println(arr[1]);  // arr의 1번지 값 출력
//		System.out.println(arr[2]);  // arr의 2번지 값 출력
//		System.out.println(arr[3]);  // arr의 3번지 값 출력
//		System.out.println(arr[4]);  // arr의 4번지 값 출력
//		
//		System.out.println("-".repeat(20));
//		
//		for (int i = 0 ; i < 5; i++) {
//			System.out.println(arr[i]);			
//		}
//	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[3];

		System.out.println("국어점수 : ");
		arr[0] = sc.nextInt();

		System.out.println("영어점수 : ");
		arr[1] = sc.nextInt();

		System.out.println("수학점수 : ");
		arr[2] = sc.nextInt();

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		int avg = (arr[0] + arr[1] + arr[2]) / 3;
		System.out.println("평균은 " + avg);
		
		
		System.out.println("확장된 for");
		for(int i : arr) {
			System.out.println(i);
		}

	}
}