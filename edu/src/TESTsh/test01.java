package TESTsh; // 24개의 원소를 가지는 정수형 1차원 배열을 선언해서 랜덤으로 값을 입력

import java.util.Arrays;
import java.util.Random;

class Matrix {
	// public Matrix(int [] array, int s, int r, int c) {
		// Matrix A1 = new Matrix(array, s, r, c);
		
//	s : start index
//	r : row (행)
//	c : column (열)
//	}
	
	
	
}

public class test01 {

	public static void sortArray(int[] arr) {
		Arrays.sort(arr); // 배열 정렬
	}

	public static void main(String[] args) {
		// 데이터 생성
		Random rd = new Random();
		// 1. 입력된 배열 출력 & 오름차순으로 정렬한 뒤 출력 		
		
		int [] array = new int[24];
		for (int i = 0 ; i < 24; i++) {
			array[i] = rd.nextInt(101);
		}
		System.out.println(Arrays.toString(array));
		
		// 배열 정렬 & 출력
		sortArray(array);

		System.out.println(Arrays.toString(array));
		
		
		
		// 2. 배열을 3by4 A1행렬과 3by4 B1행렬로 만들어서 행렬 합을 구한 뒤 출력				
//		// 행렬 생성
//		Matrix A1 = new Matrix(array, 0, 3, 4);  // 0은 start index, 3은 row(행), column(열)
//		Matrix B1 = new Matrix(array, 0, 3, 4);
		
		// 이풀이는 Matrix를 만들어푼게 아니라 배열로 만들어 푼거. 문제취지랑 다름.
		
		int [][] A1 = new int[3][4];
		int [][] B1 = new int[3][4];
		
		int idx = 0;
		
		for (int i = 0; i < A1.length; i++) {
			for (int j = 0; j < A1[i].length; j++) {
				A1[i][j] = array[idx++];
			}
		}
		
		for (int i = 0; i < B1.length; i++) {
			for (int j = 0; j < B1[i].length; j++) {
				B1[i][j] = array[idx++];
			}
		}
		
		System.out.println(Arrays.deepToString(A1));
		System.out.println(Arrays.deepToString(B1));
		
		
		
		// 행렬합
//		System.out.println("행렬 합을 출력합니다.");
//		Matrix mC = Matrix.sum(A1, B1);
//		if (mC != null) mC.print();
//		
int [][] sum = new int[3][4];
		
		for (int i = 0; i < B1.length; i++) {
			for (int j = 0; j < B1[i].length; j++) {
				sum[i][j] = A1[i][j] + B1[i][j];
			}
		}
		System.out.println(Arrays.deepToString(sum));
		
		
//		Matrix mB = new Matrix(array, 12, 3, 4);
//		mB.print();
//		
//		
//		
	
//		
//		
//		// 행렬 생성
//		Matrix mD = new Matrix(array, 0, 4, 3);
//		mD.print();
//		
//		
		
		
		
		
		//3.배열을 3by4 A2행렬과 4by3 B2행렬로 만들어서 행렬 곱을 구한 뒤 출력
		
		// 행렬곱 계산
//		for (int i = 0; i < arrA.length; i++) {
//			for (int j = 0; j < arrB[0].length; j++) {
//				int sum = 0;
//				for (int k = 0; k < arrB.length; k++) {
//					sum += (arrA[i][k] * arrB[k][j]);
//				}
//				System.out.print(sum + "\t");  //println이 아니고 그냥 print
//			}
//			System.out.println("\n");
//		}
//		
		
		int [][] A2 = new int[3][4];
		int [][] B2 = new int[4][3];
		
		
		
int [][] mt = new int[3][4];
		
		for (int i = 0; i < B1.length; i++) {
			for (int j = 0; j < B1[i].length; j++) {
				sum[i][j] = A1[i][j] + B1[i][j];
			}
		}
		System.out.println(Arrays.deepToString(sum));
		
		
		
		
		
		
		//4.배열을 4by3 A3행렬과 3by4 B3행렬로 만들어서 행렬 곱을 구한 뒤 출력
		
	}

}
