package Chap_6장_정렬알고리즘;

import java.util.Scanner;

public class MergeArray {

}

//정렬을 완료한 배열의 병합

class 실습6_11MergeArray {
//--- 정렬을 마친 배열 a, b를 병합하여 배열 c에 저장 ---//
	static void merge(int[] a, int na, int[] b, int nb, int[] c) {

	}

	static void showData(int[] d) {
		System.out.println();
		for (int i = 0; i < d.length; i++)
			System.out.print(d[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[] a = { 2, 4, 6, 8, 11, 13 };
		int[] b = { 1, 2, 3, 4, 9, 16, 21 };
		int[] c = new int[13];

		System.out.println("두 개의 배열을 병합");

		merge(a, a.length, b, b.length, c); // 배열 a와 b를 병합하여 c에 넣어 둠

		System.out.println("배열 a와 b를 병합하여 배열 c에 저장했습니다.");
		System.out.println("배열 a: ");
		showData(a);
		System.out.println();
		System.out.println("배열 b: ");
		showData(b);
		System.out.println();
		System.out.println("배열 c: ");
		showData(c);

	}
}
