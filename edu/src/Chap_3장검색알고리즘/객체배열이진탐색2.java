package Chap_3장검색알고리즘;

//3장 객체 배열 정렬 - binary search
/*
* Comparator를 사용하는 방법
* MyComparator implements Comparator<>
* MyComparator myComparator = new MyComparator();
* Arrays.sort(array, myComparator);
* Collections.sort(list, myComparator);
*/

import java.util.Arrays;
import java.util.Comparator;

//-------------------------------------------------------------------------------------
class Fruit3 {
	String name;
	int price;
	String expire;

	public Fruit3(String name, int price, String expire) {
		this.name = name;
		this.price = price;
		this.expire = expire;
	}

	@Override
	public String toString() {
		return "<" + name + ", " + price + ", " + expire + ">";
	}

	public int getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

	// -------------------------------------------------------------------------------------
//	public int compare(Fruit3 f1, Fruit3 f2) {
//		if (f1.name.compareTo(f2.name) == 0)
//			if (f1.price - f2.price == 0)
//				return f2.expire.compareTo(f1.expire);
//			else
//				return f1.price - f2.price;
//		return f1.name.compareTo(f2.name);
//	}
}
//-------------------------------------------------------------------------------------

//-------------------------------------------------------------------------------------
public class 객체배열이진탐색2 {

//		private static void sortData(Fruit3[] arr, Comparator<Fruit3> cc_price) {
//			// 구현
//		}

	static void swap(Fruit3[] arr, int ind1, int ind2) {
		Fruit3 temp = arr[ind1];
		arr[ind1] = arr[ind2];
		arr[ind2] = temp;
	}

	static void sortData(Fruit3[] arr, Comparator<? super Fruit3> c2) {
		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr.length; j++) {
				if (c2.compare(arr[i], arr[j]) < 0) {
					swap(arr, i, j);
				}
			}
	}

	static void showData(Fruit3[] arr) {
		System.out.println();
		for (Fruit3 fx : arr) {
			System.out.print(fx + " ");
		}
		System.out.println();
	}

	// 교재 111 페이지 참조하여 구현
	static int binarySearch(Fruit3[] a, Fruit3 f, Comparator<Fruit3> cc) {
		// 구현
		int n = a.length;
		// key대신에 f
		// 비교하는거 cc.~

		int pl = 0; // 검색 범위의 첫 인덱스
		int pr = n - 1; // 검색 범위의 끝 인덱스

		do {
			int pc = (pl + pr) / 2; // 중앙 요소의 인덱스
			int cmpResult = cc.compare(a[pc], f);

			if (cmpResult == 0) {
				return pc; // 검색 성공!
			} else if (cmpResult < 0) {
				pl = pc + 1; // 검색 범위를 뒤쪽 절반으로 좁힘
			} else {
				pr = pc - 1; // 검색 범위를 앞쪽 절반으로 좁힘
			}
		} while (pl <= pr);

		return -1; // 검색 실패!
	}

	// name으로 정렬
	static class CompName implements Comparator<Fruit3> {
		@Override
		public int compare(Fruit3 f1, Fruit3 f2) {
			return f1.name.compareTo(f2.name);
		}
	}

	// price으로 정렬
	static class CompPrice implements Comparator<Fruit3> {
		@Override
		public int compare(Fruit3 f1, Fruit3 f2) {
			return (f1.price - f2.price);  // 음수가 나오면 오버플로우가 날 수 있기때문에 이를 방지
			
						
		}
	}

	// expire으로 정렬
	static class CompExpire implements Comparator<Fruit3> {
		@Override
		public int compare(Fruit3 f1, Fruit3 f2) {
			return f1.expire.compareTo(f2.expire);
		}
	}
//		
//		Comparator<Fruit3> cc_name = new Comparator<Fruit3>() {// 익명클래스 사용
//
//			// 구현
//
//		};
//		Comparator<Fruit3> cc_price = new Comparator<Fruit3>() {
//
//			// 구현
//
//		};

//-------------------------------------------------------------------------------------
	public static void main(String[] args) {

		Fruit3[] arr = { new Fruit3("사과", 200, "2023-5-8"), new Fruit3("키위", 500, "2023-6-8"),
				new Fruit3("오렌지", 200, "2023-7-8"), new Fruit3("바나나", 50, "2023-5-18"),
				new Fruit3("수박", 880, "2023-5-28"), new Fruit3("체리", 10, "2023-9-8") };

		System.out.println("-".repeat(50) + "정렬전 객체 배열 " + "-".repeat(50)); 
		showData(arr);

		CompName cc_name = new CompName(); // name으로 정렬
		CompPrice cc_price = new CompPrice(); // price으로 정렬
		CompExpire cc_expire = new CompExpire(); // expire으로 정렬

		Arrays.sort(arr, cc_name);

		// name으로 정렬
		System.out.println();
		sortData(arr, cc_name);
		System.out.println("-".repeat(50) + "name으로 정렬" + "-".repeat(50));
		showData(arr);
		System.out.println();

		// price으로 정렬
		sortData(arr, cc_price);
		System.out.println("-".repeat(50) + "price으로 정렬" + "-".repeat(50));
		showData(arr);
		System.out.println();

		// expire으로 정렬
		sortData(arr, cc_expire);
		System.out.println("-".repeat(50) + "expire으로 정렬" + "-".repeat(50));
		showData(arr);
		System.out.println();
		System.out.println("-".repeat(120));
		
		
		// showData(arr);
		/*
		 * Arrays.sort(arr, (a, b) -> a.getPrice() - b.getPrice()); // Fruit3에
		 * compareTo()가 있어도 람다식 우선 적용 System.out.println("\n람다식 정렬(가격)후 객체 배열: ");
		 * showData(arr);
		 */
		// *
		Arrays.sort(arr, new Comparator<Fruit3>() {
			@Override
			public int compare(Fruit3 a1, Fruit3 a2) {
				return a1.getName().compareTo(a2.getName());
			}
		});
		System.out.println("\ncomparator 정렬(이름)후 객체 배열: ");
		showData(arr);
		// *

		Fruit3 newFruit3 = new Fruit3("체리", 500, "2023-5-18");
		int result3 = Arrays.binarySearch(arr, newFruit3, cc_name);

		System.out.println("\nArrays.binarySearch() 조회결과::" + result3);
		result3 = binarySearch(arr, newFruit3, cc_name);
		System.out.println("\nbinarySearch() 조회결과::" + result3);

		sortData(arr, cc_price);
		System.out.println("\ncomparator 정렬(가격)후 객체 배열: ");
		showData(arr);

		result3 = Arrays.binarySearch(arr, newFruit3, cc_price);
		System.out.println("\nArrays.binarySearch() 조회결과::" + result3);

		result3 = binarySearch(arr, newFruit3, cc_price);
		System.out.println("\nbinarySearch() 조회결과::" + result3);

		// */
//			static void showData(PhyscData[]arr) {
//			System.out.println();
//			for (PhyscData fruit: arr) {
//				System.out.print(fruit+" ");
//			}
//			System.out.println();
		// }
	}
}
