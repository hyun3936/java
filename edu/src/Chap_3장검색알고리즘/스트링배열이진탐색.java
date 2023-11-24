package Chap_3장검색알고리즘;

//3장 - 1번 실습 과제 > 2번 실습: 스트링 객체의 정렬과 이진 탐색 > 3번 실습: 객체 정렬과 이진 탐색
//comparator 구현 실습
import java.util.Arrays;

public class 스트링배열이진탐색  {

	static void sortData(String[] data) {
		for (int i = 0; i < data.length; i++)
			for(int j = i + 1; j < data.length; j++) 
				if(data[i].compareTo(data[j]) > 0)  {
					String temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}		
}

	static void showData(String[] arr) {
		for (String st : arr)
			System.out.print(st + " ");
	};
	
	static int linearSearch(String[] d, String key) {
		for (int i =0; i<d.length; i++)
			if (key == d[i])
				return i;
		return -1;
	}
	
	static int binarySearch(String[] d, String key){
		int start = 0;
		int end = d.length-1;
		do {
			int mid = (start+end)/2;
			int cmp = key.compareTo(d[mid]);
			if(cmp==0)
				return mid;
			else if (cmp<0)
				end = mid - 1;
			else
				start = mid + 1;
		}while(start<=end);
		return -1;
	}

	
	
	public static void main(String[] args) {
		String[] data = { "apple", "grape", "persimmon", "감", "배", "사과", "포도", "pear", "blueberry", "strawberry",
				"melon", "oriental melon" };
		
		showData(data);
		System.out.println();
		sortData(data);
		showData(data);
		
		String key = "감";
		int result = linearSearch(data, key);
		System.out.println("\nlinearSearch(): key = '" + key + "', result = '" + result+"'");

		key = "배";
		result = binarySearch(data, key);
		System.out.println("\nbinarySearch(): key = '" + key + "', result = '" + result+"'");
		
		int idx = Arrays.binarySearch(data, key);
		System.out.println("\nArrays.binarySearch(): key = '" + key + "', result = '" + idx+"'");

	}

}
