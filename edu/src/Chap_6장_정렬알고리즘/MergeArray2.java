package Chap_6장_정렬알고리즘;

import java.util.Scanner;

public class MergeArray2 {

//정렬을 완료한 배열의 병합

		static int[] buff; // 작업용 배열
		
//--- 배열 a에 정렬한 결과를 return ---//
		static void merge(int[] a, int left1, int right1, int left2, int right2) {
			buff = new int[right1-left1+1];
			int i;
			for (i = left1; i <= right1; i++)
				buff[i-left1] = a[i];//앞단 복사하기
			int j = 0, p = right1-left1+1;
			int k = left1;
			while (i <= right2 && j < p) {
				a[k++] = (buff[j] <= a[i]) ? buff[j++]: a[i++];
			}
			while (j < p)
				a[k++] = buff[j++];
			
			
//{2,4,6,8,11,13}과 {1,3,5,7,9,16,21}을 합병하여 정렬 결과를 만드는 코드를 작성
		}

		static void showData(int[] d) {
			System.out.println();	
			for (int i = 0; i < d.length; i++)
				System.out.print(d[i] + " ");
			System.out.println();
		}

		public static void main(String[] args) {
			Scanner stdIn = new Scanner(System.in);
			int[] a = { 2, 4, 6, 8, 11, 13, 1, 3, 5, 7, 9, 16, 21 };

			System.out.println("배열 a: ");
			showData(a);
			merge(a, 0, 5, 6, 12);

			System.out.println();
			System.out.println("합병후: ");
			showData(a);

		}
	}
