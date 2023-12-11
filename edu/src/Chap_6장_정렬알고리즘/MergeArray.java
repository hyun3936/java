package Chap_6장_정렬알고리즘;

import java.util.Scanner;

public class MergeArray {
	static void merge(int [] a, int left1 , int right1, int left2, int right2) {

		int pa = left1;
		int pb = left2;
		int pc = 0;

		while (pa < left1 && pb < left2)
			a[pc++] = (a[pa] <= a[pb]) ? a[pa++] : a[pb++];
	}
		
	 
	class PhyscData{
		String name;
		int height;
		double vision;
		
		public PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}
	
	
	class MergeSort {
		static int[] buff; // 작업용 배열
		//MergeSort() 구현 소스 코드를 사용하여 객체들의 정렬 소스코드로 수정한다.
		

			// --- 배열 요소 a[idx1]와 a[idx2]의 값을 교환 ---//
			static void merge(int[] a, int left, int right ) {
				if(left < right) {
					int i;
					int center = (left + right) / 2;
					int p = 0;
					int j = 0;
					int k = left;
					
					merge(a, left, center); // 배열의 앞부분을 병합 정렬
					merge(a, center + 1, right); // 배열의 뒷부분을 병합 정렬
					
					for (i = left; i <= center; i++)
						buff[p++] = a[i];
					
					while (i <= right && j < p)
						a[k++] = (buff[j] <= a[i]) ? buff[j++]: a[i++];
					
					while (j < p)
						a[k++] = buff[j++];
				}
			}

			// --- 퀵 정렬(비재귀 버전)---//
			static void MergeSort(PhyscData[] a, int left, int right) {
				int mid = (left+right)/2;
				if (left == right) return;
				MergeSort(a, left, mid);
				MergeSort(a, mid+1, right);
				merge(a, left, mid, mid+1, right);
				return;
			}

			public static void main(String[] args) {
				PhyscData[] x = {
				         new PhyscData("강민하", 162, 0.3),
				         new PhyscData("김찬우", 173, 0.7),
				         new PhyscData("박준서", 171, 2.0),
				         new PhyscData("유서범", 171, 1.5),
				         new PhyscData("이수연", 168, 0.4),
				         new PhyscData("장경오", 171, 1.2),
				         new PhyscData("황지안", 169, 0.8),
				     };
				int nx = x.length;

				   MergeSort(x, 0, nx - 1); // 배열 x를 퀵정렬
					System.out.println("오름차순으로 정렬했습니다.");
				     System.out.println("■ 신체검사 리스트 ■");
				     System.out.println(" 이름     키  시력");
				     System.out.println("------------------");
				     for (int i = 0; i < x.length; i++)
				         System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
			}
		}

		
//정렬을 완료한 배열의 병합

//--- 정렬을 마친 배열 a, b를 병합하여 배열 c에 저장 ---//

	static void showData(int[] d) {
		System.out.println();
		for (int i = 0; i < d.length; i++)
			System.out.print(d[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[] a = {2, 4, 6, 8, 11, 13, 1, 2, 3, 4, 9, 16, 21 };

		System.out.println("두 개의 배열을 병합");

		merge(a, 0, 5, 6, 12); // 배열 a와 b를 병합하여 c에 넣어 둠

		System.out.println("배열 a의 일부를 병합하여 배열 a에 저장했습니다.");
		System.out.println("병합 후 배열 a: ");
		showData(a);
	}
}
