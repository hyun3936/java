package Chap_6장_정렬알고리즘;

import java.util.Scanner;

public class MergeBook {
	static int[] buff; // 작업용 배열
	
	// a[left] ~ a[right]를 재귀적으로 병합 정렬
	static void __mergeSort(int[] a, int left, int right) {
		if (left < right) {
			int i;
			int center = (left + right) / 2;
			int p = 0;
			int j = 0;
			int k = left;
			
			
			__mergeSort(a, left, center); // 배열의 앞부분을 병합 정렬
			__mergeSort(a, center + 1, right); // 배열의 뒷부분을 병합 정렬
					
			for (i = left; i <= center; i++)
				buff[p++] = a[i];
			
			while (i <= right && j < p)
				a[k++] = (buff[j] <= a[i]) ? buff[j++] : a[i++];
			
			while (j<p)
				a[k++] = buff[j++];
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		
		
		
		
		
		
	}
}
