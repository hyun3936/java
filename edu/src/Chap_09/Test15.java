package Chap_09;

import java.util.Arrays;
import java.util.Random;

public class Test15 {
	public static void main(String[] args) {

		int[] data = new int[6]; // 배열 선언

		Random r2 = new Random();

		for (int i = 0; i < 6; i++) { // 번호 갯수 6개
			data[i] = r2.nextInt(45) + 1; // 로또번호 1 ~ 45
											// 같은 번호 중복을 없애려면?
		}

		for (int num : data)
			System.out.print("  " + num);

			System.out.println(); // 윗줄 아랫줄 비교하기위해 한줄 뛰우기

		Arrays.sort(data); // 정렬(오름차순)
		for (int num : data)

			System.out.print("  " + num);

		System.out.println();
		System.out.println(Arrays.toString(data)); // toString을 쓰면 []로감싸서 ,와 배열모양으로 이쁘게나옴
	}
}
