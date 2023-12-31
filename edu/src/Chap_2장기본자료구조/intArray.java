package Chap_2장기본자료구조;

import java.util.Random;
import java.util.Scanner;


public class intArray {
	static void sort(int [] arr){
		for(int i = 0; i < arr.length ; i++)
			for(int j = i + 1; j < arr.length; j++){
				if (arr[i] < arr[j]) {
				int	temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}  //bubble sort ??
	}
	
	
	static int maxOf(int[] a) {  //  함수 호출, 매개변수 전달 => 배열이름 그대로쓴다, return값의 타입
		int max = a[0];
		for (int i = 1; i < a.length; i++)
			if(a[i] > max)
				max = a[i];
		return max;
		
	} // 배열 요소 중 제일 큰값 ?
	
	
	public static void main(String[] args) { 
		Random rnd = new Random(); // 랜덤 변수 rnd
		Scanner std = new Scanner(System.in); // 입력 받을 값을 저장할 변수 std
		System.out.println("배열수:: "); 
		int num = std.nextInt(); // 5개 수를 입력받아 num 변수에 저장
		int [] a  = new int[num]; // 인트값을 가지는 인덱스 5개가 들어가는 배열 a 선언
		for (int i = 0; i < num; i++) { 
			a[i] = rnd.nextInt(100);
		}
		
		int result = maxOf(a); 
		
			System.out.print("최대값 : " + result + " "); // maxOf 함수를 이용해 제일 큰 인덱스값 출력
		System.out.println();
		
		
//		int [] b = {1,2,5,4,7};
		for(int n : a) // foreach문 쓰는법 익히기
			System.out.print(n + " ");
		
		System.out.println(); // 줄 바꿈. 윗줄은 정렬하기 전, 아랫줄은 정렬 후 
		

		sort(a);
		for(int n : a)
			System.out.print(n + " ");
	}
	
	
}
