package Chap_10; // 컬렉션 API 활용하기

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// 100개의 정수를 랜덤하게 생성 (0 ~ 100사이), 
// ArrayList에 입력해서 출력하세요 (전체 값 출력, 평균, 합, 최대, 최소)

public class Test_Collection {
	public static void main(String[] args) {
		// 코딩하기전에 말로 적어놓고 코딩하기.
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int sum = 0;
		int avg = 0;

		// 값을 담을 리스트 참조변수 생성
		List<Integer> list = new ArrayList<>();
		Random random = new Random();
		
		// 리스트에 100개의 정수를 랜덤으로 저장
		for (int i = 0; i < 100; i++) {
			int v = random.nextInt(101); // 0부터 100까지
			list.add(v);
		}	
		
		// 100개의 정수값을 읽으면서 최대, 최소, 평균, 합을 구함
		
//		int min = list.get(0);
//		int max = list.get(0);
//		int sum = list.get(0);
		
		
		
		for (int i = 0; i < list.size(); i++) {
//			max = (max < list.get(i)) ? list.get(i) : list.get(max);
			if (max < list.get(i)) max = list.get(i);
			if (min > list.get(i)) min = list.get(i);
			sum += list.get(i);
		}
       // int avg = sum / list.size();  // 이렇게 변수 선언하는건 중간중간에 하지말고 메소드 젤위에 모아서 하는게 좋음.
		avg = sum / list.size();
		
		// 구한 값을 출력
		System.out.println("합 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("최대 : " + max);
		System.out.println("최소 : " + min);
		System.out.println(list);
	}
}
