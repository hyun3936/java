package Chap_3장검색알고리즘;

import java.util.Arrays;

//5번 실습 - 2장 실습 2-14를 수정하여 객체 배열의 정렬 구현
class PhyscData implements Comparable<PhyscData> {
	String name;
	int height;
	double vision;

	public PhyscData(String name, int i, double d) {
		this.name = name;
		this.height = i;
		this.vision = d;
	}

	@Override
	public int compareTo(PhyscData o) {
		if (height - o.height == 0)
			if (vision - o.vision == 0.0)
				return name.compareTo(o.name);
			else
				return (int) Math.ceil(vision - o.vision);
		/*
		 * 자바에서 ceil 함수는 주어진 실수(double 또는 float)를 올림하여 그보다 크거나 같은 정수로 반환하는 함수입니다. 이 함수는
		 * Math 클래스에 속해 있습니다.
		 */
		return height - o.height;
	}

}

public class 객체배열이진탐색 {
	static void sortData(PhyscData[] data) {
		for (int i = 0; i < data.length; i++)
			for (int j = i; j < data.length; j++)
				if (data[i].compareTo(data[j]) > 0) {
					PhyscData temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				} 
	}

	static void showData(PhyscData[] arr) {
		System.out.println();
		for (PhyscData p : arr) {
			System.out.println(p.name + ": \t(" + p.height + " " + p.vision + ")");
		}
		System.out.println();
	}
	
	static String showData(PhyscData p) {
		return p.name+": \t(" + p.height+" "+p.vision+")";
	}

	static int linearSearch(PhyscData[] data, PhyscData key) {
		for (int i = 0; i < data.length; i++) {
			if (key.compareTo(data[i]) == 0)
				return i;
		}
		return -1;
	}
	

	
	private static int binarySearch(PhyscData[] data, PhyscData key) {
		int start = 0;
		int end = data.length;
		do {
			
			/*
			  >>> : 부호 없는 오른쪽 시프트 연산자를 사용하여 비트를 오른쪽으로 1만큼 이동시킵니다.
			   이는 나누기 2와 같은 효과를 가집니다.
				따라서, (start + end) >>> 1은 (start + end) / 2의 연산과 동등합니다.
			 */
			
			int mid = (start + end) >>> 1;
			int cmp = key.compareTo(data[mid]);
			if(cmp == 0)
				return mid;
			else if (cmp < 0)
				end = mid -1;
			else
				start = mid + 1;
		}while(start <= end);
		return -1;
	}


	public static void main(String[] args) {
		PhyscData[] data = { new PhyscData("홍길동", 162, 0.3),
							new PhyscData("홍동", 164, 1.3),
							new PhyscData("홍길", 152, 0.7),
							new PhyscData("김홍길동", 172, 0.3),
							new PhyscData("길동", 182, 0.6),
							new PhyscData("길동", 167, 0.2),
							new PhyscData("길동", 167, 0.5),
							};
		showData(data);
		System.out.println("-".repeat(50));
		sortData(data);
		showData(data);
		
		System.out.println("-".repeat(50));
		
		PhyscData key = new PhyscData("길동", 167, 0.2);
		int result = linearSearch(data, key);
		String strkey = showData(key);
		System.out.println("\nlinearSearch(): '"+ strkey + "' at " + result);
		

		key = new PhyscData("길동", 167, 0.5);
		strkey = showData(key);

		result = binarySearch(data, key);
		System.out.println("\nbinarySearch(): '"+ strkey + "' at " + result);
		
		int idx = Arrays.binarySearch(data, key);
		System.out.println("\nArrays.binarySearch():'"+ strkey + "' at " + idx);
	}

}
