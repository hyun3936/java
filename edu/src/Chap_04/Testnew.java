package Chap_04;

public class Testnew {
	public static void main(String[] args) {
		int[][] arrA = { { 1, 2, 3 }, { 4, 5, 6 } }; // 2행 3열
		int[][] arrB = { { 1, 2 }, { 3, 4 }, { 5, 6 } }; // 3행 2열
		
//		// 행렬 A 선언
//		int[][] A = new int[2][3];
//		int numA = 1;
//		for (int i = 0; i < A.length; i++) {
//			for (int j = 0; j < A[i].length; j++) {
//				A[i][j] = numA++;
//			}
//		}
//		// 행렬 B 선언
//		int[][] B = new int[3][2];
//		int numB = 1;
//		for (int i = 0; i < B.length; i++) {
//			for (int j = 0; j < B[i].length; j++) {
//				B[i][j] = numB++;
//			}

		
		// 행렬곱 계산
		for (int i = 0; i < arrA.length; i++) {
			for (int j = 0; j < arrB[0].length; j++) {
				int sum = 0;
				for (int k = 0; k < arrB.length; k++) {
					sum += (arrA[i][k] * arrB[k][j]);
				}
				System.out.print(sum + "\t");  //println이 아니고 그냥 print
			}
			System.out.println("\n");
		}
	}
}