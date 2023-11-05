package Chap_04;
public class Test38 { //2차원 배열 - 행렬
	public static void main(String[] args) {
		
		// 배열의 값 설정
		int[][] arr = new int [5][5];
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
	}
}
