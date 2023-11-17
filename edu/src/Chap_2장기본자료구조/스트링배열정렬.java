package Chap_2장기본자료구조;

import java.util.ArrayList;
import java.util.Arrays;

public class 스트링배열정렬 {
	
		public static void main(String[] args) {
			String []data = {"apple","grape","persimmon", "pear","blueberry", "strawberry", "melon", "oriental melon"};

			showData(data); 
			System.out.println();
			sortData(data);
			System.out.println();
			showData(data);
		}
		static void showData(String[]arr) {
//			for each 문
			for(String st : arr) // for(변수선언 : 배열 변수명)
				System.out.print(st + " "); // 실행문;
		}

		static void swap(String[]arr, int ind1, int ind2) {
			String temp = arr[ind1];
			arr[ind1] = arr[ind2];
			arr[ind2] = temp;
		}
		static void sortData(String []arr) {
		
//			Arrays.sort(Object); // 자바에서 제공하는 Arrays 클래스, sort메서드?
			// String인데 항목에 없어서 모든 값의 루트인 Object를 사용 
			
//			
			
			for(int i = 0; i < arr.length ; i++)
				for (int j = i + 1 ; j < arr.length; j++)
				{
					if(arr[i].compareTo(arr[j]) > 0  ) // 객체는 compareTo
						swap(arr, i, j);
				}
		}
	}

