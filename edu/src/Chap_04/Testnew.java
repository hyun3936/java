package Chap_04;

public class Testnew {
	public static void main(String[] args) {
		int[][] arrA = { { 1, 2, 3 }, { 4, 5, 6 } }; // 2행 3열
		int[][] arrB = { { 1, 2 }, { 3, 4 }, { 5, 6 } }; // 3행 2열

		for (int i = 0; i < arrA.length; i++) {
			for (int j = 0; j < arrB[0].length; j++) {
				int sum = 0;
				for (int k = 0; k < arrB.length; k++) {
					sum += (arrA[i][k] * arrB[k][j]);
				}
				System.out.println(sum + "\t");
			}
			System.out.println("\n");
		}
	}
}