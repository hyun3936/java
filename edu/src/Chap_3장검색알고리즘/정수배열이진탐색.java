package Chap_3장검색알고리즘;

//3장 - 1번 실습 과제 > 2번 실습: 스트링 객체의 정렬과 이진 탐색 > 3번 실습: 객체 정렬과 이진 탐색
//comparator 구현 실습
import java.util.Arrays;
import java.util.Random;

public class 정수배열이진탐색 {
	static void inputData(int[] data) {
		// 난수 생성 입력
		Random rd = new Random();
		for (int i = 0; i < data.length; i++) {
			data[i] = rd.nextInt(20); // .nextInt 선택할때 그냥 Int하면 엄청큰수가 나올 수있다. but, bound를 선택하면 10입력하면 10이하의 수만 나옴.
		}
	}

	static void showData(int[] data) {
		for (int st : data) // for(변수선언 : 배열 변수명)
			System.out.print(st + " "); // 실행문;
	}

	static int sortData(int[] data) {
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length; j++) {
				if (data[i] < data[j]) {
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
		return 0;
	}

	static int linearSearch(int[] data, int key) {
		for (int i = 0; i < data.length; i++) {
			if (key == data[i]) {
				System.out.println("찾았습니다.");
				return i;// 검색 성공(인덱스를 반환) // 여기서 break를 쓰면 다음줄이 실행되니까, 여기서 끝내게 그냥 return. void라 반환값은 따로
							// 없음.
			}
		}
		System.out.println("없습니다.");
		return -1; // 검색실패(-1을 반환)
	}

	private static int binarySearch(int[] data, int key) {
		// 요솟수가 n개인 배열 a에서 key와 같은 요소를 이진 검색
		int pl = 0;
		int pr = data.length - 1;

		do {
			int pc = (pl + pr) / 2;
			System.out.println(data[pc] + " " + " pc = " + pc);
			if (data[pc] == key)
				return pc; // 검색 성공!
			else if (data[pc] < key)
				pl = pc + 1; // 검색 범위를 뒤쪽 절반으로 좁힘
			else
				pr = pc - 1; // 검색 범위를 앞쪽 절반으로 좁힘
		} while (pl <= pr);

		return -1; // 검색 실패!
	}

	public static void main(String[] args) {

		int[] data = new int[10];
		inputData(data);
		System.out.println();
		showData(data);
		System.out.println();
		sortData(data);
		System.out.println();
		for (int num : data) {
			System.out.print(num + " ");
		}
		int key = 3;
		int result = linearSearch(data, key);
		System.out.println("\nlinearSearch(): result = " + result);

		key = 3;
		int result2 = binarySearch(data, key);
		System.out.println("\nbinarySearch(): result = " + result2);
		
		int idx = Arrays.binarySearch(data, key);
		System.out.println("\nArrays.binarySearch(): result = " + idx);
	}
}