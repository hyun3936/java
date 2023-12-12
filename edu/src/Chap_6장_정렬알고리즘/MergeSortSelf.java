package Chap_6장_정렬알고리즘;

import java.util.Scanner;

public class MergeSortSelf {

//정렬을 완료한 배열의 병합

		static int[] buff; // 작업용 배열
		

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
			
			
			static void __mergeSort(int[] a, int left, int right) {
				if (left < right) {
					int i;
					int center = (left + right) / 2;
					int p = 0;
					int j = 0;
					int k = left;
					
					
					__mergeSort(a, left, center); // 배열의 앞부분을 병합 정렬
					__mergeSort(a, center + 1, right); // 배열의 뒷부분을 병합 정렬		
				}
			}
			

		static void showData(int[] d) {
			System.out.println();	
			for (int i = 0; i < d.length; i++)
				System.out.print(d[i] + " ");
			System.out.println();
		}

		// 병합 정렬
		static void mergeSort(int[] a, int n) {
			buff = new int[n]; // 작업용 배열을 생성
			
			__mergeSort(a, 0, n - 1); // 배열 전체를 병합 정렬
			 
			buff = null; // 작업용 배열을 해제
		}
		
		
		public static void main(String[] args) {
			Scanner stdIn = new Scanner(System.in);
			
			System.out.println("병합 정렬");
			System.out.print("요솟수: ");
			int nx = stdIn.nextInt();
			int[] x = new int[nx];
			
			for (int i = 0; i < nx; i++) {
				System.out.print("x["+i+"]: ");
				x[i] = stdIn.nextInt();
			}
			
			mergeSort(x, nx); // 배열 x를 병합 정렬
			
			System.out.println("오름차순으로 정렬했습니다.");
			for(int i = 0; i < nx; i++)
				System.out.println("x[" +i+ "]=" + x[i]);
			
			

			System.out.println("배열 a: ");
			showData();
			merge(x, 0, 5, 6, 12);

			System.out.println();
			System.out.println("합병후: ");
			showData(x);

		}
	}
