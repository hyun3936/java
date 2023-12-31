package Chap_13;

import java.util.Arrays;
import java.util.Random;

public class 정수배열정렬 {
	public static void main(String[] args) {
	
			int [] data = new int[20]; // 크기가 20인 정수 배열 생성
			
			Random rnd = new Random();  // 난수 생성을 위한 Random 객체 생성
			
			for (int i = 0; i < data.length; i++) // 배열에 난수 할당
				data[i]= rnd.nextInt();
			
			
			  // 배열 정렬
			Arrays.sort(data); //Arrays 클래스의 sort 메서드를 사용하여 주어진 배열 data를 기본 정렬 순서(오름차순)로 정렬합니다.
			
			//정렬된 배열 출력
			for (int value : data) {
	            System.out.println(value);
			}
	
		}
}