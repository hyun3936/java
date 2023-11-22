package Chap_3장검색알고리즘;

//3장 - 1번 실습 과제 > 2번 실습: 스트링 객체의 정렬과 이진 탐색 > 3번 실습: 객체 정렬과 이진 탐색
//comparator 구현 실습
import java.util.Arrays;
import java.util.Comparator;

public class 스트링배열이진탐색 {

	static void sort(String[] data) {
		for (int i = 0; i < data.length; i++)
			for(int j = i + 1; j < data.length; j++) {
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

	static void sortData(String []data) {
		
			}
	
	
	public static void main(String[] args) {
		String[] data = { "apple", "grape", "persimmon", "감", "배", "사과", "포도", "pear", "blueberry", "strawberry",
				"melon", "oriental melon" };
		
		showData(data);
		sortData(data);
		String key = "감";
		int result = linearSearch(data, key);
		System.out.println("\nlinearSearch(): result = " + result);

		key = "배";
		result = binarySearch(data, key);
		System.out.println("\nbinarySearch(): result = " + result);
		int idx = Arrays.binarySearch(data, key);
		System.out.println("\nArrays.binarySearch(): result = " + result);

	}

}
