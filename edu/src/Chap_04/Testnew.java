package Chap_04;

public class Testnew {
	public static void main(String[] args) {
		int [][] arrA = {{1,2,3},{4,5,6}};  // 2행 3열
		int [][] arrB = {{1,2},{3,4},{5,6}};  // 3행 2열
		int [][] arr_result=0;+-
		
		for (int i = 0; i < arrA.length; i++) {
			for (int j = 0; j < arrB.length; j++) {
				int [][] arr_result = arrA[i][j] + arrB[j][i];
			}
			System.out.println(arr_result);
		}
		
		
			
	}
	

}
