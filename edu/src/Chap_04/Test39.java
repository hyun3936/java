package Chap_04;

public class Test39 {
	public static void main(String[] args) {
		// 배열의 값 설정
		int[][] arr = new int[10][5];
		int num = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num++;
			}
		}

		// 배열에 설정된 값을 화면 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
				System.out.print("\t");
			}
			System.out.println("\n");
		}

		int sum = 0;

//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				if(i == j)
//					sum += arr[i][j];
//			}		
//		}

		for (int i = 0; i < arr.length && i < arr[0].length; i++) {
			sum += arr[i][i];
		}

		// 배열의 대각 합을 출력 (5*5 대각선) 오른쪽 대각선 순회
		System.out.println("합계 : " + sum);
	}

}
